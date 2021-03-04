/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import pila.Base;

/**
 *
 * @author david_orlando.mena@uao.edu.co David Orlando Mena     2180448 
 * @author frank_dan.castillo@uao.edu.co Frank Daniel Castillo  2171721
 * @author cjay.zambrano@uao.edu.co Cjay Zambrano Liñan         2151536
 * @author maria_camila.reina@uao.edu.co Maria Camila Reina     2190037
 * @date Feb 2021 
 */ 


public class Lanzamiento extends Base {

    private int numDado1;
    private int numDado2;
    
    //Pila<Lanzamiento> pilaLanzamientos;
    
    //pilaLanzamientos = new Pila<>();

    public Lanzamiento() {
    }

    public Lanzamiento(int numDado1, int numDado2) {
        this.numDado1 = numDado1;
        this.numDado2 = numDado2;
    }

    public int getNumDado1() {
        return numDado1;
    }

    public void setNumDado1(int numDado1) {
        this.numDado1 = numDado1;
    }

    public int getNumDado2() {
        return numDado2;
    }

    public void setNumDado2(int numDado2) {
        this.numDado2 = numDado2;
    }   

    @Override
    public String toString() {
        return "Lanzamiento{" + "numDado1=" + numDado1 + ", numDado2=" + numDado2 + '}';
    }
    
    
    @Override
    public Base copy() 
    {
        return new Lanzamiento(numDado1, numDado2);
    }
    
    static int[] lanzamiento() {
 
		int[] resultados = new int[2]; //Se tiran dos dados
 
		resultados[0] = (int)(Math.random()*6 + 1); //Primer dado
		resultados[1] = (int)(Math.random()*6 + 1); //Segundo dado
 
		return resultados;
	}
       
}
