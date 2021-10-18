package Controller;
import Model.*;
import javax.swing.JOptionPane;

public class Ctr_Calculadora {
    
    Calculadora calculadora = new Calculadora();
   
    
    public void SelecionaOperadoracao(Calculadora calculadora){
        if (calculadora.getOperador() == "+"){
            calculadora.somar(calculadora.getNumero1(), calculadora.getNumero2());
        }
        if (calculadora.getOperador() == "-"){
            calculadora.subtrair(calculadora.getNumero1(), calculadora.getNumero2());
        }
        
    }
}
