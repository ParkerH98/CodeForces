import java.util.Scanner;

public class Word {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int len = input.length();
        char c;
        int upper_count = 0;
        int lower_count = 0;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < len; i++) {
            c = input.charAt(i);

            if ((int) c >= 97 && (int) c <= 122) {
                lower_count++;
            } else {
                upper_count++;
            }

        }

        if (upper_count > lower_count) {

            for (int j = 0; j < len; j++) {
                c = input.charAt(j);
                c = Character.toUpperCase(c);
                str.append(c);
            }
        } else {

            for (int j = 0; j < len; j++) {
                c = input.charAt(j);
                c = Character.toLowerCase(c);
                str.append(c);
            }
        }
        System.out.println(str);
    }
}