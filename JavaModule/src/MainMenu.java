import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperatures temperatures = new Temperatures();

        System.out.println("Enter the temperature (in Celsius): ");
        double inputTemp = scanner.nextDouble();

        System.out.println("Convert to (enter a number): 1 - Kelvin, 2 - Fahrenheit");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> System.out.println(temperatures.toKelvin(inputTemp));
            case 2 -> System.out.println(temperatures.toFahrenheit(inputTemp));
            default -> System.out.println("Error");
        }

    }
}
