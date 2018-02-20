
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

public abstract class AbstractList<E> implements List<E> {
    public AbstractList() {
		
    }

    @Override
    public boolean isEmpty()
       // post: returns true iff list has no elements
       {
          return size() == 0;
       }
}
