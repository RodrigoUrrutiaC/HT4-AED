
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

class ListFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Stack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
      return new StackArrayList<E>(); //regresa ArrayList
	else
      return new StackVector<E>(); //regresa Vector
   }
}
