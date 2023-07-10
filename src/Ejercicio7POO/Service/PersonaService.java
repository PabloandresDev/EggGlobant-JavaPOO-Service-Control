package Ejercicio7POO.Service;

import Ejercicio7POO.Entidad.Persona;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class PersonaService {
    ArrayList<Persona> personas = new ArrayList<Persona>();
    ArrayList<Integer> IMC = new ArrayList<Integer>();
    ArrayList<Boolean> esMayor= new ArrayList<Boolean>();

//    public Persona crearPersona() {
//        Persona persona = new Persona();
//        System.out.println(persona.getClass());
//        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
//        System.out.println("Ingrese el nombre");
//        persona.setNombre(scanner.nextLine());
//        System.out.println("Ingrese la edad");
//        persona.setEdad(scanner.nextInt());
//        scanner.nextLine();
//        String sexo = "";
//        do { // verificar que sexo solo sea M,H,O
//            System.out.println("Ingrese el sexo");
//            sexo = scanner.nextLine().toUpperCase();
//        } while (!sexo.equals("M") && !sexo.equals("H") && !sexo.equals("O"));
//        persona.setSexo(sexo);
//        System.out.println("Ingrese el peso en KG");
//        persona.setPeso(scanner.nextFloat());
//        System.out.println("Ingrese altura en MTs");
//        persona.setAltura(scanner.nextFloat());
//        return persona;
//    }

    public void crearPersona(String nombre,int edad,String sexo,float peso, float altura) {
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setSexo(sexo);
        persona.setPeso(peso);
        persona.setAltura(altura);
        personas.add(persona);
    }

    public void calcularIMC() {
        for (Persona persona:personas) {
            double imc = persona.getPeso()/ (persona.getAltura()* persona.getAltura());
            if(imc<20){
                IMC.add(-1);
            }else if(imc<25){
                IMC.add(0);
            }else{
                IMC.add(1);
            }
        }
    }

    public int esMayorDeEdad(){
        int cuantosMayores=0;
        for (Persona persona:personas) {
           if(persona.getEdad()>=18){
               esMayor.add(persona.getEdad()>=18);
               cuantosMayores++;
           }
        }
        return cuantosMayores;
    }
    public  void  mostrarValores(){
        for (Persona persona:personas) {
            System.out.println("Nombre = "+persona.getNombre()+" Edad = "+ persona.getEdad()+" Sexo = "+persona.getSexo()+" Peso = "+ persona.getPeso()+ " Altura= "+persona.getPeso());
        }
    }

    private int numeroPersonas(){
        return personas.size();
    }

    public String mostrarResultados(){
        int personasBajoPeso=0;
        int personasNormales=0;
        int personasSobrepeso=0;
        for (Integer imc:IMC) {
            switch (imc){
                case -1:
                    personasBajoPeso++;
                    break;
                case 0:
                    personasNormales++;
                    break;
                case 1:
                    personasSobrepeso++;
                    break;
                default:
                    break;
            }
        }
        return  "\n"+"La cantidad de personas con bajo indice de IMC es = "+personasBajoPeso+"\n"
                +"La cantidad de personas con indice normal de IMC es = "+personasNormales+"\n"
                +"La cantidad de personas con indice alto de IMC es = "+personasSobrepeso+"\n"
                +"El porcentaje de mayores de edad es = "+(100*esMayorDeEdad())/numeroPersonas()+"% y el porcentaje de menores de edad es = "+((numeroPersonas()-esMayorDeEdad())*100)/numeroPersonas()+"%";

    }

}
