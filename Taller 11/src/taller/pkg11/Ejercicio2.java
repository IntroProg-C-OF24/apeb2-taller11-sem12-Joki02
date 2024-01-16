package taller.pkg11;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double respt;

        System.out.println("¿Qué desea realizar?");
        System.out.println("  [1] Calcular el área del cuadrado");
        System.out.println("  [2] Calcular el área del triángulo");
        System.out.println("  [3] Calcular el área del rectángulo");
        System.out.println("  [4] Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                respt = areaCuadrado();
                System.out.println("El área del cuadrado es: " + respt);
                break;
            case 2:
                respt = areaTriangulo();
                System.out.println("El área del triángulo es: " + respt);
                break;
            case 3:
                respt = areaRectangulo();
                System.out.println("El área del rectángulo es: " + respt);
                break;
            case 4:
                System.out.println("Saliendo de la calculadora");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

    static double areaCuadrado() {
        Scanner scanner = new Scanner(System.in);
        double respt, lado;

        System.out.println("Escriba el valor de un lado del cuadrado");
        lado = scanner.nextDouble();
        respt = lado * lado;
        return respt;
    }

    static double areaTriangulo() {
        Scanner scanner = new Scanner(System.in);
        double respt, base, altura;

        System.out.println("Escriba el valor de la base del triángulo");
        base = scanner.nextDouble();
        System.out.println("Escriba el valor de la altura del triángulo");
        altura = scanner.nextDouble();
        respt = base * altura / 2;
        return respt;
    }

    static double areaRectangulo() {
        Scanner scanner = new Scanner(System.in);
        double respt, base, altura;

        System.out.println("Escriba el valor de la base del rectángulo");
        base = scanner.nextDouble();
        System.out.println("Escriba el valor de la altura del rectángulo");
        altura = scanner.nextDouble();
        respt = base * altura;
        return respt;
    }
}

/* ¿Qué desea realizar?
  [1] Calcular el área del cuadrado
  [2] Calcular el área del triángulo
  [3] Calcular el área del rectángulo
  [4] Salir
1
Escriba el valor de un lado del cuadrado
8
El área del cuadrado es: 64.0 */