/**
 * Created by Timothee on 30/07/2016.
 */
public class BadlionPoints {

    public static void main(String[] args){

        System.out.println("This code was created by Timothee Craig for him to apply for dev on badlion. Please do not reuse.");

        //These points are within 10
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(0, 5, 5);

        outputMessage(point1, point2);

        //These points are not within 10
        Point point3 = new Point();
        Point point4 = new Point(55.32f, 62.3f);

        outputMessage(point3, point4);

    }

    // The actual function from 3.
    private static boolean distanceWithin10(Point p1, Point p2){

        float xCoords = (p2.getX()-p1.getX());
        float yCoords = (p2.getY()-p1.getY());
        float zCoords = (p2.getZ()-p1.getZ());

        double distance = Math.sqrt(Math.pow(xCoords, 2)+Math.pow(yCoords, 2)+Math.pow(zCoords, 2));

        return (distance<=10);
    }

    private static void outputMessage(Point p1, Point p2) {
        if(distanceWithin10(p1, p2)){
            System.out.println("The two points are within 10.");
        }
        else {
            System.out.println("The two points are not within 10.");
        }
    }


}
