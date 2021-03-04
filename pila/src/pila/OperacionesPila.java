/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author david_orlando.mena@uao.edu.co David Orlando Mena 2180448 
 * @author frank_dan.castillo@uao.edu.co Frank Daniel Castillo 2171721
 * @author cjay.zambrano@uao.edu.co Cjay Zambrano Liñan 2151536
 * @author maria_camila.reina@uao.edu.co Maria Camila Reina 2190037
 * @date Feb 2021 
 */ 
public class OperacionesPila<T extends Base> {

    public static <T extends Base> Pila<T> duplicar(Pila<T> pilaOriginal) {
        Pila<T> pilaDuplicada = new Pila<>();
        Pila<T> pilaAux = new Pila<>();

        while (pilaOriginal.estaVacia()) {
            pilaAux.apilar(pilaOriginal.desapilar());
        }

        while (!pilaAux.estaVacia()) {
            T elemento1 = pilaAux.desapilar();
            T elemento2 = (T) elemento1.copy();
            pilaOriginal.apilar(elemento1);
            pilaDuplicada.apilar(elemento2);
        }
        return pilaDuplicada;
    }
    
        public static <T extends Base> Pila<T> invertir(Pila<T> p)
    {
        Pila<T> pRet = new Pila<>();
        Pila<T> pAux = duplicar(p);
        
        while (!pAux.estaVacia())
        {            
            pRet.apilar(pAux.desapilar());
        }
        
        return pRet;
    }
    
    public static <T extends Base> Pila<T> concatenar(Pila<T> p1, Pila<T> p2)
    {
        Pila<T> pAuxP = invertir(p1);
        Pila<T> pAuxQ = invertir(p2);

        Pila<T> pRet = new Pila<>();
        while (!pAuxP.estaVacia())
        {            
            pRet.apilar(pAuxP.desapilar());
            if ( !pAuxP.estaVacia())
            {
                pAuxP.desapilar();
            }
        }

        while (!pAuxQ.estaVacia())
        {            
            pRet.apilar(pAuxQ.desapilar());
            if ( !pAuxQ.estaVacia())
            {
                pAuxQ.desapilar();
            }
        }

        return pRet;
    }
    
}
