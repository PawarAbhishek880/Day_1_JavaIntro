public class EgStatic {
    static int a = 50;
    static int b = 40;
    static int c = a + b;
    static void fun(){
        System.out.println("Sum of Static variable is = " + c);
    }

    public static void main(String[] args) {
        fun();
    }
}
