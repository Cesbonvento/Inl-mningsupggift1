/*

 */
package inlämningsuppgift1;

/**
 *Klass som beskriver en orm i vikt och namn
 * @author Bazgir 
 */
public class Orm extends Djur implements IDiet{
           
    public Orm(){}
    public Orm(int vikt, String namn)
    {
       super(vikt, namn);
    } 
    
    public double diet(){
        return 20;
    }
    
            
}
