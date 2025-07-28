import java.util.Scanner;

public class dataTypes {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int i= sc.nextInt();
            sc.nextLine(); /* sau khi doc so nguyen thi phai nextLine() de bo qua dau enter */
            String str = sc.nextLine();
            char c = sc.next().charAt(0);  /* sc.next(): doc xau bo qua white-space*/
            float f = sc.nextFloat(); /* float mặc định là double, nên nếu muốn khai báo float phải thêm chữ f ở cuối số
            ví dụ: 3.14f hoặc (float) 3.14*/
            boolean b = sc.nextBoolean();
            long li = sc.nextLong(); /* nếu long có giá trị vượt int thì cũng phải thêm hậu tố l ở cuối */
            double d = sc.nextDouble();
            System.out.println(i + " " + "\n" + str + "\n" + c + " " + f + " " + b + " " + li + " " + d);
        }
    }
}

/* 
int : 4B
long: 8B
float: 4B
double: 8B
char: 2B
boolean: thường là 1B

 */