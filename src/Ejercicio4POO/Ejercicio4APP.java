package Ejercicio4POO;

import Ejercicio4POO.Entidad.Rectangulo;
import Ejercicio4POO.Service.RectanguloService;

public class Ejercicio4APP {
    public static void main(String[] args) {
        RectanguloService rs = new RectanguloService();
        Rectangulo rect1=  rs.crearRectangulo();
        System.out.println("La superficie es "+ rs.calcularSuperficie(rect1));
        System.out.println("El perimetro es "+ rs.calcularPerimetro(rect1));
        rs.dibujarRectangulo(rect1);
    }
}
