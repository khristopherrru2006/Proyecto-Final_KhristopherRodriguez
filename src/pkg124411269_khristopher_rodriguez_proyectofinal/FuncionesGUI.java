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
    private static double Saldo;
    
    public FuncionesGUI(){
        this.Saldo = 0;
    }
    public void depositar(double deposito){
        Saldo += deposito;
    }
    public void retirar(double retiro){
        if(Saldo >= retiro){
            Saldo -=retiro;
        }else{
            JOptionPane.showMessageDialog(null, "ERROR - Saldo insuficiente");
        }
    }
    public double getSaldo(){
        return Saldo;
    }
    
}
