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

class Clima{
    String ciudad;

    public Clima(String ciudad){
        this.ciudad = ciudad;
    }

    // Getters
    public String getCondicion(){
        return "Clima";
    }

    public double getTemperatura() {
        return 0;
    }

    public double getHumedad() {
        return 0;
    }
}

class Soleado extends Clima {
    // Constantes de temperatura y humedad
    private static final double TEMP_MIN = 30.0;
    private static final double TEMP_MAX = 40.0;
    private static final int HUM_MIN = 40;
    private static final int HUM_MAX = 60;

    public Soleado(String ciudad) {
        super(ciudad);
    }

    @Override
    public String getCondicion() {
        return "Soleado";
    }

    @Override
    public double getTemperatura() {
        // Obtenemos un numero aleatorio entre la temperatura minima y maxima
        return TEMP_MIN + (Math.random() * (TEMP_MAX - TEMP_MIN));
    }

    @Override
    public double getHumedad() {
        // Obtenemos un número aleatorio entre la humedad minima y maxima
        return HUM_MIN + (Math.random() * (HUM_MAX - HUM_MIN));
    }
}

class Lluvioso extends Clima {
    // Constantes de temperatura y humedad
    private static final double TEMP_MIN = 10.0;
    private static final double TEMP_MAX = 20.0;
    private static final int HUM_MIN = 60;
    private static final int HUM_MAX = 90;

    public Lluvioso(String ciudad) {
        super(ciudad);
    }

    @Override
    public String getCondicion() {
        return "Lluvioso";
    }

    @Override
    public double getTemperatura() {
        // Obtenemos un número aleatorio entre la temperatura minima y maxima
        return TEMP_MIN + (Math.random() * (TEMP_MAX - TEMP_MIN));
    }

    @Override
    public double getHumedad() {
        // Obtenemos un número aleatorio entre la humedad minima y maxima
        return HUM_MIN + (Math.random() * (HUM_MAX - HUM_MIN));
    }
}

class Nevado extends Clima {
    // Constantes de temperatura y humedad
    private static final double TEMP_MIN = -10.0;
    private static final double TEMP_MAX = 10.0;
    private static final int HUM_MIN = 60;
    private static final int HUM_MAX = 80;

    public Nevado(String ciudad) {
        super(ciudad);
    }

    @Override
    public String getCondicion() {
        return "Nevado";
    }

    @Override
    public double getTemperatura() {
        // Obtenemos un número aleatorio entre la temperatura minima y maxima
        return TEMP_MIN + (Math.random() * (TEMP_MAX - TEMP_MIN));
    }

    @Override
    public double getHumedad() {
        // Obtenemos un número aleatorio entre la humedad minima y maxima
        return HUM_MIN + (Math.random() * (HUM_MAX - HUM_MIN));
    }
}