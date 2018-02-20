
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 * @param <E>
 */

public class DoublyLinkedList<E> extends AbstractList<E> {
   
    protected int count;
    protected DoublyLinkedNode<E> head;
    protected DoublyLinkedNode<E> tail;

    public DoublyLinkedList(){
    // post: constructs an empty list 
        head = null;
        tail = null;
        count = 0;
    }


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

    @Override
    public int size() {
        return count;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    @Override
    public E getFirst() {
        return head.value();
    }

    @Override
    public E getLast() {
        return tail.value();
    }

    @Override
    public E removeFirst() {
     DoublyLinkedNode<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
    }
}
