
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * DoublyLinkedList
 * @author Kevin Macario
 * @param <E> 
 */
public class DoublyLinkedList<E> extends AbstractList<E> {
   
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    /**
     * Construcor de la lista
     */
    public DoublyLinkedList(){
    // post: constructs an empty list 
        head = null;
        tail = null;
        count = 0;
    }

    /**
     * metodo que agrega elemento al final de la lista
     * @param value generico
     */
    @Override
    public void addFirst(E value){
        // pre: value is not null
        // post: adds element to head of list
        // construct a new element, making it head
        head = new DoublyLinkedNode<>(value, head, null);
        // fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }

        /**
     * metodo que obtiene elemento al principio de la lista
     * @return valor del elemento
     */
    @Override
    public void addLast(E value){
        // pre: value is not null
        // post: adds new value to tail of list
        // construct new element
        tail = new DoublyLinkedNode<>(value, null, tail);
        // fix up head
        if (head == null) head = tail;
        count++;
    }

        /**
     * metodo que revueve el ultimo elemento de la lista
     * @return valor del elemento
     */
    @Override
    public E removeLast(){
        // pre: list is not empty
        // post: removes value from tail of list
        DoublyLinkedNode<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
}

        /**
     * metodo que obtiene el largo de la lista
     * @return largo de la lista
     */
    @Override
    public int size() {
        return count;
    }

       /**
     * metodo que limpia la lista
     */
    @Override
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

        /**
     * metodo que obtiene elemento al principio de la lista
     * @return valor del elemento
     */
    @Override
    public E getFirst() {
        return head.value();
    }

        /**
     * metodo que obtiene elemento al final de la lista
     * @return valor del elemento
     */
    @Override
    public E getLast() {
        return tail.value();
    }

        /**
     * metodo que revueve el ultimo elemento de la lista
     * @return valor del elemento
     */
    @Override
    public E removeFirst() {
     DoublyLinkedNode<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
    }
}
