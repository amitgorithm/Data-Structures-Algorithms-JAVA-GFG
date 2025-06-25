package Basic_Day1;

public class TotalSurfaceAreaOfCuboid {
    // length, breadth, height
    public static void main(String[] args) {
        double l = 20;
        double w = 30;
        double h = 40;
        double TSA = 2 * (l*w + w*h + l*h) ;
        double A = l * w * h ;
        System.out.println("TSA of cuboid whose length = " + " " + l + ", width = " + w + ", height = " + h + " is = " + TSA + "\nVolume of the cuboid = " + A );



    }
}
