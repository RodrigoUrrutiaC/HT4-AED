
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * AbstractList
 * clase abstracta de lista, implementa clase List
 * @param <E> generico
 */
public abstract class AbstractList<E> implements List<E> {

    /**
     * Constructor de AbstractList
     */
    public AbstractList() {
        // post: does nothing	
    }

    /**
     * metodo para saber si esta vacio la lista
     * @return un boolean que indica True si esta vacio, cino indica False
     */
    @Override
    public boolean isEmpty() {
    // post: returns true iff list has no elements
        return size() == 0;
    }
}


