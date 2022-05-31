/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerArchivostxt;

/**
 *
 * @author maico
 */
public class Nodo {
    // Variable en la cual se va a guardar el valor.

    private int valor;
    private double valor2;
    // Variable para enlazar los nodos.
    private Nodo siguiente;

    //Constructor que inicializamos el valor de las variables.

    
    
    
    
    public void Nodo() {
        
        this.siguiente = null;
    }

    // Métodos get y set para los atributos.
    public int getValor() {
        return valor;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
