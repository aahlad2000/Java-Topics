abstract class Main{

    void myMethod(){
        System.out.println("This is a sample");
    }
}

public class abstractClass extends Main
{
    /*abstract class can only be accessed by inheritance.
     it cannot be accessed by creating objects of abstract class
     */

    public static void main(String args[]){
        abstractClass ob = new abstractClass();
        ob.myMethod();
    }
}

