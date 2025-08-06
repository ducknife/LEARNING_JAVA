
import java.util.*;


public class set {
    public static void main(String[] args){
        Set<Integer> se = new HashSet<>();
        se.add(1);
        se.add(1);
        se.add(-1);
        se.add(-1);
        System.out.println(se.size());

        Set<User> se1 = new HashSet<>();
        User u1 = new User();
        User u2 = u1;
        u1.setUsername("daskov");
        u1.setPassword("huhuhu126");
        u2.setUsername("daskov");
        u2.setPassword("huhuhu125");
        se1.add(u1);
        se1.add(u2);
        System.out.println(se1.size());
        se1.forEach((user) -> System.out.println(user.getUsername()));
    }
}

class User {
    private String password;
    private String username;
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
