import java.util.Scanner;

public class Menu {
    @SuppressWarnings("InfiniteLoopStatement")
    void menu(){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What do yiu want to convert? \n1 - Temperatures; 2 - Distance;");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> new Temperatures().choice();
                case 2 -> new Distances().choice();
                default -> menu();
            }
            //scanner.close();
        }
    }
}