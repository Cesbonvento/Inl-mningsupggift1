/*

 */
package inlämningsuppgift1;

import javax.swing.JOptionPane;

/**
 *
 * @author Bazgir
 */
public class DietCoach { 
  
    DietCoach()
    {
            //skapar nya instanser av olika djur
            while (true) {
            Hund h1 = new Hund(5,"Sixten");
            Hund h2 = new Hund(10,"Dogge"); 
            Katt k1 = new Katt(5, "Venus"); 
            Katt k2 = new Katt(3, "Ove"); 
            Orm  o  = new Orm(1, "Hypno");
            String djur = "";
            String s = JOptionPane.showInputDialog("Ange vilket djur som ska ha mat"); 
            
            if (s == null){
                break;
            }
            //Användare matar in namn på djur som ska äta, ger ett "felmeddelande" om namn ej stämmer med djurnamnen ovan
            while (!s.equalsIgnoreCase(h1.getNamn()) && !s.equalsIgnoreCase(h2.getNamn()) && !s.equalsIgnoreCase(k1.getNamn()) && !s.equalsIgnoreCase(k2.getNamn()) && !s.equalsIgnoreCase(o.getNamn()))
            {
                JOptionPane.showMessageDialog(null, "Va god och ange djur från hotell!");
                s = JOptionPane.showInputDialog("Ange vilket djur som ska ha mat");
            }
            switch (s)
            {
                case "Sixten": 
                case "sixten": 
                case "SIXTEN":
                    djur = "Hunden " + h1.getNamn() + " ska äta " + h1.diet() + " gram hundfooder"; 
                    break; 

                case "Dogge": 
                case "dogge": 
                case "DOGGE":
                    djur = "Hunden " + h2.getNamn() + " ska äta " + h2.diet() + " gram hundfooder";  
                    break; 

                case "Venus": 
                case "venus": 
                case "VENUS":
                    djur = "Katten " + k1.getNamn() + " ska äta " + k1.diet() + " gram kattfooder"; 
                    break; 

                case "Ove": 
                case "ove": 
                case "OVE":
                    djur = "Katten " + k2.getNamn() + " ska äta " + k2.diet() + " gram kattfooder"; 
                    break; 
                
                case "Hypno": 
                case "hypno": 
                case "HYPNO":
                    djur = "Ormen " + o.getNamn() + " ska äta " + o.diet() + " gram ormpellets"; 
                    break;
            } 
            JOptionPane.showMessageDialog(null, djur); 
        }
         
    }
    
    public static void main(String[] args) 
    {
        DietCoach coach = new DietCoach();
    } 
    
    
}
