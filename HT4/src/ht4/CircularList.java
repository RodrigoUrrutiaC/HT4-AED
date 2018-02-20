
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

public class CircularList<E> extends AbstractList<E> {
    protected Node<E> tail; 
    protected int count;

    public CircularList(){
        // pre: constructs a new circular list
        tail = null;
        count = 0;
    }

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

    @Override
    public void addLast(E value){
        // pre: value non-null
        // post: adds element to tail of list
        addFirst(value);
        tail = tail.next();
    }


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

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        tail = null;
        count = 0;
    }

    @Override
    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getLast() {
        return tail.value();
    }

    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
