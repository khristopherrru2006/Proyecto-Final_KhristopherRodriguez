/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg124411269_khristopher_rodriguez_proyectofinal;

import java.util.Scanner;

/**
 *
 * @author khris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hp = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(1000, "1234"); //Aqui puse por determinado el pin "1234", y el saldo inicial es de 1000
        CajeroAutomatico cajero = new CajeroAutomatico(cuenta); 
        System.out.print("Ingrese su PIN: ");
        String pinIngresado = hp.next();
        if (!cuenta.verificarPIN(pinIngresado)) {
            System.out.println("PIN incorrecto.");
            return;
        }
        int respm;
        do {
            System.out.println("Bienvenido al Cajero AutomAtico de BAC");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Transferir");
            System.out.println("5. Cambiar PIN");
            System.out.println("6. Consultar Historial de Transacciones");
            System.out.println("7. Salir");
            System.out.print("Que desea hacer: ");
            respm = hp.nextInt();
            cajero.ejecutarTransaccion(respm);
        } while (respm != 7);
    }
    
}
