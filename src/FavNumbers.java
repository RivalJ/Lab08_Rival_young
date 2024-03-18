import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "please input your favorite integer");
        favDouble = SafeInput.getDouble(in, "please input your favorite double");

        System.out.println("your favorite integer is: " + favInt);
        System.out.println("your favorite double is: " + favDouble);
    }
}
