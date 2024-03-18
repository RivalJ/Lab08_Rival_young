import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "please input your birth year",2015,1950);
        birthMonth = SafeInput.getRangedInt(in,"please input your birth month",12,1);

        switch(birthMonth){
            case 11:
            case 4:
            case 9:
            case 6:
                birthDay = SafeInput.getRangedInt(in, "please input your birthday",30,1);
                break;

            case 2:
                birthDay = SafeInput.getRangedInt(in, "please input your birthday",28,1);
                break;

            default:
                birthDay = SafeInput.getRangedInt(in, "please input your birthday",31,1);
                break;
        }
        birthHour = SafeInput.getRangedInt(in,"please input your birth hour",24,1);
        birthMinute = SafeInput.getRangedInt(in,"please input your birth minute",60,0);

        if(birthMinute<10)
            System.out.println("you were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + "0" + birthMinute );
        else
            System.out.println("you were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}
