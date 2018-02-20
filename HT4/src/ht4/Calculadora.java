
package ht4;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * Calculadora
 * Clase que implementa la interfaz de calculadora
 */
public class Calculadora implements CalculadoraI{

    private static Calculadora instance = null;
    
    public Calculadora(){
        
    }
    /**
     * Singleton
     * @return una instancia de la clase
     */
    public static Calculadora getInstance(){
        if(instance == null){
                instance = new Calculadora();
        }
        return instance;
    }

	
    /**
     * metodo implementado de la clase CalculadoraI, reliza las operaciones y separaciones de escritura tipo postfix
     * @param exp, linea con escritura postfix
     * @param x
     * @param y
     * @return resultado de la operacion
     */
    @Override
    public String calcular(String exp, int x, int y) {
        
        StackFactory<String>  stackF = new StackFactory<>();     
        Stack<String> cadena = null;
        
        switch (x) {
            case 1:
                cadena = stackF.getStack("ARRAY","");
                break;
            case 2:
                cadena = stackF.getStack("VECTOR","");
                break;
            case 3:
                switch (y) {
                    case 1:
                        cadena = stackF.getStack("LISTA","SIMPLE");
                        break;
                    case 2:
                        cadena = stackF.getStack("LISTA","DOBLE");
                        break;
                    case 3:
                        cadena = stackF.getStack("LISTA","CIRCULAR");
                        break;
                }   
                break;               
        }
        
        Stack<String> baraja = cadena;
            
        char j;
        String respuesta, k;
        int t, ans, p;

        try{
            for(int i=0; i< exp.length(); i++){
           
           j = exp.charAt(i);
           k = Character.toString(j);
           
           if (Character.isDigit(j)){
               baraja.push(k);
           }
           
           else {

                switch (k) {
             case "+":  ans = Integer.parseInt((String) baraja.pop());
                        t = baraja.size();

                        for (int n=0; n<t; n++){
                            p= Integer.parseInt(baraja.pop());
                            ans+=p;
                        }
                        baraja.push(Integer.toString(ans));
                     
             case "-":  ans = Integer.parseInt((String) baraja.pop());
                        t = baraja.size();

                        for (int n=0; n<t; n++){
                            p= Integer.parseInt(baraja.pop());
                            ans = p-ans;
                        }
                        baraja.push(Integer.toString(ans));
                  
             case "*":  ans = Integer.parseInt((String) baraja.pop());
                        t = baraja.size();

                        for (int n=0; n<t; n++){
                            p= Integer.parseInt(baraja.pop());
                            ans = ans*p;
                        }
                        baraja.push(Integer.toString(ans));
                   
             case "/":  ans = Integer.parseInt((String) baraja.pop());
                        t = baraja.size();

                        for (int n=0; n<t; n++){
                            p= Integer.parseInt(baraja.pop());
                            ans = p/ans;
                        }
                        baraja.push(Integer.toString(ans));
                      
                           }

           }
           
        }
            respuesta= baraja.pop();
            
        return respuesta;
              
        }
        
        catch(Exception e){
            return "MATH ERROR";
        }  
        
    }

 }