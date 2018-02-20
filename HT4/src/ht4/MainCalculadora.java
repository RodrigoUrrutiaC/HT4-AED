
package ht4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 19.02.2018
 */

/**
 * MainCalculadora
 * interfaz en donde el usuario interaciona con el programa
 */
public class MainCalculadora extends StackVector {
        
    public static void main(String[] args) throws IOException {
        //declaracion de stack y calculadora
     
        Calculadora c = new Calculadora();
        
//        try y catch para leer un archixo txt de nombre "datos", debe de estar en la misma ruta que el programa calculadora
//        try{
          
            Scanner s = new Scanner(System.in);

            FileReader fr = new FileReader("datos1.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            
            int y=0;
            
            System.out.println("¿Que tipo de cadena quiere usar? 1(ARRAY) / 2(VECTOR) / 3(LIST)");
            int x = s.nextInt();
            if (x == 3){
                System.out.println("¿Que tipo de cadena quiere usar? 1(SIMPLE) / 2(DOBLE) / 3(CIRCULAR)");
                y = s.nextInt();
            }
            
            while((linea = br.readLine())!=null){
                String respuesta = c.calcular(linea,x,y);
                System.out.println(""+linea+" = "+respuesta);
            }
            
//        }
        //si no logra leer el archivo o no lo encuentra muestra una alerta
//        catch(Exception ex){
//            System.out.print("INCAPACIDAD PARA LEER EL ARCHIVO .TXT");
//        }      
    }   
}
