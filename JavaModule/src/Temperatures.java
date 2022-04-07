import java.util.Scanner;

public class Temperatures {
    private double inputTemp, outputTemp;
    Scanner scanner = new Scanner(System.in);

    public void choice() {
        System.out.println("Enter the temperature (in Celsius): ");
        inputTemp = scanner.nextDouble();
        menu();
    }

    private void menu(){
        System.out.println("Convert to (enter a number):" +
                "\n1 - to Kelvin, 2 - to Fahrenheit, 3 - Back to menu.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(toKelvin(inputTemp));
            case 2 -> System.out.println(toFahrenheit(inputTemp));
            case 3 -> new Menu().menu();
            default -> menu();
        }
    }

    private String toKelvin(double inputTemp){
        outputTemp = 273.15 + inputTemp;
        new SaveToHistory().save(outputTemp + "°K");
        return outputTemp + "°K";
    }

    private String toFahrenheit(double inputTemp){
        outputTemp = (1.8 * inputTemp) + 32;
        new SaveToHistory().save(outputTemp + "°F");
        return outputTemp + "°F";
    }
}