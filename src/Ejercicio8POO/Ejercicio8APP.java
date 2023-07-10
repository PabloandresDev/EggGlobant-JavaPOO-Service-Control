package Ejercicio8POO;

import Ejercicio8POO.entidad.Cadena;
import Ejercicio8POO.service.CadenaService;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8APP {
    private static CadenaService cs = new CadenaService();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        char salida =' ';
        do {
            System.out.println("1 Cree una oracion ");
            System.out.println("2 Mostrar vocales de la oracion");
            System.out.println("3 Invertir la frase ");
            System.out.println("4 Consultar caracter repetido en la oracion");
            System.out.println("5 Compara longitud con otra oracion ");
            System.out.println("6 Unir oraciones");
            System.out.println("7 Reemplazar caracter en oracion");
            System.out.println("8 verificar si l oracion contiene un caracter");
            System.out.println("9 Salir aplicacion");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1 :
                    cs.crearCadena();
                    break;
                case 2:
                    System.out.println(" La cantidad de vocales en la oracion es "+ cs.mostrarVocales());
                    break;
                case 3:
                    System.out.println(" La oracion invertida es "+ cs.invertirFrase());
                    break;
                case 4:
                    System.out.println("Ingrese un caracter para validar si existe en la oracion");
                    char letra = sc.nextLine().charAt(0);
                    System.out.println("La cantidad de veces que se repite la letra '" + letra+"' en la oracion es "+cs.vecesRepetido(letra));
                    break;
                case 5:
                    System.out.println("Digite una frase comparar la longitud con la frase anterior");
                    String cadena = sc.nextLine();
                    cs.compararDosFrases(cadena);
                    break;
                case 6:
                    System.out.println("Digite una frase a unir con la frase anterior");
                    cadena = sc.nextLine();
                    cs.unirFrases(cadena);
                    break;
                case 7:
                    System.out.println("Digite una letra para remplaazar con la letra 'a' en la oracion si es que existe ");
                    letra= sc.nextLine().charAt(0);
                    cs.reemplazar(letra);
                case 8:
                    System.out.println("Digite una letra para verificar si la oracion inicial la contiene ");
                    cadena = sc.nextLine().substring(0,1);
                    System.out.println("La letra esta contenida dentro de la oracion = "+cs.contiene(cadena));
                case 9:
                    System.out.println("Gracias por utilizar la aplicacion");
                    salida='Y';
                    break;
                default:
                    System.out.println("Opcion ingresada no es valida");
                    break;
                }
        }while(salida!='Y');
    }
}

