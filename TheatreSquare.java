import java.util.Scanner;

public class TheatreSquare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] input_split;
        input_split = input.split(" ");

        long n = Long.parseLong(input_split[0]);
        long m = Long.parseLong(input_split[1]);
        long a = Long.parseLong(input_split[2]);

        long answer = 0;

        long x = 0;
        long y = 0;

        /* -------------------------------- handles n ------------------------------- */
        if (n <= a) {
            x = 1;
        } else {

            if (n % a == 0) {
                x = n / a;
            } else if (n % a != 0) {
                x = n / a;
                x++;
            }
        }

        /* -------------------------------- handles m ------------------------------- */
        if (m <= a) {
            y = 1;
        } else {

            if (m % a == 0) {
                y = m / a;
            } else if (m % a != 0) {
                y = m / a;
                y++;
            }
        }

        answer = x * y;

        System.out.println(answer);
        scanner.close();
    }
}