/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg124411269_khristopher_rodriguez_proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author khris
 */
public class CuentaBancaria{
    private double saldo;
    private String pin;
    private ArrayList<String> historialTransacciones;

    public CuentaBancaria(double saldoInicial, String pinInicial){
        this.saldo = saldoInicial;
        this.pin = pinInicial;
        this.historialTransacciones = new ArrayList<>();
    }
    public double getSaldo(){
        return saldo;
    }
    public void consultarSaldo(){
        System.out.println("Su saldo actual es: Lps. " + saldo);
        historialTransacciones.add("Consulta de saldo: Lps. " + saldo);//Agregamos la consulta al historial
    }
    public void depositar(double cantidad){
        // Decision if y else para validar que el deposito sea mayor a 0
        if (cantidad > 0){
            saldo += cantidad;  //Sumamos la cantidad del deposito a nuestro saldo diponible
            System.out.println("Deposito exitoso. Su nuevo saldo es: L " + saldo);
            historialTransacciones.add("Depósito: Lps. " + cantidad);//Agregamos el deposito al historial
        }else{
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo -= cantidad;  //Restamos la cantidad del deposito a nuestro saldo disponible
            System.out.println("Retiro exitoso. Su nuevo saldo es: Lps. " + saldo);
            historialTransacciones.add("Retiro: Lps. " + cantidad);//Agregamos el retiro al historial
        }else if (cantidad > saldo){
            System.out.println("Saldo insuficiente.");
        }else{
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }
    public void transferir(double cantidad, CuentaBancaria cuentaDestino){
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            cuentaDestino.saldo += cantidad;
            System.out.println("Transferencia exitosa. Su nuevo saldo es: Lps. " + saldo);
            historialTransacciones.add("Transferencia de Lps. " + cantidad + " a otra cuenta.");//Agregamos la transferenica al historial
        }else{
            System.out.println("Saldo insuficiente o cantidad inválida.");
        }
    }
    public void cambiarPIN(String nuevoPIN){
        pin = nuevoPIN;
        System.out.println("Su PIN ha sido cambiado exitosamente.");
        historialTransacciones.add("Cambio de PIN.");//Agregamos el cambio de pin al historial
    }
    public boolean verificarPIN(String pinIngresado){
        return this.pin.equals(pinIngresado);
    }
    public void consultarHistorial(){
        System.out.println("Historial de transacciones:");
        for (String transaccion : historialTransacciones){
            System.out.println(transaccion);
        }
    }
}
