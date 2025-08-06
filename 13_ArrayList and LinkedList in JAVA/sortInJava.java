import java.util.*;

public class sortInJava {
    public static void main(String[] args){
        // sort theo lambda function;
        List<Integer> arr = new ArrayList<>();
        int[] a = {1, 23, 4, 1, 4, -100, 1};
        for (int x : a){
            arr.add(x);
        }
        arr.sort((Integer x, Integer y) -> { //sort tăng;
            return x - y;
        });
        arr.forEach((item) -> System.out.println(item));

        // phức tạp hơn;
        List<User> users = new ArrayList<>();
        User x = new User(20, 1);
        User y = new User(20, 2);
        User z = new User(22, 1);
        users.add(x);
        users.add(y);
        users.add(z);
        users.sort((User x1, User y1) -> {
            if (x1.age == y1.age){
                return x1.id - y1.id;
            }
            else {
                return y1.age - x1.age;
            }
        });
        users.forEach((user) -> System.out.println(user.age + " " + user.id));

        // sort theo Comparator.comparing + Lambda
        List<Person> people = new ArrayList<>();
        Person p1 = new Person(20, "Hung", 2000);
        Person p2 = new Person(20, "Mai", 2000);
        Person p3 = new Person(20, "Mai", 2300);
        people.add(p1); 
        people.add(p2); 
        people.add(p3);

        people.sort(Comparator.comparingInt((Person p) -> p.age).reversed() // tuổi giảm dần.
        .thenComparing(p -> p.name) // cùng tuổi thì so sánh tên theo thứ tự từ điển.
        .thenComparing(Comparator.comparingInt((Person p) -> p.salary).reversed())); // cùng tên thì so sánh lương giảm dần.

        people.forEach((p) -> System.out.println(p.name + " " + p.age + " " + p.salary));

        // sort theo Comparator kiểu khác
        List<Person> people1 = new ArrayList<>();
        people1.add(p1); 
        people1.add(p2);
        people1.add(p3);
        people1.sort(new Comparator<Person>(){
            @Override
            public int compare(Person pa, Person pb){
                if (pa.age == pb.age){
                    if (pa.name.equals(pb.name)){
                        return pb.salary - pa.salary;
                    }
                    else return pa.name .compareTo(pb.name);
                }
                else return pb.age - pa.age;
            }
        });
        people1.forEach((p) -> System.out.println(p.name + " " + p.age + " " + p.salary));
    }
}

class User {
    public int age;
    public int id;
    User (int age, int id){
        this.age = age;
        this.id = id;
    }
}

class Person {
    public int age;
    public String name;
    public int salary;
    Person(int age, String name, int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
}
