import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlaneInventory inventory = new PlaneInventory(new Plane[]{
                new Plane("Cessno 142", 50, 1, 90),
                new Plane("Cessno 146", 52, 1, 95),
                new Plane("Cessno 148", 250, 1, 250)
        });
        boolean isInputting = true;
        while (isInputting) {
            System.out.print("How many miles would you like to fly, buddster boi: ");
            int userMileRequest = Integer.valueOf(scanner.nextLine());
            System.out.print("\n What type of aircraft, budpalkicker: \n 1: Propellor \n 2: Jet \n 3: Any");
            int userTypeRequest = Integer.valueOf(scanner.nextLine());
            Plane[] possiblePlanes = inventory.searchPlane(userMileRequest, userTypeRequest);
            if (possiblePlanes.length == 0) {
                System.out.println("No matches found you dumbfuck change your parameters");
            } else {
                System.out.println("Here is our perfect system AI generated machine learning found plane just for your needs: " + PlaneInventory.getRandomPlane(possiblePlanes));
            }
        }
    }
}