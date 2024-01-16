package taller.pkg11;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, promedio;
        String promedioCualitativo;
        System.out.print("Ingrese la primera nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        nota3 = scanner.nextDouble();
        System.out.print("Ingrese la cuarta nota: ");
        nota4 = scanner.nextDouble();
        promedio = calcularPromedio(nota1, nota2, nota3, nota4);
        promedioCualitativo = obtenerPromedioCualitativo(promedio);
        System.out.println("El promedio cualitativo es: " + promedioCualitativo);
    }

    static double calcularPromedio(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    static String obtenerPromedioCualitativo(double promedio) {
        String promedioCualitativo;
        if (promedio >= 0 && promedio <= 5) {
            promedioCualitativo = "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            promedioCualitativo = "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            promedioCualitativo = "Muy Bueno";
        } else if (promedio > 9 && promedio <= 10) {
            promedioCualitativo = "Sobresaliente";
        } else {
            promedioCualitativo = "Error en el cálculo";
        }

        return promedioCualitativo;
    }
}
/*  Ingrese la primera nota: 9
Ingrese la segunda nota: 8
Ingrese la tercera nota: 7
Ingrese la cuarta nota: 9
El promedio cualitativo es: Muy Bueno */