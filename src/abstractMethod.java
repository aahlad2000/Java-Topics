abstract class abstractClass1{

    public abstract void myMethod();
}

public class abstractMethod extends abstractClass1{
    public void myMethod(){
        System.out.println("This is abstract method");
    }
    /*abstract class can only be accessed by inheritance.
    It cannot be accessed by creating objects of abstract class*/

    public static void main(String args[]){
        abstractMethod ob = new abstractMethod();
        ob.myMethod();
    }
}
