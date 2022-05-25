/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerArchivostxt;

/**
 *
 * @author User1
 */
public class media {

  
    
    

    
    public void mediaPromedio(double suma, String[] array){
        
        for (int i = 0; i < array.length; i++) {
                
                suma += Double.parseDouble(array[i]);
                
                
            }
        suma /= array.length;
        System.out.println(suma);
        
    }

    
    
}
