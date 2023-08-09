package EjercicioActividadExtra3POO.service;

import Ejercicio7POO.Entidad.Persona;
import EjercicioActividadExtra3POO.Entidad.Cliente;

import java.util.ArrayList;

public class ClienteService {
    private static final ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void registrarCliente(Long id, String nombre, int edad, double altura, double peso, String objetivo) {
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setEdad(edad);
        cliente.setAltura(altura);
        cliente.setPeso(peso);
        cliente.setObjetivo(objetivo);
        clientes.add(cliente);
    }

    public String obtenerClientes() {
        String clienteTodos = "";
        for (Cliente cliente : clientes) {
            clienteTodos += cliente.getNombre() + " ";
        }
        return clienteTodos;
    }

    public void actualizarCliente(Long id, String nombre, int edad, double altura, double peso, String objetivo) {
        int indice = obtenerIndice(id);
        if (indice != -1) {
            Cliente cliente = new Cliente();
            cliente.setId(id);
            cliente.setNombre(nombre);
            cliente.setEdad(edad);
            cliente.setAltura(altura);
            cliente.setPeso(peso);
            cliente.setObjetivo(objetivo);
            clientes.set(indice, cliente);
            System.out.println("Actualizacion exitosa");
        } else {
            System.out.println("Indice no encontrado vuelta a intentar");
        }
    }

    public void eliminarCliente(Long id) {
        int indice = obtenerIndice(id);
        if (indice != -1) {
            System.out.println("Eliminacion de " + clientes.get(indice).getNombre() + " exitosa");
            clientes.remove(indice);
        } else {
            System.out.println("Indice no encontrado vuelta a intentar");
        }
    }

    public static int obtenerIndice(long id) {
        int indice = -1;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equals(id)) {
                indice = i;
                break;
            }
        }
        return indice;
    }

}
