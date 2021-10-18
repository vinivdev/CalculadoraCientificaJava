package Controller;
import Model.*;
import javax.swing.JOptionPane;

public class Ctr_Calculadora {
    
    Calculadora calculadora = new Calculadora();
   
    
    public void SelecionaOperadoracao(Calculadora calculadora){
        //se o operador for '+'
        if (calculadora.getOperador() == "+"){
            calculadora.somar(calculadora.getNumero1(), calculadora.getNumero2());
        }
        
        //se o operador for '-'
        if (calculadora.getOperador() == "-"){
            calculadora.subtrair(calculadora.getNumero1(), calculadora.getNumero2());
        }
        
        //se o operador for '*'
        if (calculadora.getOperador() == "*"){
            calculadora.multiplicar(calculadora.getNumero1(), calculadora.getNumero2());
        }
        
        //se o operador for '/'
        if (calculadora.getOperador() == "/"){
            calculadora.divInt(calculadora.getNumero1(), calculadora.getNumero2());
        }
        
        //se o operador for '%'
        if (calculadora.getOperador() == "%"){
            calculadora.divRest(calculadora.getNumero1(), calculadora.getNumero2());
        }
    }
}
