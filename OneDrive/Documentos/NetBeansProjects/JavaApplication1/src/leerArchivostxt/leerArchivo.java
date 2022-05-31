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
public class leerArchivo extends opListas{
        String[] array;
        String[] array2 ;
        String texto = "";
        double columna2;
        int numero;
        int arrays;
    public leerArchivo() {
    }
        
        
        

    public String[] LeerText(String direccion){
        
        
        
        
        
        try {
            //BufferedReader es una clase de Java para leer el texto de una secuencia de entrada (como un archivo)
            
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bread;
            //bread toma el valor de bf.readLine que es método que  lee todos los caracteres
            while((bread = bf.readLine()) != null){
                //haga el siclo mientras bread contenga datos
                
                array = bread.split(",");//hemos guardado el texto del archivo
                   
               for (int i = 0; i < array.length; i++) {
                numero = Integer.parseInt(array[0]);
                columna2 = Double.parseDouble(array[1]);  
                
               
                
            }
               
              agregarAlFinal(numero, columna2);
                
               
            }
            
            
            
            listar();
            media();
            
           
            
         
        
        
        

   
            
      
            
        } catch (Exception e) {
            System.err.println("no se encontro archivos");
        }
        
          
         return array;   
            
        
    }
    
}
