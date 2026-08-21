import java.util.Scanner;

public class EjercicioConsolidado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu nombre y Apellido: ");
        String nombreApellido = entrada.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        System.out.print("Ingresa tu nota: ");
        int nota = entrada.nextInt();

        String clasificacion;

        System.out.println("********** Resultados **********");
        System.out.println("Estudiante: " + nombreApellido);

        if (edad < 15 || edad > 100) {
            System.out.println("Edad inválida");

        } else {
            System.out.println("Edad: " + edad);

            if (nota < 0 || nota > 20) {
                System.out.println("Nota inválida");

            } else {
                System.out.println("Nota: " + nota);

                if (nota <= 10) {
                    clasificacion = "Desaprobado";

                } else if (nota <= 13) {
                    clasificacion = "Regular";

                } else if (nota <= 17) {
                    clasificacion = "Bueno";

                } else {
                    clasificacion = "Excelente";
                }

                System.out.println("clasificación: " + clasificacion);

                if (nota <= 10) {
                    System.out.println("Estado: No aprobó");

                } else {
                    System.out.println("Estado: Aprobó");

                }
            }
        }
    }
}