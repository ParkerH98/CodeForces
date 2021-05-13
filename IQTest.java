import java.util.Scanner;

public class IQTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String input = sc.nextLine();
        String[] input_split = input.split(" ");

        int even_count = 0;
        int odd_count = 0;
        int temp;

        for (int i = 0; i < input_split.length; i++) {
            temp = Integer.parseInt(input_split[i]);
            if (temp % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }

        int answer = 0;
        if (even_count > odd_count) {

            for (int i = 0; i < input_split.length; i++) {
                temp = Integer.parseInt(input_split[i]);

                if (temp % 2 == 0) {

                    continue;
                }

                answer = i + 1;
            }
        } else {
            for (int i = 0; i < input_split.length; i++) {
                temp = Integer.parseInt(input_split[i]);

                if (temp % 2 != 0) {

                    continue;
                }

                answer = i + 1;
            }
        }

        System.out.println(answer);
    }
}