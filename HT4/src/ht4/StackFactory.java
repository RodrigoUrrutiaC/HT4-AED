
package ht4;


class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Stack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("ARRAY")){
            return new StackArrayList<E>(); //regresa ArrayList
        }
        if (entry.equals("VECTOR")){
            return new StackVector<E>(); //regresa Vector
        }
        else
        return null;
   }
}