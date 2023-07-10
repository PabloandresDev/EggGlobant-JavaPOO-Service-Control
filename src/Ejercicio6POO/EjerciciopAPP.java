package Ejercicio6POO;

import Ejercicio6POO.Entidad.Cafetera;
import Ejercicio6POO.Service.CafeteraService;

public class EjerciciopAPP {
    public static void main(String[] args) {
        CafeteraService cafeteraService = new CafeteraService();
        Cafetera cafetera=new Cafetera();
        cafeteraService.llenarCafetera(cafetera);
        cafeteraService.vaciarCafetera(cafetera);
        cafeteraService.servirTaza(cafetera,200);
        cafeteraService.agregarCafeCafetera(cafetera,90);
//        cafeteraService.vaciarCafetera(cafetera);
//        cafeteraService.llenarCafetera(cafetera);
//        cafeteraService.agregarCafeCafetera(cafetera,90);
        cafeteraService.servirTaza(cafetera,60);
        System.out.println(cafetera.getCapacidadActual());
        cafeteraService.servirTaza(cafetera,30);
        System.out.println(cafetera.getCapacidadActual());
        cafeteraService.servirTaza(cafetera,60);
    }
}
