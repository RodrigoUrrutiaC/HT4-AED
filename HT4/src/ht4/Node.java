
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * Node
 * clase nodo
 * @param <E> generico
 */
public class Node <E> {
    
    protected E info;
    protected Node <E> nextElem;
    
    /**
     * constructor de nodo
     * @param data generico
     * @param nxt nodo
     */
    public Node(E data, Node<E> nxt){
       this.info=data;
       this.nextElem = nxt;
    }
    
    /**
     * metodo de nodo
     * @param v nodo
     */
    public Node(E v){ 
        this(v, null);
    }
    
    /**
     * metodo que obtiene siguiente elemento
     * @return 
     */
    public Node<E> next(){
        return nextElem;
    }
 
    /**
     * metodo que escribe siguienete elemento
     * @param next siguiente elemento
     */
    public void setNext(Node<E> next){
        nextElem = next;
    }
  
    /**
     * metodo que obtiene valor
     * @return valor
     */
    public E value(){
        return info;
    }
    
    /**
     * metodo que reescrib valor
     * @param value generico
     */
    public void setValue(E value){ 
        info = value;
    }
     
}
