
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CountPalindrome {

    public static boolean check_palindrome(String input) {
        boolean palindrom = true;
        int front = 0;
        int back = input.length() - 1;
        while (front < back) {
            char front_c = input.charAt(front);
            char back_c = input.charAt(back);
            if (!Character.isLetter(front_c)) {
                front++;
                continue;
            }
            if (!Character.isLetter(back_c)) {
                back--;
                continue;
            }

            if (front_c != back_c) {
                palindrom = false;
                break;
            }
            front++;
            back--;
        }
        return palindrom;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        try {
            //open file
            FileReader reader = new FileReader(args[0]);
            in = new BufferedReader(reader);
            int count = 0;

            // read text in file
            while (true) {
                String input = in.readLine();
                if (input == null) {
                    break;
                } else {
                    input = input.toLowerCase();
                    if (check_palindrome(input)) {
                        count++;
                    }
                }
            }
            System.out.println(count);

        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
