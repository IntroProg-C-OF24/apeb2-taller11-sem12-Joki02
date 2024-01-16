package taller.pkg11;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese la dimensión de las matrices cuadradas:");
        int dimension = scanner.nextInt();

        int[][] matrizA = new int[dimension][dimension];
        int[][] matrizB = new int[dimension][dimension];

        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la matriz B:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizSuma = sumarMatrices(matrizA, matrizB, dimension);
        int[][] matrizResta = restarMatrices(matrizA, matrizB, dimension);
        int[][] matrizMultiplicacion = multiplicarMatrices(matrizA, matrizB, dimension);

        imprimirMatriz("Matriz A:", matrizA);
        imprimirMatriz("Matriz B:", matrizB);
        imprimirMatriz("Matriz Suma:", matrizSuma);
        imprimirMatriz("Matriz Resta:", matrizResta);
        imprimirMatriz("Matriz Multiplicación:", matrizMultiplicacion);

        scanner.close();
    }

    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB, int dimension) {
        int[][] resultado = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    public static int[][] restarMatrices(int[][] matrizA, int[][] matrizB, int dimension) {
        int[][] resultado = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        return resultado;
    }

    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB, int dimension) {
        int[][] resultado = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < dimension; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(String mensaje, int[][] matriz) {
        System.out.println(mensaje);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
 /* Ingrese la dimensión de las matrices cuadradas:
2
Ingrese los elementos de la matriz A:
5
6
7
8
Ingrese los elementos de la matriz B:
4
5
67
8
Matriz A:
5 6 
7 8 

Matriz B:
4 5 
67 8 

Matriz Suma:
9 11 
74 16 

Matriz Resta:
1 1 
-60 0 

Matriz Multiplicación:
422 73 
564 99 */