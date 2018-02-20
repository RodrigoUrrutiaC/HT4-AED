
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * StackFactory
 * fabrica de stack
 * @param <E> 
 */
class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
    /**
     * metodo que selecciona que se implementara para un stack
     * @param entry1 String entrada de usuario
     * @param entry2 String entrada de usuario 2
     * @return 
     */
   public Stack<E> getStack(String entry1, String entry2) {
       // seleccion de la implementacion a utilizar:
        switch (entry1) {
            case "ARRAY":
                return new StackArrayList<>(); //regresa ArrayList
            case "VECTOR":
                return new StackVector<>(); //regresa Vector
            case "LISTA":
               
                switch(entry2){
                    case "SIMPLE":
                        return new StackList(new SinglyLinkedList<>()); //regresa SinglyLinkedList
                    case "DOBLE":
                        return new StackList(new DoublyLinkedList<>()); //regresa DoublyLinkedList
                    case "CIRCULAR":
                        return new StackList(new CircularList<>()); //regresa CircularList
               }
                
           default:
               return null;
       }
   }
}