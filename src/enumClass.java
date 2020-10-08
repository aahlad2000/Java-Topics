enum Week{
    //This is enum class.It can be also used in a class
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}



public class enumClass {
    public static void main(String args[]) {
        Week ob = Week.valueOf("SUNDAY");
        System.out.println(ob);
        for (Week day : Week.values()) { //for-each loop in enum class
            System.out.println(day);
        }
    }
}
