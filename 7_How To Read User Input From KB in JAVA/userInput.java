import java.util.Scanner;

public class userInput {
    public int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            int y = sc.nextInt();
            userInput ui = new userInput();
            System.out.println(ui.add(x, y) + " " + sub(x, y));
        }
    }
}
