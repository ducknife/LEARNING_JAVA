import java.util.Scanner;

public class simplyChatbot {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("You: ");
            String userInput = sc.nextLine();
            String brainAns;
            if (userInput.equals("Hello")){
                brainAns = "Hi";
            }
            else {
                brainAns = "Sorry, I don't know the answer.";
            }

            System.out.println("DuckAI: ... ");
            System.out.printf("DuckAI: %s", brainAns);
        }
    }
}
