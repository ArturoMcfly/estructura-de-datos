
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class coordenadas6 {
    public static void main(String[] args)throws IOException {
    BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    int contador=10;    
    int fila[][]=new int[10][10];
   
        for(int x=0;x<=9;x++){
           
                fila[x][x]=contador;
            contador=contador-1;
          
        }
        for(int x=0;x<10;x++){
           for(int y=0;y<10;y++){ 
        System.out.print(""+fila[x][y]);
        }
            System.out.println("");
        }
    }
}
