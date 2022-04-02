import java.util.Scanner;

public class Distances {
    private double inputDistance, outputDistance;

    public void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance (in meters): ");
        inputDistance = scanner.nextDouble();
        menu();
        scanner.close();
    }

    private void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert to (enter a number):" +
                "\n1 - to Miles, 2 - to Feet, 3 - to Inches, 4 - Back to menu.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(toMiles(inputDistance) + " miles.");
            case 2 -> System.out.println(toInches(inputDistance) + " inches.");
            case 3 -> System.out.println(toFeet(inputDistance) + " feet.");
            case 4 -> MainMenu.main(null);
            default -> menu();
        }
        scanner.close();
    }

    private String toMiles(double inputDistance){
        outputDistance =  inputDistance / 1609.34;
        return String.valueOf(outputDistance);
    }

    private String toFeet(double inputDistance){
        outputDistance = inputDistance * 3.28084;
        return String.valueOf(outputDistance);
    }

    private String toInches(double inputDistance){
        outputDistance = inputDistance * 39.3701;
        return String.valueOf(outputDistance);
    }
}
