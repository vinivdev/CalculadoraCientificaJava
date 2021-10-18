/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vinic
 */
public class Calculadora {
    //atributos 
    private double numero1;
    private double numero2;
    private String operador;
    private double resultado;
    
    public void Calculadora(){
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
        operador = "";
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = Double.parseDouble(numero1);
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = Double.parseDouble(numero2);
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getResultado() {
        return Double.toString(resultado);
    }

    public void setResultado(String resultado) {
        this.resultado = Double.parseDouble(resultado);
    }
    
    public double somar(double numero1, double numero2){
        resultado = numero1 + numero2;
        return resultado;
    }
    public double subtrair(double numero1, double numero2){
        resultado = numero1 - numero2;
        return resultado;
    }
    
    
}
