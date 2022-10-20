import java.util.Scanner;

public class CtoF_Converter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double temp = 0;
        int constant = 32;
        String Trash = "";
        boolean done = false;

        do {
            System.out.print("\n What is the temperature you wish to convert in Celsius: ");
            if (in.hasNextDouble()) {
                temp = in.nextDouble();
                in.nextLine();
                System.out.println("Your temperature in Fahrenheit is " + ((temp * 1.8) + constant));
                done = true;
                break;
            } else {
                Trash = in.nextLine();
                System.out.println(Trash + " is not a number, please input a number:");
            }

        }while(done = true);


    }
}