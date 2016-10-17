
package boletin3_consumo;

import javax.swing.JOptionPane;


public class Boletin3_consumo {

    
    public static void main(String[] args) {

    Consumo consumo1=new Consumo();
    consumo1.setLitros(50f);
    consumo1.setpGas(1.57f);
   
    
    Consumo consumo2= new Consumo(200f,50f,70f,60f);
    float auxiliar = consumo2.ConsumoMedio();
    consumo2.setLitros(80f);
    System.out.println("Consumo medio = "+auxiliar);
    consumo2.visualizar();
    
    
    }
    
    
}
