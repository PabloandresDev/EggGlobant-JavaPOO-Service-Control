package Ejercicio9POO.service;

import Ejercicio9POO.entidad.Matematica;

import java.util.Random;

public class MatematicaService {
    private static Matematica matematica = new Matematica();

    public void crearObjeto() {
        Random random = new Random();
        matematica.setNum1(random.nextDouble(1000));
        matematica.setNum2(random.nextDouble(1000));
        System.out.println("El objeto fue creado con exito con num1 = "+matematica.getNum1()+" y num2 = "+matematica.getNum2()+ "\n");
    }


    public double devolverMayor() {
        return (Math.max(matematica.getNum1(), matematica.getNum2()));
    }

    public long calcularPotencia() {
        long numero1 = Math.round(matematica.getNum1());
        long numero2 = Math.round(matematica.getNum2());
        return (numero1 > numero2) ? (long) Math.pow(numero1, numero2) : (long) Math.pow(numero2, numero1);
    }

    public double calcularRaiz() {
        double numero1 = Math.abs(matematica.getNum1());
        double numero2 = Math.abs(matematica.getNum2());
        return (numero1 > numero2) ? Math.sqrt(numero2) : Math.sqrt(numero1);
    }

}


