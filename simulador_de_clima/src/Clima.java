public class Clima{
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