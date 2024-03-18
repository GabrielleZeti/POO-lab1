import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        float num1, num2, total;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            if (opcion != 5) {
                System.out.print("Ingresa el primer numero: ");
                num1 = scanner.nextFloat();
                System.out.print("Ingresa el segundo numero: ");
                num2 = scanner.nextFloat();

                total = calcular(opcion, num1, num2);
                System.out.printf("El resultado es: %.2f%n", total);
            }
        } while (opcion != 5);

        System.out.println("Gracias");
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Selecciona una opcion:");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Salir");
    }

    public static float calcular(int opcion, float num1, float num2) {
        float total = 0;

        switch (opcion) {
            case 1:
                total = num1 + num2;
                break;
            case 2:
                total = num1 - num2;
                break;
            case 3:
                total = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    total = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;
            default:
                System.out.println("Opcion no valida, ingrese un numero del 1-5");
        }

        return total;
    }
}