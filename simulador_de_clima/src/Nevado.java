public class Nevado extends Clima {
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