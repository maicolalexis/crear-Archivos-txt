/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerArchivostxt;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author maico
 */
public class leerArchivo extends media{
    
        String[] array = null;
        String texto = "";
        double suma = 0.0;

    public leerArchivo() {
    }
        
        
        

    public void LeerText(String direccion){
        
        
        
        
        
        try {
            //BufferedReader es una clase de Java para leer el texto de una secuencia de entrada (como un archivo)
            
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bread;
            //bread toma el balor de bf.readLine que es método que  lee todos los caracteres
            while((bread = bf.readLine()) != null){
                //haga el siclo mientras bread contenga datos
               array = bread.split(",");//hemos guardado el texto del archivo
                
            }
            
            mediaPromedio(suma, array);
             
            
            
                
            //suma /= array.length;
           
            
           
            
            
        } catch (Exception e) {
            System.err.println("no se encontro archivos");
        }
        
    }
    public static void main(String[] args) {
        
        
    }
    
}
