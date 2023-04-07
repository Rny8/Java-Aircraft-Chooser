import java.util.Arrays;
import java.util.Random;
public class PlaneInventory {
    private Plane[] planes;

    public PlaneInventory(Plane[] startingPlanes){
        this.planes = startingPlanes;
    }

    public Plane[] getPlanes() {
        return this.planes;
    }

    public Plane[] searchPlane(int range, int type){
        Plane[] possiblePlanes = new Plane[0];
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getRange() >= range) {
                if (planes[i].getType() == type) {
                    possiblePlanes = Arrays.copyOf(possiblePlanes, possiblePlanes.length+1);
                    possiblePlanes[possiblePlanes.length-1] = planes[i];
                }
            }
        }
        return possiblePlanes;
    }

    public static Plane getRandomPlane(Plane[] planes){
        Random randomIndex = new Random();
        return planes[randomIndex.nextInt(planes.length)];
    }


}
