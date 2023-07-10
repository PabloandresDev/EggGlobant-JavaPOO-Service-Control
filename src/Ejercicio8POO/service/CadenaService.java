//a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.
//b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.
//f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.
//h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
package Ejercicio8POO.service;

import Ejercicio8POO.entidad.Cadena;

import java.util.Scanner;

public class CadenaService {
    private Cadena cadena = new Cadena();
    public static Scanner sc = new Scanner(System.in);
    public void crearCadena(){
        System.out.println("Digite una oracion o palabra");
        cadena.setFrase(sc.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        System.out.println("Oracion creada con exito");
    }

    public int vecesRepetido(char letra){
        int numeroVocales=0;
        for (int i=0; i<cadena.getLongitud(); i++){
            if (cadena.getFrase().charAt(i) == letra) {
                numeroVocales++;
            }
        }
        return numeroVocales;
    }

    public String invertirFrase(){
        StringBuilder frase = new StringBuilder(cadena.getFrase());
        return frase.reverse().toString();
    }
    public int mostrarVocales(){
        int vecesRepetido=0;
        String frase = cadena.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                vecesRepetido++;
            }
        }
        return vecesRepetido;
    }
    public int vecesRepetido( Character letra){
        int vecesRepetido=0;
        String frase = cadena.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                vecesRepetido++;
            }
        }
        return vecesRepetido;
    }

    public void compararDosFrases(String frase){
        if(frase.length()>cadena.getLongitud()){
            System.out.println("La frase ingresad tiene una longitud igual o mayor a anterior");
        }else{
            System.out.println("La frase ingresad tiene una longitud inferior a anterior");
        }
    }

    public void unirFrases(String frase){
        cadena.setFrase(cadena.getFrase().concat(" "+frase));
        System.out.println("Las dos cadenas unidas serian " + cadena.getFrase());
    }

    public void reemplazar(char letra){
        cadena.setFrase(cadena.getFrase().replace('a',letra));
        System.out.println("La nueva oracion seria "+ cadena.getFrase());
    }

    public boolean contiene(String letra){
       return cadena.getFrase().contains(letra);
    }



}
