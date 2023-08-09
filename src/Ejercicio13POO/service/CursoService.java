package Ejercicio13POO.service;

import Ejercicio13POO.entidad.Curso;

import java.util.Scanner;

public class CursoService {
    Scanner scanner=new Scanner(System.in);
    Curso cursoGeneral;

    public void crearCurso(){
        Curso curso = new Curso();
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(scanner.nextLine());
        System.out.println("Ingrese Cantidad horas por dia");
        curso.setCantidaHorasDia(scanner.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana del curso");
        curso.setCantidaDiaSemana(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Ingrese turno de la clase");
        curso.setTurno(scanner.nextLine());
        System.out.println("Ingrese el precio por hora del curso");
        curso.setPrecioHora(scanner.nextDouble());
        scanner.nextLine();
        cargarAlumnos(curso);
        cursoGeneral=curso;
    }
    public void cargarAlumnos(Curso curso){
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }
        curso.setAlumnos(alumnos);
    }

    public Double calcularGananciaSemanal( ){
        return cursoGeneral.getCantidaHorasDia() * cursoGeneral.getPrecioHora()
                * cursoGeneral.getAlumnos().length * cursoGeneral.getCantidaDiaSemana();
    }

}
