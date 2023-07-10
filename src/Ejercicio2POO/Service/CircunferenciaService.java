package Ejercicio2POO.Service;

import Ejercicio2POO.Entidad.Circunferencia;

public class CircunferenciaService {
    public Circunferencia crearCircunferencia(){
        double radio=10;
        return new Circunferencia(radio);
    }

    public double areaCircunferencia( Circunferencia c){
        return (Math.pow(c.getRadio(),2)*Math.PI);
    }

    public double perimetroCircunferencia( Circunferencia c){
        return (c.getRadio()*2*Math.PI);
    }
}
