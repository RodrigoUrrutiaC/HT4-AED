package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * StackList
 * clase lista que implementa stack
 * @param <E> generico 
 */
public class StackList<E> implements Stack<E> {
    protected List<E> data;
    
    /**
     * @param list
     */
    public StackList(List list){ 
        data = list;
    }
    
        /**
    * metodo que que le da push al primer intem del stack
    * @param item, stack que va a utilizar
    */
    @Override
    public void push(E item) {
        data.addLast(item);
    }
    
        /**
    * metodo que remueve el primer item del stack
    * @return item remocido del stack
    */

    @Override
    public E pop() {
        return data.removeLast();
    }

        /**
    * obtiene el primer item del stack sin removerlo
    * @return primer item del stack
    */
    @Override
    public E peek() {
        return data.getLast();
    }

        /**
    * metodo que verifica si el stack esta vacio
    * @return true si el stack esta vacio
    */
    @Override
    public boolean empty() {
        return size() == 0;
    }

        /**
    * metodo que obtiene el largo del stack
    * @return int, largo de la cadena
    */
    @Override
    public int size() {
        return data.size();
    }
}
