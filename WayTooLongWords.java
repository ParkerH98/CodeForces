import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        int string_length;
        char first_letter;
        char last_letter;
        Integer between;
        String between_string;

        for (String input : words) 
        {
            string_length = input.length();

            if (string_length > 10) 
            {
                first_letter = input.charAt(0);
                last_letter = input.charAt(string_length - 1);
                between = string_length - 2;
                between_string = between.toString();

                input = first_letter + between_string + last_letter;
                System.out.println(input);

                continue;
            }

            System.out.println(input);
        }
    }
}