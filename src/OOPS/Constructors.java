package OOPS;

public class Constructors {
    public static class Car{
        int seats; // 0
        String name; // null
        double length; //0.0
        Car(){ // default constructor

        }
        Car(int x, String s, double d) { // parameterised constructor
            seats = x;
            name = s;
            length = d;

        }
        Car(String s, double d,int x) { // parameterised constructor
            seats = x;
            name = s;
            length = d;

        }


        void print(){
            System.out.println(seats+ " "+ name+" "+length+"m ");
        }
    }
    public static int max(int a, int b){
        return Math.max(a,b);
    }
    public static int max(int a, int b, int c){
        return Math.max(Math.max(a,b),c);
    }

    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia Sonnet",3.99);
        c1.print();
        Car c2 = new Car(4,"Lord Alto",3.75);
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda Amaze";
        c3.print();
        Car c4 = new Car("Mercedes S",4.8,5);

        System.out.println(max(4,5,7));
        // method overloading is when two methods have same name, but different parameters.

    }
}
