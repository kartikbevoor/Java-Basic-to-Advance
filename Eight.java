public class Eight {

    // INTERFACE
    // An interface is a contract that specifies what a class must do, 
    // without necessarily specifying how it should do it.
    // A class can implement the interface
    // Any class implementing interface must provide a method specified by interface
    
    public interface Drawable { // here the interface says any class implementing drawable must provide draw.
        // Variables declared in side a interface are public, static and final.
        // note: interface methods are traditionally abstract methods which they has be overriden by the implementing class.
        void draw();
    }

    public static  class Square implements Drawable {
        @Override 
        public void draw(){
            System.out.println("Drawing Square");
        }
        
    }

    public interface Animal {
        void sound();
    }

    public static class Dog implements Animal {
        @Override 
        public void sound(){
            System.out.println("Bow Bow");
        }
    }

    // Multiple Inheritance Using Interfaces

    interface Camera {
        void takePhoto();
    }

    interface MusicPlayer {
        void playMusic();
    }

    static class Smartphone implements Camera, MusicPlayer {

        @Override
        public void takePhoto() {
            System.out.println("Taking photo");
        }

        @Override
        public void playMusic() {
            System.out.println("Playing music");
        }
    }

    // ENCAPSULATION: Encapsulation means wrapping data (variables) and the methods 
    // that operate on that data inside a class, while controlling how the data can be 
    // accessed from outside the class.
    // The main purpose is data protection and controlled access.
    // The idea behind encapsulation: The data is protected, and access to it happens through controlled methods.

    // Encapsulation: getters and setters
    static class Employee{
        private int id;
        private String name;

        public void setIdName(int id, String name){
            this.id = id;
            this.name = name;
        }

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }
    }

    // POLYMORPHISM: means poly - many, morphism - forms. So, polymorphism means "one thing taking many forms."
    // In Java, polymorphism mainly allows the same method call or reference to behave differently depending on the object involved.

    static class Animal2 {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog2 extends Animal2 {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal2 {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Drawable drawable = new Square();   // here the reference type is Drawable, but the actual object is Square
        drawable.draw();

        // Drawable d = new Drawable // This is invalid: Because an interface generally defines a contract rather than a concrete object implementation.

        Animal animal = new Dog(); // Animal reference type, animal reference and new actual object 
        // The reference says: I can access things defined by Animal.
        // The object says: At runtime, I am actually a Dog.
        animal.sound(); // calls Dog.sound(), this is runtime polymorphism.

        // Encapsulation
        Employee employee = new Employee();
        // employee.id = 12; this gives error because it is a private variable
        // employee.name = "dsaf"; this gives error because it is a private variable
        employee.setIdName(12, "sdfsd");
        System.out.println(employee.getId());
        System.out.println(employee.getName());

        // Polymorphism
        Animal2 a1 = new Dog2();
        Animal2 a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}
