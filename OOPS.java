//Program to understand Inheritance , Overriding , super keyword , instanceof keyword and java iterator in a class.
import java.util.ArrayList;
import java.util.Iterator;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    /*Inheritance : When a child class extends its parent class it inherits all the methods that are already defined in the parent class.
    * Overriding : But we can still redefine those methods and use them provided the method name, parameters everything is exactly the same.
    */
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Badminton extends Sports{
    String getName(){
        return "Badminton Class";
    }
    /* Super Keyword : If we have overridden a method we can still call the method defined in the parent class by using SUPER keyword.
    */
    Badminton(){
        System.out.println("Without using super keyword "+ getName());

        String temp=super.getName();

        System.out.println("Using super Keyword "+ temp );
    }

}

class OOPS {
    public static void main(String[] args) {
        Sports sports = new Sports();
        Soccer soccer = new Soccer();
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
        Badminton badminton = new Badminton();
        /*The instanceof keyword checks whether an object is an instance of a specific class or an interface.
        * It compares the instance with type. The return value is either true or false.*/
        System.out.println(badminton instanceof Badminton);

        /*An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.*/
        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        Iterator it = mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
