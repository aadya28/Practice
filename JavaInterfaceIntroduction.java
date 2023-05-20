//Program to understand interfaces in java.
interface I {
    /*In a Java Interface all methods are by default public and abstract .
    * And similar to an abstract class we can create a reference of this object ,but we cannot instantiate it*/
    void  print();
    void  config();
    /*Here by default any variable we declare is Static and Final
    * so writing int age; will give error*/

    int age = 20;
    String name = "aadya";
}

class C implements I {
    /*Here it again becomes a necessity now to define all the abstract methods
    * and if we don't define them all then this class becomes an abstract class. */
    public void print(){
        System.out.println("printing..");
    }
    public void config(){
        System.out.println("Configuring...");
    }
}

public class JavaInterfaceIntroduction {
    public static void main(String[] args) {
        I obj;      //can create a reference of an Interface
        // obj = new A();    we cannot create an instance.
        obj = new C();
        obj.print();
        obj.config();
        /*A.age = 21; we cannot do this as age is Final
        * Because interface just implements ,and it has a definite memory
        * Also since it is static we call directly access it, we don't need to use or declare an object*/
        System.out.println(I.age);
        System.out.println(I.name);
    }
}
