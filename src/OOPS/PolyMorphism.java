package OOPS;

public class PolyMorphism {
    public static class  Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class  Cat{
        void speak(){
            System.out.println("Meow");
        }
    }
    public static class  Lion{
        void speak(){
            System.out.println("Roar");
        }
    }
    public static class  Pikachu{
        void speak(){
            System.out.println("Pika");
        }

    }
    public static class  Human{
        void speak(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Dog tommy = new Dog();
        Cat c = new Cat();
        Human bishal = new Human();
        Pikachu p = new Pikachu();

        tommy.speak();
        c.speak();
        bishal.speak();
        p.speak();
        p.speak();


    }
}
