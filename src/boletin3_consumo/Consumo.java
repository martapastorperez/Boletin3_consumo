
package boletin3_consumo;


public class Consumo {
    //declaro atributos
    private float kilometros,litros, velocidadMedia, prezo;
    //constructores
    public Consumo(){
        kilometros=0;
        litros=0;
        velocidadMedia=0;
        prezo=0;
    }
    public Consumo (float km, float l, float vMed, float pGas){
        kilometros= km;
        litros=l;
        velocidadMedia=vMed ;
        prezo= pGas;  
    }
    //metodos de acceso
    public float getTempo(){
        return velocidadMedia/kilometros;
    }
    public float ConsumoMedio(){
        return litros/kilometros*100; 
    
    }
    public float ConsumoEuros(){
        return (litros/kilometros*100)*prezo;
    }
    public void setKm (float km){
        kilometros=km ;
        
    }
        
    public void setLitros (float l){
        litros=l;
        
        
    }
    public void setvMed (float vMed){
        velocidadMedia=vMed;
        
        
    }
    public void setpGas (float pGas){
       prezo=pGas;
        
        
    }

    public void visualizar (){
        System.out.println("velocidad Media = "+velocidadMedia);
    }
        
       
}
