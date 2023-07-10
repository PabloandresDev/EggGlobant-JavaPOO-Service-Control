package Ejercicio2POO;

import Ejercicio2POO.Entidad.Circunferencia;
import Ejercicio2POO.Service.CircunferenciaService;
import org.w3c.dom.ls.LSOutput;

public class Ejercicio2APP {
    public static void main(String[] args) {
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c1 = cs.crearCircunferencia();
        System.out.println(c1.toString());
        System.out.println("El area es " + cs.areaCircunferencia(c1));
        System.out.println("El Perimetro es " + cs.perimetroCircunferencia(c1));
    }


}
