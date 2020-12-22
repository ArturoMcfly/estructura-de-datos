
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class coordenadas3 {
     public static void main(String[] args)throws IOException {
    BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    int a1;
    int a2;
    int a4;
    int a3;
        
    int fila[][]=new int[10][10];
        System.out.println("dame desde que fila quieres empezar");
        a1=Integer.parseInt(entrada.readLine());
        System.out.println("dame el segundo parametro");
        a2=Integer.parseInt(entrada.readLine());
        
        System.out.println("dame desde que COLUMNA quieres empezar");
        a3=Integer.parseInt(entrada.readLine());
        System.out.println("dame el segundo parametro");
        a4=Integer.parseInt(entrada.readLine());
        for(int x=a1;x<a2;x++){
            for(int y=a3;y<a4;y++){
                fila[x][y]=1;
            }
            
        }
        for(int x=0;x<10;x++){
           for(int y=0;y<10;y++){ 
        System.out.print(""+fila[x][y]);
        }
            System.out.println("");
        }
    }
}


