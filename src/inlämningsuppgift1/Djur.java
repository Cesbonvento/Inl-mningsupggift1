/*

 */
package inlämningsuppgift1;

/**
 * Abstraktklass som beskriver ett djur
 * @author Bazgir
 */
public abstract class Djur { 
    
    private int vikt; 
    private String namn;
    
    public Djur(){} 
    
    public Djur(int vikt, String namn){
        this.vikt = vikt; 
        this.namn = namn;
    } 
    
    public int getVikt(){
        return vikt;
    } 
    
    public String getNamn(){
        return namn;
    }
    
    
}
