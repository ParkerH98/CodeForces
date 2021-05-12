import java.util.Scanner;

public class StringTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder str = new StringBuilder(input);

        char temp;
        int ptr = 0;
        char c;
        for (int i = 0; i < input.length(); i++) {

            temp = input.charAt(i);

            if (i == input.length()) {
                continue;
            }

            if (temp == 'A' || temp == 'a' || temp == 'E' || temp == 'e' || temp == 'I' || temp == 'i' || temp == 'O' || temp == 'o' || temp == 'U' || temp == 'u' || temp == 'Y' || temp == 'y') {
                str.deleteCharAt(ptr);
                continue;
            } else {
                str.deleteCharAt(ptr);
                c = Character.toLowerCase(temp);
                str.insert(ptr, '.');
                str.insert(ptr + 1, c);

                ptr++;
            }

            ptr++;
        }
        System.out.println(str);
    }
}