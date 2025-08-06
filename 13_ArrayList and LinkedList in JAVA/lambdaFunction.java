import java.util.*;

public class lambdaFunction {
    public static void main(String[] args){
        //Syntax : (parameter) -> {do somthing};
        
        List<User1> lst = new ArrayList<>();
        User1 x = new User1("Hung", 22, 1);
        User1 y = new User1("Mai", 22, 2);
        lst.add(x);
        lst.add(y);
        lst.sort(Comparator.comparing((User1 a) -> a.age)
        .thenComparing(a -> a.name).reversed());
        lst.forEach((item) -> System.out.println(item.name + " " + item.id + " " + item.age));
    }
}

class User1 {
    public int age;
    public int id;
    public String name;
    User1 (String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
