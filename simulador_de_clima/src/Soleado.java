public class Soleado extends Clima {
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