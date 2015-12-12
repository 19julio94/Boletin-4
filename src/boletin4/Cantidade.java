
package boletin4;

/**
 *
 * @author JULIO
 */
public class Cantidade {
 
    int cantidade;

    public Cantidade() {
    }

    public Cantidade(int cant) {
        this.cantidade = cant;
    }
    
     public String incremento(){
        String salida="";
        if(this.cantidade<500){
                salida="Cantidad "+this.cantidade+"\nIncremento "+(this.cantidade*0.5)+"\nCantidade Final "+(this.cantidade+(this.cantidade*0.5));
        }else{
            if(this.cantidade>=500&&this.cantidade<1000){
                 salida="Cantidad "+this.cantidade+"\nIncremento "+(this.cantidade*0.07)+"\nCantidade Final "+(this.cantidade+(this.cantidade*0.07));
            }else{
                if(this.cantidade>=1000&&this.cantidade<5000){
                    salida="Cantidad "+this.cantidade+"\nIncremento "+(this.cantidade*0.15)+"\nCantidade Final "+(this.cantidade+(this.cantidade*0.15));
                                
                }else{
                    if(this.cantidade>5000){
                    salida="Cantidad "+this.cantidade+"\nIncremento - "+(this.cantidade*0.03)+"\nCantidade Final "+(this.cantidade-(this.cantidade*0.03));
                    }
                }
            }
        }
        return salida;
    }
}