import java.util.Scanner;

public class Temperatures {
    private double inputTemp, outputTemp;

    public void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature (in Celsius): ");
        inputTemp = scanner.nextDouble();
        menu();
        scanner.close();
    }

    private void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert to (enter a number):" +
                "\n1 - to Kelvin, 2 - to Fahrenheit, 3 - Back to menu.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(toKelvin(inputTemp) + "°K");
            case 2 -> System.out.println(toFahrenheit(inputTemp)+"°F");
            case 3 -> MainMenu.main(null);
            default -> menu();
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
