
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * List
 * clase interface de lista
 * @param <E>  generico
 */
public interface List<E> {
    
    /**
     * metodo que obtiene el largo de la lista
     * @return largo de la lista
     */
    public int size();

    /**
     * metodo que obtiene si la lista esta vacia
     * @return boolean indicando estado de la lista
     */
    public boolean isEmpty();
    // post: returns true iff list has no elements

    /**
     * metodo que limpia la lista
     */
    public void clear();
    // post: empties list

    /**
     * metodo que agrega elemento al principio de la lista
     * @param value generico
     */
    public void addFirst(E value);
    // post: value is added to beginning of list

    /**
     * metodo que agrega elemento al final de la lista
     * @param value generico
     */
    public void addLast(E value);
    // post: value is added to end of list

    /**
     * metodo que obtiene elemento al principio de la lista
     * @return valor del elemento
     */
    public E getFirst();
    // pre: list is not empty
    // post: returns first value in list

    /**
     * metodo que obtiene elemento al final de la lista
     * @return valor del elemento
     */
    public E getLast();
    // pre: list is not empty
    // post: returns last value in list

    /**
     * metodo que remueve el primer elemento de la lista
     * @return valor del elemento
     */
    public E removeFirst();
    // pre: list is not empty
    // post: removes first value from list

    /**
     * metodo que revueve el ultimo elemento de la lista
     * @return valor del elemento
     */
    public E removeLast();
    // pre: list is not empty
    // post: removes last value from list

}
