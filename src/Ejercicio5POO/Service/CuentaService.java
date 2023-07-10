package Ejercicio5POO.Service;

import Ejercicio5POO.Entidad.Cuenta;

import java.util.Scanner;

public class CuentaService {
    public Cuenta crearCuenta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero de cuenta");
        int numCuenta= scanner.nextInt();
        System.out.println("Digite el DNI del cliente");
        long dni= scanner.nextInt();
        System.out.println("Digite el saldo actual de la cuenta");
        int saldoActual= scanner.nextInt();
        return new Cuenta(numCuenta,dni,saldoActual);
    }

    public void ingresar(Cuenta cuenta, int ingreso){
        if(ingreso>0){
            cuenta.setSaldoActual(cuenta.getSaldoActual()+ingreso);
            System.out.println("Deposito Exitoso");
        }else{
            System.out.println("EL valor debe ser positivo");
        }
    }

    public void retirar(Cuenta cuenta, int retiro){
        if(cuenta.getSaldoActual()>=retiro){
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
            System.out.println("Retiro Exitoso");
        }else{
            System.out.println("No tiene dinero suficiente para retirar");
        }
    }

    public void consultarSaldo(Cuenta cuenta){
        System.out.println("EL saldo de "+ cuenta +" es "+ cuenta.getSaldoActual());
    }
    public void consultarDatos(Cuenta cuenta){
        System.out.println("El numero de cuenta para " + cuenta + " es "+ cuenta.getNumeroCuenta());
        System.out.println("El DNI para cliente " + cuenta + " es "+ cuenta.getDNI());
        consultarSaldo(cuenta);
    }

}
