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
public class operaciones {

    public String LeerText(String direccion){
        String texto = "";
        try {
            //BufferedReader es una clase de Java para leer el texto de una secuencia de entrada (como un archivo)
            
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bread;
            //bread toma el balor de bf.readLine que es método que  lee todos los caracteres
            while((bread = bf.readLine()) != null){
                //haga el siclo mientras bread contenga datos
                temp = temp + bread;//hemos guardado el texto del archivo
                
            }
            texto = temp;
            
            
        } catch (Exception e) {
            System.err.println("no se encontro archivos");
        }
        return texto;
    }
    public static void main(String[] args) {
        
        
    }
    
}
