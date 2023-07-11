package Ejercicio10POO;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio10APP {

    private static final double[] number1 = new double[100];
    private static Random random=new Random();
    private static final double[] number2= new double[20];
    public static void main(String[] args) {
       for (int i=0; i<100; i++){
           number1[i]= random.nextInt(10000);
       }
        System.out.println("Array 1 sin ordenar = "+Arrays.toString(number1));
        Arrays.sort(number1);
        System.arraycopy(number1,0,number2,0,10);
        Arrays.fill(number2,10,20,0.5);
        System.out.println("Array 1 = "+Arrays.toString(number1));
        System.out.println("Array 2 = "+Arrays.toString(number2));
       
    }

    
}
