
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class progra1 {

    public static void main(String[] args)throws IOException {
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        String[] matricula = {"16090302", "16090289", "16090210", "16090212"};
        String[] nombre = {"arturo", "salvador", "alejandro", "juan"};
        String[] direccion = {"Melchor Ocampo", "Lazaro Cardenas", "Camino Nuevo a Huixquilucan", "rio Hondo"};
        String[] telefono = {"5564830253", "5566232855", "5542238673", "5510045232"};
        String[] correo = {"arturo.hernan1289@hotmail.com", "koreback12@hotmail.com", "alucardhardy@hotmail.com", "solid-snake64@hotmail.com"};
        String[] alias = {"arthur", "juanito", "ale", "juan"};
        String[] hoobie = {"dibujar", "pintar", "dibujar", "videojuegos"};

        System.out.println("por donde desea encontrar datos");
        System.out.println("1.-matricula");
        System.out.println("2.-nombre");
        System.out.println("3.-direccion");
        System.out.println("4.-telefono");
        System.out.println("5.-correo");
        System.out.println("6.-alias");
        System.out.println("7.-hobbie");
        System.out.println("8.-salir");
        int opcion = Integer.parseInt(entrada.readLine());
        String opcion1;
        boolean encontrado = false;
        int indiceEncontrado = 0;
        
        switch (opcion) {
            case 1:
                System.out.println("dame la matricula");
                opcion1 = entrada.readLine();
                
                for (int x = 0; x < matricula.length; x++){
                    if (matricula[x].equals(opcion1)) {
                        encontrado = true;
                        indiceEncontrado =x;
                        x=matricula.length;
                    }

                }
                if (encontrado) {
                     System.out.println("datos encontrados");
                        System.out.println("nombre:    " + nombre[indiceEncontrado]);
                        System.out.println("direccion: " + direccion[indiceEncontrado]);
                        System.out.println("telefono:  " + telefono[indiceEncontrado]);
                        System.out.println("correo:    " + correo[indiceEncontrado]);
                        System.out.println("alias:     " + alias[indiceEncontrado]);
                        System.out.println("hoobie:    " + hoobie[indiceEncontrado]);

                }
                else{
                    System.out.println("los datos no existen");
                }
                break;
            case 2:

                System.out.println("dame el nombre");
                opcion1 = entrada.readLine();
                for (int x = 0; x < nombre.length; x++){
                    if (nombre[x].equals(opcion1)) {
                       
                        indiceEncontrado =x;
                         System.out.println("datos encontrados");
                        System.out.println("nombre:    " + nombre[indiceEncontrado]);
                        System.out.println("direccion: " + direccion[indiceEncontrado]);
                        System.out.println("telefono:  " + telefono[indiceEncontrado]);
                        System.out.println("correo:    " + correo[indiceEncontrado]);
                        System.out.println("alias:     " + alias[indiceEncontrado]);
                        System.out.println("hoobie:    " + hoobie[indiceEncontrado]);
                    }

                }
                if (indiceEncontrado==0) {
                    System.out.println("los datos no existen");
                }
                break;
            case 3:
                System.out.println("dame la direccion");
                opcion1 = entrada.readLine();
                for (int x = 0; x < direccion.length; x++){
                    if (direccion[x].equals(opcion1)) {
                       indiceEncontrado =x;
                         System.out.println("datos encontrados");
                        System.out.println("nombre:    " + nombre[indiceEncontrado]);
                        System.out.println("direccion: " + direccion[indiceEncontrado]);
                        System.out.println("telefono:  " + telefono[indiceEncontrado]);
                        System.out.println("correo:    " + correo[indiceEncontrado]);
                        System.out.println("alias:     " + alias[indiceEncontrado]);
                        System.out.println("hoobie:    " + hoobie[indiceEncontrado]);
                    }

                }
                if (indiceEncontrado==0) {
                    System.out.println("los datos no existen");
                }
                break;
                
            case 4:
                System.out.println("dame el telefono");
                opcion1 = entrada.readLine();
                for (int x = 0; x < telefono.length; x++){
                    if (telefono[x].equals(opcion1)) {
                         indiceEncontrado =x;
                         System.out.println("datos encontrados");
                        System.out.println("nombre:    " + nombre[indiceEncontrado]);
                        System.out.println("direccion: " + direccion[indiceEncontrado]);
                        System.out.println("telefono:  " + telefono[indiceEncontrado]);
                        System.out.println("correo:    " + correo[indiceEncontrado]);
                        System.out.println("alias:     " + alias[indiceEncontrado]);
                        System.out.println("hoobie:    " + hoobie[indiceEncontrado]);
                    }

                }
                if (indiceEncontrado==0) {
                    System.out.println("los datos no existen");
                }
                break;
            case 5:
                System.out.println("dame la correo");
                opcion1 = entrada.readLine();
                 for (int x = 0; x < correo.length; x++){
                    if (correo[x].equals(opcion1)) {
                        indiceEncontrado =x;
                         System.out.println("datos encontrados");
                        System.out.println("nombre:    " + nombre[indiceEncontrado]);
                        System.out.println("direccion: " + direccion[indiceEncontrado]);
                        System.out.println("telefono:  " + telefono[indiceEncontrado]);
                        System.out.println("correo:    " + correo[indiceEncontrado]);
                        System.out.println("alias:     " + alias[indiceEncontrado]);
                        System.out.println("hoobie:    " + hoobie[indiceEncontrado]);
                    }

                }
                if (indiceEncontrado==0) {
                    System.out.println("los datos no existen");
                }
                break;
            case 6:
                System.out.println("dame la alias");
                opcion1 = entrada.readLine();
                 for (int x = 0; x < alias.length; x++){
                    if (alias[x].equals(opcion1)) {
                       indiceEncontrado =x;
                         System.out.println("datos encontrados");
                        System.out.println("nombre:    " + nombre[indiceEncontrado]);
                        System.out.println("direccion: " + direccion[indiceEncontrado]);
                        System.out.println("telefono:  " + telefono[indiceEncontrado]);
                        System.out.println("correo:    " + correo[indiceEncontrado]);
                        System.out.println("alias:     " + alias[indiceEncontrado]);
                        System.out.println("hoobie:    " + hoobie[indiceEncontrado]);
                    }

                }
                if (indiceEncontrado==0) {
                    System.out.println("los datos no existen");
                }
                break;
            case 7:
                System.out.println("dame la hoobie");
                opcion1 = entrada.readLine();
                 for (int x = 0; x < hoobie.length; x++){
                    if (hoobie[x].equals(opcion1)) {
                         indiceEncontrado =x;
                         System.out.println("datos encontrados");
                        System.out.println("nombre:    " + nombre[indiceEncontrado]);
                        System.out.println("direccion: " + direccion[indiceEncontrado]);
                        System.out.println("telefono:  " + telefono[indiceEncontrado]);
                        System.out.println("correo:    " + correo[indiceEncontrado]);
                        System.out.println("alias:     " + alias[indiceEncontrado]);
                        System.out.println("hoobie:    " + hoobie[indiceEncontrado]);
                    }

                }
                if (indiceEncontrado==0) {
                    System.out.println("los datos no existen");
                }
                break;
            default:
                System.out.println("gracias");
                break;
        }

    }
}

    
    
    

