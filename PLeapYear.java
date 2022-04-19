public class PLeapYear {
    static int x = 2024;
    public static void main (String []args){
        if (x%100==0){
            if (x%400==0){
                System.out.println(x+" is a Leap year!!");
            }
            else{
                System.out.println(x+" is not a Leap Year!!");
            }
        }
        else if (x%4==0){
            System.out.println(x+" is Leap year");
        }
        else {System.out.println(x+" is not a Leap year!1");}
    }
}


