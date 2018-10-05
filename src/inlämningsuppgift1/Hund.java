/*

 */
package inlämningsuppgift1;

/**
 * Klass som beskriver en hund
 * @author Bazgir
 */
public class Hund extends Djur implements IDiet{ 
           
    public Hund(){}
    public Hund(int vikt, String namn)
    {
       super(vikt, namn);
    } 
    
    public double diet(){ 
        double d = ((double) getVikt()) * 1000 / 100;
        return d;
    }
    
    
}
