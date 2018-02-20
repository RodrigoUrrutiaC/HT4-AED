
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 * @param <E>
 */

public class DoublyLinkedNode<E> {

    protected E data;
    protected DoublyLinkedNode<E> nextElement;
    protected DoublyLinkedNode<E> previousElement;

public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous){
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

public DoublyLinkedNode(E v){
    // post: constructs a single element
    this(v,null,null);
}

    public DoublyLinkedNode<E> next(){
        return nextElement;
    }
    
    public DoublyLinkedNode<E> previous(){
        return previousElement;
    }
    
    public void setNext(DoublyLinkedNode<E> next){
        nextElement = next;
    }
    
    public void setValue(E value){ 
        data = value;
    }
    
    public E value(){
        return data;
    }
    
}
