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
            case 1 -> System.out.println(toMiles(inputDistance));
            case 2 -> System.out.println(toInches(inputDistance));
            case 3 -> System.out.println(toFeet(inputDistance));
            case 4 -> new Menu().menu();
            default -> menu();
        }
    }

    private String toMiles(double inputDistance){
        outputDistance =  inputDistance / 1609.34;
        new SaveToHistory().save(outputDistance + " miles");
        return outputDistance + " miles";
    }

    private String toFeet(double inputDistance){
        outputDistance = inputDistance * 3.28084;
        new SaveToHistory().save(outputDistance + " feet");
        return outputDistance + " feet";
    }

    private String toInches(double inputDistance){
        outputDistance = inputDistance * 39.3701;
        new SaveToHistory().save(outputDistance + " inches");
        return outputDistance + " inches";
    }
}