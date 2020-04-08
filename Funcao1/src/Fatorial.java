/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel.nascimento
 */
public class Fatorial {

    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";

    public void setValor(int n) {
        numero = n;
        String s = " ";
        
        int f = 1;
        for (int i = n; i > 1; i--) {
            f *= n;
            s += i + " x ";
        }
        s += "1 = ";
        fatorial = f;
        formula = s;     
    }
    public int getFatorial(){
        return fatorial;
    }
    public String getFormula(){
        return formula;
    }
}
