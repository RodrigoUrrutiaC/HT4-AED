
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 * @param <E>
 */

/**
 * SinglyLinkedList
 * clase de lista simple que extiende de lista abstracta
 * @param <E> generico
 */
public class SinglyLinkedList<E> extends AbstractList<E> {
    protected int count; // list size
    protected Node<E> head; // ref. to first element

    /**
     * constructor de la lista simple
     */
     public SinglyLinkedList(){
    // post: generates an empty list
       head = null;
       count = 0;
    }

         /**
     * metodo que obtiene si la lista esta vacia
     * @return boolean indicando estado de la lista
     */
    @Override
    public int size(){
        // post: returns number of elements in list
        return count;
    }

        /**
     * metodo que agrega elemento al principio de la lista
     * @param value generico
     */
    @Override
    public void addFirst(E value){
        // post: value is added to beginning of list
        // note order that things happen:
        // head is parameter, then assigned
    head = new Node<>(value, head);
    count++;
    }

        /**
     * metodo que remueve el primer elemento de la lista
     * @return valor del elemento
     */
    @Override
    public E removeFirst(){
        // pre: list is not empty
        // post: removes and returns value from beginning of list
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
   }

        /**
     * metodo que obtiene elemento al principio de la lista
     * @return valor del elemento
     */
    @Override
    public E getFirst(){
        // pre: list is not empty
        // post: returns first value in list
        return head.value();
   }

        /**
     * metodo que agrega elemento al final de la lista
     * @param value generico
     */
    @Override
    public void addLast(E value){
        // post: adds value to end of list
        // location for new value
        Node<E> temp = new Node<>(value,null);
        
        if (head != null) {
            // pointer to possible tail
            Node<E> finger = head;
            while (finger.next() != null) {
                finger = finger.next();
            }

            finger.setNext(temp);
        } else head = temp;
           count++;
    }

        /**
     * metodo que limpia la lista
     */
    @Override
    public void clear() {
        head=null;
        count=0;
    }
    
        /**
     * metodo que obtiene elemento al final de la lista
     * @return valor del elemento
     */
    @Override
    public E getLast() {

        Node node=head;
        while((node.next()!=(null))){
            node=node.next();
        }
        return (E)node.info;
    }

        /**
     * metodo que revueve el ultimo elemento de la lista
     * @return valor del elemento
     */
    @Override
    public E removeLast() {
        Node node1 = head;
        Node node2 = node1;
        while (node1.next() != null){
            node2 = node1;
            node1 = node1.next();
        }
        node2.nextElem = null;
        count--;
        return (E)node1.info;
    }
}

