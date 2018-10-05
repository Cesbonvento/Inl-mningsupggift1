/*

 */
package inlämningsuppgift1;

/**
 * Klass som beskriver en katt
 * @author Bazgir
 */
public class Katt extends Djur implements IDiet{ 
           
    public Katt(){}
    public Katt(int vikt, String namn)
    {
       super(vikt, namn);
    } 
    
    public double diet(){ 
        double d = ((double) getVikt()) * 1000 / 150;
        return d;
    }
    
        
    
}
