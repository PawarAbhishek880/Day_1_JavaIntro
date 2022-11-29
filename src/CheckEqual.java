import java.util.Scanner;
public class CheckEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println("Your first entered string is: " + str1);
        System.out.println("Your second entered string is: " + str2);

        System.out.println(str1.equals(str2)); //PRINTS IN TRUE OR FALSE
        System.out.println(str1.equalsIgnoreCase(str2));
    }

}
