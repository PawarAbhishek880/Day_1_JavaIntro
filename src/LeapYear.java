import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year :");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println(year + " is a Leap Year");
        }else if (year % 100 == 0){
            System.out.println(year + " is not a Leap Year");
        }else if (year % 4 == 0){
            System.out.println(year + " is a Leap Year");
        }else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
