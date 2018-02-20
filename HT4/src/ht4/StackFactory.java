
package ht4;


class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
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
                        return new StackList(new SinglyLinkedList<>()); //regresa ArrayList
                    case "DOBLE":
                        return new StackList(new DoublyLinkedList<>()); //regresa Vector
                    case "CIRCULAR":
                        return new StackList(new CircularList<>()); //regresa Vector
               }
                
           default:
               return null;
       }
   }
}