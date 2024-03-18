import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = "";
        String mNum = "";
        String menu = "";

        String saveDataSsn = "";
        String saveDataMnum = "";

        boolean done = false;

        ssn = SafeInput.getRegExString(in,"please input your SSN","^\\d{3}-\\d{2}-\\d{4}$");
        mNum = SafeInput.getRegExString(in,"please input your Mnumber","^(M|m)\\d{5}$");


        do {
            System.out.println("You may now open, save, view, or quit");
            menu = SafeInput.getRegExString(in,"what would you like to do? [O,S,V,Q]", "^[OoSsVvQq]$");
            switch (menu) {
                case "O":
                case "o":
                    System.out.println("opening data entry...");
                    ssn = SafeInput.getRegExString(in, "please input your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
                    mNum = SafeInput.getRegExString(in, "please input your Mnumber", "^(M|m)\\d{5}$");
                    break;

                case "S":
                case "s":
                    System.out.println("saving data...");
                    saveDataSsn = ssn;
                    saveDataMnum = mNum;
                    System.out.println("data saved!");
                    break;

                case "V":
                case "v":
                    if(saveDataSsn.length() == 0 && saveDataMnum.length() == 0) {
                        System.out.println("No data saved! please select save, or open to re-enter data");
                        System.out.println();
                    }
                    else {
                        System.out.println("viewing user data: ");
                        System.out.println("SSN: " + saveDataSsn);
                        System.out.println("Mnumber: " + saveDataMnum);
                    }
                    break;

                case "Q":
                case "q":
                    System.out.println("goodbye");
                    done = true;
                    break;
            }
        }while(!done);


    }
}
