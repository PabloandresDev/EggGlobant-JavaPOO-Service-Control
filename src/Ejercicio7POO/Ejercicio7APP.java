package Ejercicio7POO;

import Ejercicio7POO.Entidad.Persona;
import Ejercicio7POO.Service.PersonaService;

import static java.lang.String.valueOf;

public class Ejercicio7APP {
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        personaService.crearPersona("Carlos",23,"H",1.7f,1.9f);
        personaService.crearPersona("Pablo",5,"H",75f,1.78f);
        personaService.crearPersona("Mario",15,"H",1.7f,1.9f);
        personaService.crearPersona("Agustin",25,"H",1.7f,1.9f);
        personaService.mostrarValores();
        personaService.calcularIMC();
        personaService.esMayorDeEdad();
        System.out.println(personaService.mostrarResultados());
    }




}
