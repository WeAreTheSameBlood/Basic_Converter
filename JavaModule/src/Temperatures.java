public class Temperatures {
    private double outputTemp;

    String toKelvin(double inputTemp){
        outputTemp = 273.15 + inputTemp;
        return String.valueOf(outputTemp);
    }

    String toFahrenheit(double inputTemp){
        outputTemp = (1.8 * inputTemp) + 32;
        return String.valueOf(outputTemp);
    }
}
