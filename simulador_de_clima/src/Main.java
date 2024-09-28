import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Sistema de Simulación de Clima Personalizado:
//        Crea un simulador de clima que permita al usuario ingresar una ciudad y muestre
//        un clima simulado basado en condiciones (Soleado, Lluvioso, Nevado) que
//        hereden de una clase Clima. Usa constantes para valores de temperatura y
//        humedad y aplica un switch para seleccionar la condición climática, mostrando
//        cambios a lo largo de un ciclo de 7 días (simulados con ciclos y condicionales).

        String[] condiciones = {"Soleado", "Lluvioso", "Nevado"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la ciudad: ");
        String ciudad = scanner.nextLine();

        Lluvioso lluvioso = new Lluvioso(ciudad);
        Soleado soleado = new Soleado(ciudad);
        Nevado nevado = new Nevado(ciudad);

        for (int i = 0; i < 7; i++) {
            int random = (int) (Math.random() * 3);
            switch (condiciones[random]) {
                case "Soleado":
                    System.out.println("\nDía " + (i + 1) + ": " + soleado.getCondicion() + " en " + ciudad + " con una temperatura de " + soleado.getTemperatura() + "°C y una humedad de " + soleado.getHumedad() + "%");
                    break;
                case "Lluvioso":
                    System.out.println("\nDía " + (i + 1) + ": " + lluvioso.getCondicion() + " en " + ciudad + " con una temperatura de " + lluvioso.getTemperatura() + "°C y una humedad de " + lluvioso.getHumedad() + "%");
                    break;
                case "Nevado":
                    System.out.println("\nDía " + (i + 1) + ": " + nevado.getCondicion() + " en " + ciudad + " con una temperatura de " + nevado.getTemperatura() + "°C y una humedad de " + nevado.getHumedad() + "%");
                    break;
            }

            // Esperar 5 segundos
            for(int j = 0; j < 5; j++){
                System.out.print(".");
                Thread.sleep(1000);
            }
        }
    }
}