/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg124411269_khristopher_rodriguez_proyectofinal;

import java.util.Scanner;

/**
 *
 * @author khris
 */
public class CajeroAutomatico {
    Scanner hp = new Scanner(System.in);
    private CuentaBancaria cuenta;

    public CajeroAutomatico(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    public void ejecutarTransaccion(int opcion) {
        switch (opcion) {
            case 1:
                cuenta.consultarSaldo(); //Aqui simplemente llamamos el metodo para ver nuestro saldo
                break;
            case 2:
                System.out.print("Ingrese la cantidad a depositar: Lps. ");
                double deposito = hp.nextDouble();
                cuenta.depositar(deposito);// Aqui usamos el metodo para el dinero depositado agregarlo a nuesta cuenta
                break;
            case 3:
                System.out.print("Ingrese la cantidad a retirar: Lps. ");
                double retiro = hp.nextDouble();
                cuenta.retirar(retiro); // Aqui usamos el metodo para el dinero retirado restarlo de nustra cuenta
                break;
            case 4:
                System.out.print("Ingrese la cantidad a transferir: Lps. ");
                double transferencia = hp.nextDouble();
                System.out.print("Ingrese el PIN de la cuenta destino: ");
                String pinDestino = hp.next();
                CuentaBancaria cuentaDestino = new CuentaBancaria(500, pinDestino);// Creamos una cuenta destino para la transferencia
                cuenta.transferir(transferencia, cuentaDestino); // La misma logica de los otros metodos solo que aqui pasamos de nuestra cuenta a la cuenta destino el dinero
                break;
            case 5:
                System.out.print("Ingrese el nuevo PIN: ");
                String nuevoPIN = hp.next();
                cuenta.cambiarPIN(nuevoPIN); // Aqui mandamos a llamar el metodo para simplemente cambiar el pin predeterminado al que el usuario queira ahora
                break;
            case 6:
                cuenta.consultarHistorial(); // Auqi solo mandamos a llamar el metodo para ver todo lo que hemos hecho
                break;
            case 7:
                System.out.println("Gracias por usar el cajero. ");
                break;
            default:
                System.out.println("Opcion invalida.");
        }
    }

}
