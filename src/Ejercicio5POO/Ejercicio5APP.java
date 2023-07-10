package Ejercicio5POO;

import Ejercicio5POO.Entidad.Cuenta;
import Ejercicio5POO.Service.CuentaService;

public class Ejercicio5APP {
    public static void main(String[] args) {
        CuentaService cs = new CuentaService();
        Cuenta cuenta1 = cs.crearCuenta();
        //cs.consultarSaldo(cuenta1);
        cs.ingresar(cuenta1,100000);
        cs.consultarSaldo(cuenta1);
        cs.retirar(cuenta1,200000);
        cs.consultarDatos(cuenta1);
    }
}
