
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 * @param <E>
 */

public class Node <E> {
    
    protected E info;
    protected Node <E> nextElem;
    
    public Node(E data, Node<E> nxt){
       this.info=data;
       this.nextElem = nxt;
    }
    
    public Node(E v){ 
        this(v, null);
    }
    
    public Node<E> next(){
        return nextElem;
    }
 
    public void setNext(Node<E> next){
        nextElem = next;
    }
  
    public E value(){
        return info;
    }
    
    public void setValue(E value){ 
        info = value;
    }
     
}
