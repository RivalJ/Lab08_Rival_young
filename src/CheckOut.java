import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        int itemNum = 0;

        do{
            itemPrice = SafeInput.getRangedDouble(in,"please input the price of item " + itemNum + " ",10.00,.50);
            totalPrice += itemPrice;
            itemNum += 1;
            done = SafeInput.getYNconfirm(in,"are you done shopping?");
        }while(!done);

        System.out.printf("\n your total cost is: %05.2f" + "$",totalPrice);
    }
}
