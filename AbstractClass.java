abstract class Car{
    /*An abstract method can only be defined in an abstract class.
    * But an abstract class can have both (abstract , non-abstract) , only abstract , only non-abstract
    * all kinds of permutations and combinations */
    public abstract void drive();
    /*Right now drive is just an abstract idea that a car should know how to do.
    * But its actual implementation will be a task for a real car.
    * So we just declare an idea and leave the implementation
    * Ths declaration is done by the use of ABSTRACT keyword*/
    public abstract void fly();

    public void playMusic(){    //Non-abstract methods can be defined in an abstract class
        System.out.println("Playing Music..");
    }
}

abstract class WagonR extends Car{
    /*WagonR is a subClass of Car which will actually implement the drive function.
    * But it cannot implement fly() therefore we will need to define this class also as an abstract class*/
    public void drive(){
        System.out.println("Driving..");
    }
}

class UpdatedWagonR extends WagonR{
    /*This class that implements all the abstract methods is known as Concrete class
    * This class extends WagonR because it has definition of drive()*/
    public void fly() {
        System.out.println("Flying..");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        /*Car obj = new Car();    You cannot create an object of abstract class both Car and WagonR.
        * But you can create a reference i.e. we can write ( Car obj )*/
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
