public class Nine {

    // STATIC
    // In Java, static means that a member belongs to the class itself, rather than to individual objects of that class.
    class Student {
        static String college = "KLE Tech"; // college → belongs to the Student class
        String name;    // name → belongs to each Student object
    }

    // The static keyword can be used with: Variables, Methods, Blocks, Nested classes, Static imports
    class Demo {

        static int count;              // static variable or class variable: for every object of this class count same.

        static void display() {       // static method: Cannot be overridden.
            System.out.println(count);
        }

        static {                       // static block
            count = 10;
        }

        static class Inner {           // static nested class
        }
    }

    class staticDemo{
        static int count = 0;
        public staticDemo(){
            count++;
        }
    }
    public static void main(String[] args) {
        Nine n1 = new Nine();
        Student s1 = n1.new Student();
        Student s2 = n1.new Student();

        s1.name = "Sam";
        s2.name = "Jam";    // here both the objects have their own name.

        // s1.college = "djfs"; // The static field Nine.Student.college should be accessed in a static way
        // Student.college // There is only one college associated with the class.

        // Simple way to remember
        // Non-static = object-specific
        // Static = class-specific

        n1.new staticDemo();    // here the object is created but a reference to it is not created 
        n1.new staticDemo();    // if you want to ever access any variable or method associated with it u can do n1.new staticDemo().variableName, n1.new staticDemo().methodName()
        System.out.println(staticDemo.count);  // output : 2

    }
}
