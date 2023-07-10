package Ejercicio3POO.Service;

import Ejercicio3POO.Entidad.Operacion;

import java.util.Scanner;

public class OperacionService {
    public Operacion crearOperacion() {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero 1");
        num1 = scanner.nextInt();
        System.out.println("Digite el numero 2");
        num2 = scanner.nextInt();
        return new Operacion(num1, num2);
    }

    public int sumar(Operacion op) {
        return (op.getNumero1() + op.getNumero2());
    }

    public int restar(Operacion op) {
        return (op.getNumero1() - op.getNumero2());
    }

    public int multiplicar(Operacion op) {
        return op.getNumero1() * op.getNumero2();
    }

    public float dividir(Operacion op) {
        return  (float) op.getNumero1() / op.getNumero2();
    }
}
