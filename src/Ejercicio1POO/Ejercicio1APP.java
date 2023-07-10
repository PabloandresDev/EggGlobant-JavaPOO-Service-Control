package Ejercicio1POO;

import Ejercicio1POO.Entidad.Libro;
import Ejercicio1POO.Service.LibroService;

public class Ejercicio1APP {
    public static void main(String[] args) {
        LibroService ls = new LibroService();
        Libro l1 = ls.crearLibro();
        // utilizando el metodo motrar libro una vez creado el objeto
        System.out.println(ls.mostrarDatosLibro(l1));
        System.out.println("l1 = " + l1.toString());
    }
}
