package Ejercicio9POO;

import Ejercicio9POO.service.MatematicaService;

import java.util.Scanner;

public class Ejercicio9APP {
    private static final MatematicaService ms = new MatematicaService();
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        char salida =' ';
        do {
            System.out.println("1 Cree el objeto de la clase Matematica e instanciar sus atributos ");
            System.out.println("2 Consultar el numero mayor de los atributos del objeto");
            System.out.println("3 Calcular potencia de numero mayor elevado a la menor");
            System.out.println("4 Calcular la raiz cuadrada del numero menor de los atributos del objeto");
            System.out.println("5 Salir ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 -> ms.crearObjeto();
                case 2 -> System.out.println("Respuesta = El numero mayor es = " + ms.devolverMayor() + "\n");
                case 3 -> System.out.println("Respuesta = Potencia de numero mayor^menor = " + ms.calcularPotencia() + "\n");
                case 4 -> System.out.println("Respuesta =La raiz cuadrada del numero menor es = " + ms.calcularRaiz() + "\n");
                case 5 -> {
                    System.out.println("Respuesta =Gracias por utilizar la aplicacion");
                    salida = 'Y';
                }
                default -> System.out.println("Opcion ingresada no es valida" + "\n");
            }
        }while(salida!='Y');
    }

}




