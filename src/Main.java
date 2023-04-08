import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static Scanner scanner;
    static PlaneInventory inventory = new PlaneInventory(new Plane[]{
            new Plane("Cessno 142", 50, 1, 90),
            new Plane("Cessno 146", 52, 1, 95),
            new Plane("Cessno 148", 250, 2, 250)
    });
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        boolean isInputting = true;
        while (isInputting) {
            System.out.print("How many miles would you like to fly, buddster boi: ");
            int userMileRequest = Integer.valueOf(scanner.nextLine());
            System.out.print("\n What type of aircraft?: \n 1: Propeller \n 2: Jet \n 3: Any");
            if (scanner.hasNextInt() == false) {
                System.out.println("What you have entered is not valid! Please make sure you enter a number");
                scanner.nextLine();
            }
            else if (scanner.hasNextInt() == true){
                int userTypeRequest = Integer.valueOf(scanner.nextLine());
                Plane[] possiblePlanes = inventory.searchPlane(userMileRequest, userTypeRequest);
                if (possiblePlanes.length == 0) {
                    System.out.println("No matches found with Given Parameters would you like to add an aircraft or try-again with new paramters?: \n 1: Try again \n 2: Add new plane");
                    int userAddOrChooseAnother = Integer.valueOf(scanner.nextLine());
                    if (userAddOrChooseAnother == 2) {
                        buildPlane();
                    }
                } else {
                    System.out.println("Here is our chosen aircraft based on given parameters: " + PlaneInventory.getRandomPlane(possiblePlanes));
                    System.out.println("Would you like to choose another aircraft or add another aircraft? \n 1: Add aircraft \n 2: Choose another aircraft");
                    int userAddOrChooseAnother = Integer.valueOf(scanner.nextLine());
                    if (userAddOrChooseAnother == 1) {
                        buildPlane();
                    }
                }
            }
        }
    }

    private static void buildPlane(){
            System.out.print("What is the name of the aircraft?: ");
            String newName = scanner.nextLine();
            System.out.print("What is the range of the aircraft?: ");
            int newRange = Integer.valueOf(scanner.nextLine());
            System.out.print("What is the type of aircraft?\n 1: Propellor \n 2: Jet");
            int newType = Integer.valueOf(scanner.nextLine());
            System.out.print("What is the speed of da aircraft dawg: ");
            int newSpeed = Integer.valueOf(scanner.nextLine());
            inventory.addPlane(newName, newType, newSpeed, newRange);
    }
}
