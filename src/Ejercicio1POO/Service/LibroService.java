package Ejercicio1POO.Service;

import Ejercicio1POO.Entidad.Libro;

public class LibroService {
    public Libro crearLibro(){
        return new Libro("1234","Cien años de soledad","Gabriel Garcia",200);
    }

    public String mostrarDatosLibro(Libro libro){
        return "ISBN = " + libro.getISBN() + "Titulo = "+ libro.getTitulo() +
                "Autor = " + libro.getISBN() + "# Paginas =  "+ libro.getTitulo();
    }
}
