package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 *clase de vector 
 * @param <E> generico
 */

public class StackList<E> implements Stack<E> {
    
    protected List<E> data;

    /**
     * Constructor de stack
     * @param list
     */
	public StackList(List list)
	// post: constructs a new, empty stack
	{
		data = list;
	}

     /**
     * metodo que que le da push al primer intem del stack
     * @param item, stack que va a utilizar
     */
        @Override
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

            /**
    * metodo que remueve el primer item del stack
    * @return item remocido del stack
    */
        @Override
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

           /**
    * obtiene el primer item del stack sin removerlo
    * @return primer item del stack
    */
        @Override
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
           /**
    * metodo que obtiene el largo del stack
    * @return int, largo de la cadena
    */
        @Override
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
                /**
         * metodo que verifica si el stack esta vacio
         * @return true si el stack esta vacio
         */
        @Override
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}