
package boletin4;

import javax.swing.JOptionPane;

/**
 *
 * @author JULIO
 */
public class Boletin4 {

   
    public static void main(String[] args) {
        
        int cantidade;
        cantidade=Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad"));
        Cantidade canti1=new Cantidade(cantidade);
        JOptionPane.showMessageDialog(null, canti1.incremento());
        
        
        
        
    }
    
}
