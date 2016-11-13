
package psp6;

/**
 *
 * @author Nabor
 */
public class PsP6 {

    
    public static void main(String[] args) {
        
        
        for(int i = 0;i<10;i++){
        new Movimientos("Ingreso").start();
        
        }
        for(int i = 0;i<5;i++){
        new Movimientos("Retirada").start();
        }
    }
    
}
