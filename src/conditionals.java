public class conditionals {
    public static void main(String args[]){
    //Conditional statements
        int a = 6, b = 7;


        if(a<b){
            System.out.println("Hello");
        }
        else if(a==b){
            System.out.println("World");
        }
        else{
            System.out.println("None");
        }

        String c = (a<b)?"Hello":"World";

        while(a<b){
            System.out.println("Less than");
        }

        for(int i =0; i<5; i++){
            System.out.println("Done");
        }
        do {
            System.out.println("First");
        }
        while (a<b);{
            System.out.println("Next");
        }
        int h = 1;
        switch(h){
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
        }

    }
}
