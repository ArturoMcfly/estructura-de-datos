
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class parImpar2parametros {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int opcion1;
        int opcion2;
        int arreglo[][] = new int[10][10];
        System.out.println("menu");
        System.out.println("1.-columna");
        System.out.println("2.-fila");
        opcion1 = Integer.parseInt(entrada.readLine());
        if (opcion1 == 1) {
            System.out.println("desea que muestre 1.-pares o 2.-impares");
            opcion2 = Integer.parseInt(entrada.readLine());
            if (opcion2 == 1) {
                for (int x = 0; x <= 9; x++) {
                    for (int y = 0; y <= 9; y++) {
                        if (y % 2 == 0) {
                            arreglo[x][y] = 1;
                        }
                    }

                }
                for (int x = 0; x <= 9; x++) {
                    for (int y = 0; y <= 9; y++) {
                        System.out.print("" + arreglo[x][y]);
                    }
                    System.out.println("");
                }
            } else {
                for (int x = 0; x <= 9; x++) {
                    for (int y = 0; y <= 9; y++) {
                        if (y % 2 != 0) {
                            arreglo[x][y] = 1;
                        }
                    }

                }
                for (int x = 0; x <= 9; x++) {
                    for (int y = 0; y <= 9; y++) {
                        System.out.print("" + arreglo[x][y]);
                    }
                    System.out.println("");
                }
            }
        } else {
            System.out.println("desea que muestre 1.-pares o 2.-impares");
            opcion2 = Integer.parseInt(entrada.readLine());
            if (opcion2 == 1) {
                for (int x = 0; x <= 9; x++) {
                    for (int y = 0; y <= 9; y++) {
                        if (x % 2 == 0) {
                            arreglo[x][y] = 1;
                        }
                    }

                }
                for (int x = 0; x <= 9; x++) {
                    for (int y = 0; y <= 9; y++) {
                        System.out.print("" + arreglo[x][y]);
                    }
                    System.out.println("");
                }
            } else {
                for (int x = 0; x <= 9; x++) {
                    for (int y = 0; y <= 9; y++) {
                        if (x % 2 != 0) {
                            arreglo[x][y] = 1;
                        }
                    }

                }
                for (int x = 0; x <= 9; x++) {
                    for (int y = 0; y <= 9; y++) {
                        System.out.print("" + arreglo[x][y]);
                    }
                    System.out.println("");
                }
            }
        }
    }
}
