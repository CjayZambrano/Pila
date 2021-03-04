/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.LinkedList;

/**
 *
 * @author david_orlando.mena@uao.edu.co David Orlando Mena 2180448 
 * @author frank_dan.castillo@uao.edu.co Frank Daniel Castillo 2171721
 * @author cjay.zambrano@uao.edu.co Cjay Zambrano Liñan 2151536
 * @author maria_camila.reina@uao.edu.co Maria Camila Reina 2190037
 * @date Feb 2021 
 */ 
public class Pila<T extends Base> {
    
    private LinkedList<T> elements;
    
    public Pila(){
        elements=new LinkedList<>();
    }
    
    public void apilar(T e){
        elements.addLast(e);
    }
    
    public T desapilar(){
        return elements.removeLast();
    }
     public boolean estaVacia(){
         return elements.isEmpty();
     }
     
     public String toString(){
         StringBuilder sb = new StringBuilder("[");
         for (T e : elements){
             sb.append("\n").append(e.toString());
         }
         sb.append("\n"+ "]");
         
         return sb.toString();
     }     
     
}
