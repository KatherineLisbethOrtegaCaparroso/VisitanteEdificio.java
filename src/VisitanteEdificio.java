import java.util.Scanner;

public class VisitanteEdificio {
    public static void main(String[] args) {
        // Crear un objeto para leer datos de la consola
        Scanner scanner = new Scanner(System.in);

        // Declarar variables para almacenar la información
        String nombre;
        int edad;
        char genero;
        double altura;
        boolean residente;

        // Solicitar y leer datos
        System.out.print("Ingrese el nombre del visitante: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del visitante: ");
        edad = scanner.nextInt();

        System.out.print("Ingrese el género del visitante (M/F): ");
        genero = scanner.next().charAt(0);

        System.out.print("Ingrese la altura del visitante (en metros): ");
        altura = scanner.nextDouble();

        System.out.print("¿Es residente? (True/False): ");
        residente = scanner.nextBoolean();

        // Imprimir información del visitante
        System.out.println("\nInformación del Visitante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Residente: " + residente);

        // Cerrar el Scanner
        scanner.close();
    }
}
