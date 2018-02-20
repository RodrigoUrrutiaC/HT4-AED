package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

public class StackList<E> implements Stack<E> {
    protected List<E> data;
    
    /**
     * @param list
     */
    public StackList(List list){ 
        data = list;
    }
    
    @Override
    public void push(E item) {
        data.addLast(item);
    }
    
    
    @Override
    public E pop() {
        return data.removeLast();
    }

    @Override
    public E peek() {
        return data.getLast();
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return data.size();
    }
}
