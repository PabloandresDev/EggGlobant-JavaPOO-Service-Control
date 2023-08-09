package Ejercicio13POO;

import Ejercicio13POO.service.CursoService;

public class Ejercicio13APP {
    public static void main(String[] args) {
        CursoService cursoService = new CursoService();
        cursoService.crearCurso();
        System.out.println("La ganancia total del curso es "+cursoService.calcularGananciaSemanal());
    }
}
