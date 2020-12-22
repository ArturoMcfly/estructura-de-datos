
 
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tarea1 {

    public static void main(String[] args)throws IOException {
    BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    int [] numeros={1,2,3,4,5,6,7,8,9,10};
    int [] multiplos={1,2,3,4,5,6,7,8,9,10};
    int opcion1;
    int opcion2;
    
        System.out.println("a partir de cual tabla de multiplicar deseas ver");
        opcion1=Integer.parseInt(entrada.readLine());
        System.out.println("cual es el parametro");
        opcion2=Integer.parseInt(entrada.readLine());
       for(int y=opcion2-1;y<multiplos.length;y++){
            int respuesta1=numeros[opcion1-1]*multiplos[y];
                
                System.out.println(numeros[opcion1-1]+"x"+multiplos[y]+"="+respuesta1);
                    
                }
        
        for(int x=opcion1;x<numeros.length;x++){
            
            for(int i=0;i<multiplos.length;i++){
                int respuesta=numeros[x]*multiplos[i];
                System.out.println(numeros[x]+"x"+multiplos[i]+"="+respuesta);
                
            }
            
            
        }
    }
    
}
