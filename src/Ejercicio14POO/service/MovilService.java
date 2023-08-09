package Ejercicio14POO.service;

import Ejercicio14POO.entidad.Movil;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class MovilService {
    Scanner scanner=new Scanner(System.in);
    public void cargarCelular(){
        Movil movil = new Movil();
        System.out.println("Ingrese la marca del equipo movil");
        movil.setMarca(scanner.nextLine());
        System.out.println("Ingrese el precio del equipo "+ movil.getMarca());
        movil.setPrecio(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Ingrese el modelo del equipo "+ movil.getMarca());
        movil.setModelo(scanner.nextLine());
        System.out.println("Ingrese la capacidad de memoria ram del equipo "+ movil.getMarca() + " "+movil.getModelo());
        movil.setMemoriaRam(scanner.nextInt());
        System.out.println("Ingrese la capacidad de memoria de almacenamiento del equipo "+ movil.getMarca()+ " "+movil.getModelo());
        movil.setAlmacenamiento(scanner.nextInt());
        ingresarCodigo(movil);
    }
    
    public void ingresarCodigo(Movil movil){
        int [] codigoMovil = new int[7];
        System.out.println("Digite el codigo de 7 digitos del equipo "+ movil.getMarca());
        int codigo=scanner.nextInt();
        for (int i = 6; i >= 0 ; i--) {
            codigoMovil[i]=codigo%10;
            codigo=parseInt(String.valueOf(codigo/10)) ;
        }
        movil.setCodigo(codigoMovil);
        System.out.println(movil.toString());
    }
}
