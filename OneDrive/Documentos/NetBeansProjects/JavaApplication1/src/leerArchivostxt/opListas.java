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
public class opListas {

    int sum, media = 0;
    double sum2, media2, varianza,varianza2, desviacion, redondeo = 0;
    // Puntero que indica el inicio de la lista o conocida tambien como 
    //cabeza de la lista.
    private Nodo inicio;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;

    //constructor
    public void Lista() {
        inicio = null;
        tamanio = 0;
    }

    // Consulta si la lista esta vacia.
    //retorna true si el primer nodo inicio no apunta a otro nodo.
    public boolean esVacia() {
        return inicio == null;
    }

    //Consulta cuantos elementos (nodos) tiene la lista.
    //retorna numero entero entre 0,n donde n es el numero de elementos
    //que contenga la lista.
    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlFinal(int num, double val) {
        // Define un nuevo nodo.

        // Agrega al valor al nodo.
        Nodo nuevo = new Nodo();
        nuevo.setValor(num);

        nuevo.setValor2(val);

        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
            // Caso contrario recorre la lista hasta llegar al ultimo nodo
            //y agrega el nuevo.
        } else {
            // Crea ua copia de la lista.
            Nodo aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;

    }

    public void listar() {
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                System.out.print("[ " + i + ". " + aux.getValor() + " " + " - ");
                // Imprime en pantalla el valor del nodo.
                System.out.println(i + ". " + aux.getValor2() + " ]");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }

    }

    public void media() {
        
        double sumatoria = 0;
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Posicion de los elementos de la lista.

            // Recorre la lista hasta el final.
            while (aux != null) {
                sum = sum + aux.getValor();
                media = sum / getTamanio();
                sum2 = sum2 + aux.getValor2();
                media2 = sum2 / getTamanio();
                aux = aux.getSiguiente();
                //--------------------------------------------------------------

            }
        }
        

        int var = getTamanio() - 1;

        varianza = sumatoria / var;
        desviacion = Math.sqrt(varianza);
        System.out.println("<-------------------------->");
        System.out.println("la media de la columna 1 es " + media);
        System.out.println("la media de la columna 2 es " + media2);
        

    }

    public void var() {
        double sumatoria = 0;
        double sumatoria2 = 0;
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Posicion de los elementos de la lista.

            // Recorre la lista hasta el final.
            while (aux != null) {
                sumatoria += (Math.pow((aux.getValor() - media), 2));
                sumatoria2 += (Math.pow((aux.getValor2()- media2), 2));
                aux = aux.getSiguiente();

            }
            
        }
        
        int var = getTamanio()-1;
        
        
        double op2 = sumatoria2/var;
        double op = sumatoria/var;
        
        varianza2 = Math.sqrt(op2);
        varianza = Math.sqrt(op);
        
        System.out.println("la varianza de la columna 1 es " + varianza);
        System.out.println("la varianza de la columna 2 es " + varianza2);

    }
}
