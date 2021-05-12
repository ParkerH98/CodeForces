import java.util.Scanner;

public class NextRound {

    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);


        String params = scanner.nextLine();
        String ranks = scanner.nextLine();

        String[] params_split = params.split(" ");
        String[] rank_split = ranks.split(" ");

        String k_string = params_split[1];
        int k_index = Integer.parseInt(k_string);
        int k = Integer.parseInt(rank_split[k_index - 1]);
        int count = 0;
        int temp;

        for (String string : rank_split) 
        {
            temp = Integer.parseInt(string);

                if (temp >= k && temp > 0) 
                {
                    count++;
                }
        }
            
        System.out.println(count);

        }
    }