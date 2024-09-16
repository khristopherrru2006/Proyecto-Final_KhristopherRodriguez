/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg124411269_khristopher_rodriguez_proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author khris
 */
public class FuncionesGUI {
    public static double saldoActual;
    
    public FuncionesGUI(){
        saldoActual = 0;
    }
    public void depositar(double deposito){
        saldoActual += deposito;
    }
    public void retirar(double retiro){
        if(saldoActual >= retiro){
            saldoActual -=retiro;
        }else{
            JOptionPane.showMessageDialog(null, "ERROR - Saldo insuficiente");
        }
    }
    public double getSaldo(){
        return saldoActual;
    }
    
}
