import java.util.Scanner;

public class Distances {
    private double inputDistance, outputDistance;
    Scanner scanner = new Scanner(System.in);

    public void choice() {
        System.out.println("Enter the distance (in meters): ");
        inputDistance = scanner.nextDouble();
        menu();
    }

    private void menu(){
        System.out.println("Convert to (enter a number):" +
                "\n1 - to Miles, 2 - to Feet, 3 - to Inches, 4 - Back to menu.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(toMiles(inputDistance) + " miles.");
            case 2 -> System.out.println(toInches(inputDistance) + " inches.");
            case 3 -> System.out.println(toFeet(inputDistance) + " feet.");
            case 4 -> new Menu().menu();
            default -> menu();
        }
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