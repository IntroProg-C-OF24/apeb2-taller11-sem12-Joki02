package taller.pkg11;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombreCliente, cedulaCliente;
        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular valor de la planilla de luz");
        System.out.println("2. Calcular valor del predio");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre del cliente: ");
                nombreCliente = scanner.next();
                System.out.print("Ingrese la cédula del cliente: ");
                cedulaCliente = scanner.next();
                calcularValorLuz(nombreCliente, cedulaCliente);
                break;
            case 2:
                System.out.print("Ingrese el nombre del cliente: ");
                nombreCliente = scanner.next();
                System.out.print("Ingrese la cédula del cliente: ");
                cedulaCliente = scanner.next();
                calcularPredio(nombreCliente, cedulaCliente);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
    
    static void calcularValorLuz(String nombreCliente, String cedulaCliente) {
        Scanner scanner = new Scanner(System.in);
        double valorKilowatio, numKilowatios, valorPagar;
        System.out.print("Ingrese el valor del kilowatio: ");
        valorKilowatio = scanner.nextDouble();
        System.out.print("Ingrese el número de kilowatios del mes: ");
        numKilowatios = scanner.nextDouble();
        valorPagar = valorKilowatio * numKilowatios;
        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente +
                " debe cancelar el valor de $" + valorPagar);
    }

    // Procedimiento para calcular el valor del predio
    static void calcularPredio(String nombreCliente, String cedulaCliente) {
        Scanner scanner = new Scanner(System.in);
        double valorInmueble, valorPredio;
        System.out.print("Ingrese el valor del inmueble: ");
        valorInmueble = scanner.nextDouble();
        valorPredio = valorInmueble * 0.02;
        System.out.println("Cliente " + nombreCliente + " con cédula " + cedulaCliente +
                " tiene un bien inmueble valorado en $" + valorInmueble +
                " y tiene que pagar de predio $" + valorPredio);
    }
}
/*Seleccione una opción:
1. Calcular valor de la planilla de luz
2. Calcular valor del predio
1
Ingrese el nombre del cliente: Bryan Alao
Ingrese la cédula del cliente:1150457875 
Ingrese el valor del kilowatio: 5
Ingrese el número de kilowatios del mes: 15
Cliente Bryan Alao con cédula 1150457875 debe cancelar el valor de $75.0 */