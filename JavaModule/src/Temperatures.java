import java.util.Scanner;

public class Temperatures {
    private double inputTemp, outputTemp;

    public void choiceTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature (in Celsius): ");
        inputTemp = scanner.nextDouble();
        menuT();
        scanner.close();
    }

    private void menuT(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert to (enter a number): \n1 - Kelvin, 2 - Fahrenheit, 3 - Bach to menu.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(toKelvin(inputTemp));
            case 2 -> System.out.println(toFahrenheit(inputTemp));
            case 3 -> MainMenu.main(null);
            default -> menuT();
        }
        scanner.close();
    }



    private String toKelvin(double inputTemp){
        outputTemp = 273.15 + inputTemp;
        return String.valueOf(outputTemp);
    }

    private String toFahrenheit(double inputTemp){
        outputTemp = (1.8 * inputTemp) + 32;
        return String.valueOf(outputTemp);
    }
}
