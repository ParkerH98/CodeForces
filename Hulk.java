import java.util.Scanner;

public class Hulk {

    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        str.append("I");

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0 || i == 0) {
                str.append(" hate");

            } else if (i % 2 != 0 || i == 1){
                str.append(" love");

            }

            if (i == n - 1) {
                str.append(" it");

            } else {
                str.append(" that I");
            }
        }
        
        System.out.println(str);
    }
}