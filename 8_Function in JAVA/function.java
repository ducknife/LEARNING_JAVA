
public class function {
    static { // khối static luôn chạy trước hàm main, dùng nạp dữ liệu một lần vào bộ nhớ.
        System.out.println("Static run");
    }

    // như module 7 đã nói hàm có static thuộc về lớp, ko có static thuộc về đối tượng

    public static String setUp(){
        return "Set up successfully!!!!";
    }

    public static int changeA(int a){ 
        a = 0;
        return a;
    }

    public int sub(int a, int b){
        return a - b;
    }
    public static void main(String[] args){
        System.out.println("Main run");

        System.out.println(setUp());

        int a = 0;
        System.out.println(changeA(a)); // thay đổi giá trị bản sao a;
        System.out.println(a); // a vẫn bằng 10;

        function fc = new function();

        System.out.println(fc.sub(10, 20));
    }
}