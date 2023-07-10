package Ejercicio6POO.Service;

import Ejercicio6POO.Entidad.Cafetera;

public class CafeteraService {

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera cafetera, int tamanioTaza) {
        if (cafetera.getCapacidadActual() == 0) {
            System.out.println("No tiene cafe para servir en la taza");
        } else if (cafetera.getCapacidadActual() >= tamanioTaza) {
            cafetera.setCapacidadActual(cafetera.getCapacidadActual() - tamanioTaza);
            System.out.println("La taza se lleno completamente");
        } else if (tamanioTaza > cafetera.getCapacidadActual()) {
            System.out.println("La taza no se lleno completamente y le falto " + (tamanioTaza - cafetera.getCapacidadActual()));
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCapacidadActual(0);
    }

    public void agregarCafeCafetera(Cafetera cafetera, int cantidadCafe) {
        if (cafetera.getCapacidadActual() == 100) {
            System.out.println("La cafetera esta llena");
        } else if (cafetera.getCapacidadActual() + cantidadCafe > 100) {
            System.out.println("NO se puede agregar toda esta cantidad de cafe solo se agregara" +
                    (cafetera.getCapacidadMaxima() - cafetera.getCapacidadActual()));
            llenarCafetera(cafetera);
        } else {
            cafetera.setCapacidadActual(cafetera.getCapacidadActual() + cantidadCafe);
            System.out.println("Se agrego el cafe exitosamente , cafe actual = " + cafetera.getCapacidadActual());
        }
    }

}




