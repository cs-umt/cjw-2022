import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int user_input = input.nextInt(); // terima input, then masukkan dalam variable

        // kena terima nombor 1 , 2 dan 3 sahaja
        // jadinya, selagi user masukkan input selain ini, kita keep asking them to
        // enter the number
        // maksudnya selagi input bukan 1 atau input bukan 2 atau input bukan 3, minta
        // user input nombor baru
        // translate ayat di atas jadi coding
        // kalau input != 1 || input != 2 || input != 3

        while (!(user_input == 1 || user_input == 2 || user_input == 3)) {
            System.out.println("***");
            System.out.print("Enter first number- ");
            user_input = input.nextInt(); // input baru sebab dia salah masuk nombor, then masukkan balik ke variable
                                          // yang kita nak masukkan tadi (variable user_input)
            System.out.println("Your new number is: " + user_input);
            System.out.println("Please enter number from 1, 2 or 3.");

            // apabila dalam loop, mesti ada condition untuk keluar, contoh nya seperti di
            // bawah.
            // kalau input dah betul, maksudnya input ialah 1 atau input ialah 2 atau input
            // ialah 3, then keluar loop
            if (user_input == 1 || user_input == 2 || user_input == 3) {
                break; // guna break untuk keluar loop
            }
        }

        // giliran computer untuk generate random number.
        // computer to generate random number by using Math.random, can use any other
        // way u found.
        // google how to generate random numbers in java, ambil mana mana, try error
        // https://www.educative.io/answers/how-to-generate-random-numbers-in-java
        int min = 1;
        int max = 3;
        int computer_number = (int) Math.floor(Math.random() * (max - min + 1) + min); //

        System.out.println("***");
        System.out.println("Number from user:" + user_input);
        System.out.println("Number from computer: " + computer_number);

        // kita define nombor ni sendiri
        // 1 scissor, 2 paper, 3 stone

        // optional. play with string data type. beri makna kepada nombor nombor ini.
        String user_choice = "";
        String computer_choice = "";

        if (user_input == 1) {
            user_choice = "Scissor";
        } else if (user_input == 2) {
            computer_choice = "Paper";
        } else if (user_input == 3) {
            computer_choice = "Stone";
        }

        if (computer_number == 1) {
            user_choice = "Scissor";
        } else if (computer_number == 2) {
            computer_choice = "Paper";
        } else if (computer_number == 3) {
            computer_choice = "Stone";
        }

        System.out.println("***");
        System.out.println("User choice is: " + user_choice);
        System.out.println("Computer choice is: " + computer_choice);

        // kira berapa kali user menang, berapa kali computer menang.
        int user_win = 0;
        int computer_win = 0;

        // so kita dah ada nombor from user dan computer. kita check values from these
        System.out.println("***");
        if (user_input == computer_number) {
            System.out.println("IT'S A TIE !");
        } else if (user_input == 1 && computer_number == 2) { // user = gunting, computer = paper, so user menang
            System.out.println("You win!");
            user_win++;
        } else if (user_input == 1 && computer_number == 3) {
            System.out.println("Computer menang :P");
            computer_win++;
        } else if (user_input == 2 && computer_number == 3) {
            System.out.println("You win!");
            user_win++;
        } else if (computer_number == 1 && user_input == 2) {
            System.out.println("Computer menang :P");
            computer_win++;
        } else if (computer_number == 1 && user_input == 3) {
            System.out.println("You win!");
            user_win++;
        } else if (computer_number == 2 && user_input == 3) {
            System.out.println("Computer menang :P");
            computer_win++;
        }

        System.out.println("***");
        System.out.println("User win: " + user_win);
        System.out.println("Computer win: " + computer_win);

    }
}