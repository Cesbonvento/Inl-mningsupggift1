/*

 */
package inlämningsuppgift1;

/**
 *
 * @author Bazgir
 */
public class Orm extends Djur implements Diet{
           
    public Orm(){}
    public Orm(int vikt, String namn)
    {
       super(vikt, namn);
    } 
    
    public double diet(){
        return 20;
    }
    
            
}
