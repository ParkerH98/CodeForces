import java.util.Scanner;

public class Team {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] votes = new String[n];

        for (int i = 0; i < n; i++) {

            votes[i] = scanner.nextLine();
        }

        int votes_count = 0;;
        int temp_count = 0;
        int string_length;

        for (String vote : votes) {

            string_length = vote.length();

            for (int i = 0; i < string_length; i++) 
            {
                if (vote.charAt(i) == '1') 
                {
                    temp_count++;
                }
            }

            if (temp_count >= 2) 
            {
                votes_count++;
            }
             temp_count = 0;
        }

        System.out.println(votes_count);
    }
}