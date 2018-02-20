
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * DoublyLinkNode 
 * clase que tiene los nodos dobles
 * @param <E>  generico
 */
public class DoublyLinkedNode<E> {

    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

    /**
     * constructor con parametros
     * @param v generico
     * @param next cabeza del nodo
     * @param previous cola del nodo
     */
public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous){
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

/**
 * constructor de un nodo simple
 * @param v generico
 */
public DoublyLinkedNode(E v){
    // post: constructs a single element
    this(v,null,null);
}

/**
 * metodo que obtiene la cabeza del nodo
 * @return siguiente elemento
 */
    public DoublyLinkedNode<E> next(){
        return nextElement;
    }
    
    /**
     * metodo que obitne la cola del nodo
     * @return elemento previo
     */
    public DoublyLinkedNode<E> previous(){
        return previousElement;
    }
    
     /**
      * metodo que establece la cabeza del nodo
      * @param next siguiente elemento
      */
    public void setNext(DoublyLinkedNode<E> next){
        nextElement = next;
    }
    
/**
 * metodo que establece el valor del siguiente elemento
 * @param value generico 
 */
    public void setValue(E value){ 
        data = value;
    }
    
    public E value(){
        return data;
    }
    
}
