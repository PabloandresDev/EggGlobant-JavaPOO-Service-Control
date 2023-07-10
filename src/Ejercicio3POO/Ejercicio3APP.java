package Ejercicio3POO;

import Ejercicio3POO.Entidad.Operacion;
import Ejercicio3POO.Service.OperacionService;

public class Ejercicio3APP {
    public static void main(String[] args) {
        OperacionService os = new OperacionService();
        Operacion operacion = os.crearOperacion();
        System.out.println("La suma es = "+ os.sumar(operacion));
        System.out.println("La resta es = "+ os.restar(operacion));
        System.out.println("La multiplicacion es "+ os.multiplicar(operacion));
        System.out.println("La division es "+ os.dividir(operacion));
    }
}
