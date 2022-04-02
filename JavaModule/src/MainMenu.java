import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do yiu want to convert? \n1 - Temperatures; 2 - Distance;");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> new Temperatures().choice();
            case 2 -> new Distances().choice();
            default -> main(null);
        }
        scanner.close();
    }
}