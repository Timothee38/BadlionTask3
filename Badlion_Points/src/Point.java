import java.util.ArrayList;
import java.util.List;

/**
 * Created by Timothee on 30/07/2016.
 */
public class Point {
    public float xCoord;
    public float yCoord;
    public float zCoord;

    public Point(float x, float y, float z){
        this.setCoords(x, y, z);
    }

    public Point(float x, float y) {
        this(x, y, 0);
    }

    public Point(float x) {
        this(x, 0, 0);
    }

    public Point(){
        this(0, 0, 0);
    }

    public List<Float> getCoords() {
        List<Float> coordinates = new ArrayList<>();
        coordinates.add(this.xCoord);
        coordinates.add(this.yCoord);
        coordinates.add(this.zCoord);
        return coordinates;
    }

    public float getX(){
        return this.xCoord;
    }

    public float getY(){
        return this.yCoord;
    }

    public float getZ(){
        return this.zCoord;
    }

    private void setCoords(float x, float y, float z){
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

}
