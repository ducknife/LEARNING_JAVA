public class Loop {
        public static void print(String format, Object... values){
            System.out.printf(format, values);
        }
        public static void main(String[] args){
            //for loop
            for (int i = 1; i <= 10; i++){
                print("%s %d\n", "Gia tri cua i la:", i);
            }

            //while loop
            int i = 10;
            while (i-- > 0){
                print("%s %d\n", "Gia tri cua i la:", i);
            }
        }
}
