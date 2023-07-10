package Ejercicio4POO.Service;

import Ejercicio4POO.Entidad.Rectangulo;
import jdk.jfr.consumer.RecordedStackTrace;

import java.util.Scanner;

public class RectanguloService {
    public Rectangulo crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la base del rectangulo");
        int base = scanner.nextInt();
        System.out.println("Digite la altura del rectangulo");
        int altura = scanner.nextInt();
        return new Rectangulo(base, altura);
    }

    public int calcularSuperficie(Rectangulo rect) {
        return rect.getAltura() * rect.getBase();
    }

    public int calcularPerimetro(Rectangulo rect) {
        return (rect.getAltura() + rect.getBase()) * 2;
    }

    public void dibujarRectangulo(Rectangulo rect) {
        for (int i = 0; i < rect.getAltura(); i++) {
            for (int j = 0; j < rect.getBase(); j++) {
                if (i == 0 || i == rect.getAltura() - 1 || j == 0 || j == rect.getBase() - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
