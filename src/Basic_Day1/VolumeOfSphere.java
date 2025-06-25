package Basic_Day1;

public class VolumeOfSphere {
    public static void main(String[] args) {
        // program for volume of sphere is 4/3 * pi * r * r * r
        double r = 5;
        double V = (4 / 3) * 3.145 * r * r * r;
        System.out.println(V);
        System.out.println("Radius of Sphere = " + r + "\nVolume of Sphere = " + V );
        double A = 4 * 3.145 * r * r;
        System.out.println("Radius of Sphere = " + r + "\nSurface Area of Sphere = " + V );


    }
}
