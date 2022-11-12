import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int user_input = input.nextInt(); // terima input

        // kena terima nombor 1 , 2 dan 3 sahaja
        // jadinya, selagi user masukkan input selain ini, kita keep
        // asking them to enter the number

        while (!(user_input == 1 || user_input == 2 || user_input == 3)) {
            System.out.print("Enter first number- ");
            user_input = input.nextInt(); // input baru sebab dia salah masuk nombor
            System.out.println("this is a "+ user_input);
            if (user_input == 1 || user_input == 2 || user_input == 3) {
                break;
            }
        }

        System.out.println("this is final user input "+ user_input);



    }
}