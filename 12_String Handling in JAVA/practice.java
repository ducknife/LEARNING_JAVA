public class practice {
    public static String stdName(String s){
        String[] arr = s.split("[ /+%]+");
        StringBuilder sb = new StringBuilder();
        for (String x : arr){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        String res = sb.toString();
        return res;
    }
    public static void main(String[] args){
        String s = "nguyEn // VaN     + hUnG   %";
        System.out.println(stdName(s));

        SkibidiMan man = new SkibidiMan();
        man.setName("Hung     Hung hehe");
        System.out.println(stdName(man.getName()));
    }   
}

class SkibidiMan {
    private int age;
    private String name;
    public SkibidiMan(){}
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
