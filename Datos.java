import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre y la edad del usuario
        System.out.print("Ingrese su nombre: "); // Solicita al usuario que ingrese su nombre
        String nombre = scanner.nextLine(); // Lee el nombre ingresado por el usuario
        System.out.print("Ingrese su edad: "); // Solicita al usuario que ingrese su edad
        int edad = scanner.nextInt(); // Lee la edad ingresada por el usuario
        scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt()

        // Pedir los datos del vehículo
        System.out.println("\nIngrese los datos del vehículo:"); // Solicita al usuario que ingrese los datos del vehículo
        System.out.print("Marca: "); // Solicita al usuario que ingrese la marca del vehículo
        String marca = scanner.nextLine(); // Lee la marca del vehículo ingresada por el usuario
        System.out.print("Modelo: "); // Solicita al usuario que ingrese el modelo del vehículo
        String modelo = scanner.nextLine(); // Lee el modelo del vehículo ingresado por el usuario
        System.out.print("Cilindrada: "); // Solicita al usuario que ingrese la cilindrada del vehículo
        String cilindrada = scanner.nextLine(); // Lee la cilindrada del vehículo ingresada por el usuario
        System.out.print("Tipo de Combustible: "); // Solicita al usuario que ingrese el tipo de combustible del vehículo
        String tipoCombustible = scanner.nextLine(); // Lee el tipo de combustible del vehículo ingresado por el usuario
        System.out.print("Capacidad en pasajeros: "); // Solicita al usuario que ingrese la capacidad en pasajeros del vehículo
        int capacidadPasajeros = scanner.nextInt(); // Lee la capacidad en pasajeros del vehículo ingresada por el usuario

        // Mostrar los datos ingresados
        System.out.println("\nDatos ingresados:"); // Muestra los datos ingresados por el usuario
        System.out.println("Nombre: " + nombre); // Muestra el nombre ingresado por el usuario
        System.out.println("Edad: " + edad); // Muestra la edad ingresada por el usuario
        System.out.println("Datos del vehículo:"); // Muestra los datos del vehículo ingresados por el usuario
        System.out.println("Marca: " + marca); // Muestra la marca del vehículo ingresada por el usuario
        System.out.println("Modelo: " + modelo); // Muestra el modelo del vehículo ingresado por el usuario
        System.out.println("Cilindrada: " + cilindrada); // Muestra la cilindrada del vehículo ingresada por el usuario
        System.out.println("Tipo de Combustible: " + tipoCombustible); // Muestra el tipo de combustible del vehículo ingresado por el usuario
        System.out.println("Capacidad en pasajeros: " + capacidadPasajeros); // Muestra la capacidad en pasajeros del vehículo ingresada por el usuario
        
        // Cerrar el scanner
        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}
