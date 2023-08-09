package EjercicioActividadExtra3POO;

import EjercicioActividadExtra3POO.Entidad.Cliente;
import EjercicioActividadExtra3POO.service.ClienteService;

public class main {
    public static void main(String[] args) {
        ClienteService clienteService=new ClienteService();
        clienteService.registrarCliente(1L,"Pablo",25,1.77,72,"Objetivo x1");
        clienteService.registrarCliente(2L,"Carlos",26,1.78,73,"Objetivo x2");
        clienteService.registrarCliente(3L,"Mario",27,1.79,74,"Objetivo x3");
        clienteService.registrarCliente(4L,"Andres",28,1.80,75,"Objetivo x4");
        System.out.println(clienteService.obtenerClientes());
        clienteService.actualizarCliente(2L,"Actualizado",26,1.78,73,"Objetivo Actualizado");
        System.out.println(clienteService.obtenerClientes());
        clienteService.eliminarCliente(2L);
        System.out.println(clienteService.obtenerClientes());
    }
}
