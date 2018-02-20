
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * CircularList
 * Lista circular que extiende de la clase AbstractList
 * @param <E> generico
 */
public class CircularList<E> extends AbstractList<E> {
    protected Node<E> tail; 
    protected int count;

    /**
     * Constructor de la lista circular sin parametros
     */
    public CircularList(){
        // pre: constructs a new circular list
        tail = null;
        count = 0;
    }

    /**
     * metodo que a;ade elemento al principio de la lista circular
     * @param value parametro generico
     */
    @Override
    public void addFirst(E value){
        // pre: value non-null
        // post: adds element to head of list
        Node<E> temp = new Node<>(value);
        if (tail == null) { // first value added
            tail = temp;
            tail.setNext(tail);
        } else { // element exists in list
            temp.setNext(tail.next());
            tail.setNext(temp);
        }
        count++;
}

    /**
     * metodo que agrega elemento al final de la lista circular
     * @param value generico
     */
    @Override
    public void addLast(E value){
        // pre: value non-null
        // post: adds element to tail of list
        addFirst(value);
        tail = tail.next();
    }

    /**
     * metodo que remueve el ultimo elemento de la lista cirular
     * @return elemento que removio
     */
    @Override
    public E removeLast(){
        // pre: !isEmpty()
        // post: returns and removes value from tail of list
        Node<E> finger = tail;
        while (finger.next() != tail) {
            finger = finger.next();
        }
        // finger now points to second-to-last value
        Node<E> temp = tail;
        if (finger == tail){
            tail = null;
        } else {
            finger.setNext(tail.next());
            tail = finger;
        }
        count--;
        return temp.value();
    }

    /**
     * metodo que calcula el largo de la lista circular
     * @return tamanio de la lista
     */
    @Override
    public int size() {
        return count;
    }

    /**
     * metodo que limpia la lista circular
     */
    @Override
    public void clear() {
        tail = null;
        count = 0;
    }

    /**
     * metodo que obtiene el valor del primer elemento de la losta circular
     * @return el valor del primer elemento 
     */
    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * metodo que obtiene el valor del utlimo elemento de la lista circular
     * @return el valor del ultimo elemento
     */
    @Override
    public E getLast() {
        return tail.value();
    }

    /**
     * metodo que remueve el primer elemento de la lista circular 
     * @return valor del primer elemento
     */
    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
