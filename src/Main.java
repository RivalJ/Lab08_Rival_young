import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sayHello(3);
        sayMessage("hi from a method", 10);
        double fTemp = 0.0;
        fTemp = CtoF(100);
        System.out.println(fTemp);

        int userAge = 0;
        userAge = getAge();
    }

    private static void sayHello(){
        System.out.println("Hello!");
    }
    private static void sayHello(int reps){
        for (int h = 0; h<reps; h++)
        System.out.println("Hello!");
    }
    private static void sayMessage(String msg, int reps){
        for(int h =0; h<reps; h++)
        System.out.println(msg);
    }
    private static double CtoF(double cTemp){

        double fTemp=0.0;
        fTemp = cTemp*9.0/5.0+32.0;
        return fTemp;
    }


    private static int getAge(){

        Scanner in = new Scanner(System.in);

        int age = 0;
        String trash = "";

        if(in.hasNextInt()){
            age = in.nextInt();
            in.nextLine();
            System.out.println(age);
        }
        else{
            trash=in.next();
            System.out.println("invalid input: " + trash);
        }

        return age;


    }

    /**
     * Gets an unranged int value from the user
     * @param pipe     - a Scanner set on System.in to read from the console
     * @param prompt   - msg to tell the user what to input
     * @return         - an int provided by the user
     */

}