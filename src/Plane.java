public class Plane {
    private int range;
    private String name;
    private int type;
    private int speed;

    public Plane(String name, int range, int type, int speed){
        this.name = name;
        this.range = range;
        this.type = type;
        this.speed = speed;
    }

    public String getName(){
        return this.name;
    }

    public int getRange(){
        return this.range;
    }

    public int getType(){
        return this.type;
    }

    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return this.name + " (Range: " + this.range + " NM, Speed: " + this.speed + " KNOTS)";
    }
}

