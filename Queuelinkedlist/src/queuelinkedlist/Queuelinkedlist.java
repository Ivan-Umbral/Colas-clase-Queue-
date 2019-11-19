/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelinkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author ivanu
 */
public class Queuelinkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList();
        //Insertar datos
        //Retorna un Exception en caso de no poder almacenar el elemento
        queue.add("ivan");
        queue.add("luis");
        queue.add("efren");
        //Insertar datos
        //Retorna null en caso de no poder almacenar el elemento
        queue.offer("Francisco");
        //Elimina  datos
        //----------queue.remove();
        //muestra el frente de la cola
        System.out.println(" Se elimino: " + queue.remove());
        System.out.println("Frente de la cola: " + queue.element());
        System.out.println("SE elimino el elemnto: " + queue.peek());

        //----------queue.element();
        //Elimina un elemento de la cola
        //Retorna  null si la cola esta vacia
        //----------queue.peek();
         List<String> list = new ArrayList<String>();   
        list.add(queue.element());
        list.add(queue.peek());
        list.add(" el que se elimino fue: "+queue.remove());
        
            Iterator iter = list.iterator();
            while (iter.hasNext())
            System.out.println(iter.next());
        
    }
    
}
