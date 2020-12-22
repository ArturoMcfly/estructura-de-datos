
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class tarea2 {
    public static void main(String[] args)throws IOException {
    BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
    int [] num={1,2,3,4,5,6,7,8,9,10};
    int [] mul={1,2,3,4,5,6,7,8,9,10};
    int a1;
    int a2;
    int a3;
    int a4;
      
        System.out.println("a partir de cual tabla de multiplicar deseas ver");
        a1=Integer.parseInt(entrada.readLine());
        System.out.println("por que numero desea empezar la multiplicacion");
        a2=Integer.parseInt(entrada.readLine());
        System.out.println("en que numero de tabla le gustaria terminar");
        a3=Integer.parseInt(entrada.readLine());
        System.out.println("y en que numero??");
        a4=Integer.parseInt(entrada.readLine());
        for(int y=a2-1;y<mul.length;y++){
            int respuesta1=num[a1-1]*mul[y];
                
                System.out.println(num[a1-1]+"x"+mul[y]+"="+respuesta1);
                    
                }
        
        for(int x=a1;x<num.length;x++){
            for(int i=0;i<mul.length;i++){
                if(x!=a3-1){
                int respuesta=num[x]*mul[i];
                
                System.out.println(num[x]+"x"+mul[i]+"="+respuesta);
                    
                }
                else{
                    
                if(i!=a4){
                     int respuesta=num[x]*mul[i];
                
                System.out.println(num[x]+"x"+mul[i]+"="+respuesta);
                }else{
                   
                x=num.length;
                    i=mul.length;
                }
                }
                
            }
            
            
        }
    }
}
