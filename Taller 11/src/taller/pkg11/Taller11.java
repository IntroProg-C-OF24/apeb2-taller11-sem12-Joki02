package taller.pkg11;
import java.util.Random;
public class Taller11 {
   public static void main(String[] args) {
        int limF = 3;
        int limC = 3;
        int[][] arreglo1 = new int[limF][limC];
        Random rand = new Random();

        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                arreglo1[i][j] = rand.nextInt(100) + 1;
            }
        }

        System.out.println("El arreglo es:");
        imprimirArreglo(arreglo1);

        System.out.print("Los numeros pares son: ");
        Pares(arreglo1, limF, limC);
        System.out.println();

        System.out.print("Los numeros impares son: ");
        Impares(arreglo1, limF, limC);
        System.out.println();

        double respt4 = Promedio(arreglo1, limF, limC);
        System.out.println("El promedio es: " + respt4);
    }

    static void imprimirArreglo(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Pares(int[][] arreglo, int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if (arreglo[i][j] % 2 == 0) {
                    System.out.print(arreglo[i][j] + " ");
                }
            }
        }
    }

    static void Impares(int[][] arreglo, int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if (arreglo[i][j] % 2 != 0) {
                    System.out.print(arreglo[i][j] + " ");
                }
            }
        }
    }

    static double Promedio(int[][] arreglo, int limF, int limC) {
        double total = 0;

        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                total += arreglo[i][j];
            }
        }

        return total / (limF * limC);
    }
}
 /*El arreglo es:
90 100 69 
71 55 45 
73 55 17 
Los numeros pares son: 90 100 
Los numeros impares son: 69 71 55 45 73 55 17 
El promedio es: 63.888888888888886 */