//Program to understand the need of Java Interfaces.

/*Capturing similarities among unrelated classes without artificially forcing a class relationship.
* Declaring methods that one or more classes are expected to implement.
* Revealing an object's programming interface without revealing its class.*/
interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("coding , compiling and running...on a laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("coding , compiling and running...on a desktop");
    }
}
class Developer {
    public void devApp(Computer computer){
        //And after defining Computer interface we write Computer as type instead of laptop or desktop
        computer.code();
    }
}

public class NeedOfJavaInterfaces {
    public static void main(String[] args) {
        Developer developer = new Developer();
        /*Laptop laptop = new Laptop();
        * Desktop desktop = new Desktop();
        * developer.devApp(laptop);
        * developer.devApp(desktop); now this will create an error because in devApp we have passed laptop
        * even though we have a desktop class defined and logically both laptop and desktop should work
        * So instead we create another parent class named Computer and create an object of that
        * In this way we don't face a "type" error
        */
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        developer.devApp(laptop);
        developer.devApp(desktop);
    }
}
