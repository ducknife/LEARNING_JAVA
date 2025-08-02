public class __ChuanHoaTen {
    public static void main(String[] args){
        // Cách 1: Đơn thuần
        String name = "nguyen   VaN  +- Hung  ";
        String[] arrS = name.split("[ +-]+");
        String res = "";
        for (int i = 0; i < arrS.length; i++) {
            res += Character.toString(Character.toUpperCase(arrS[i].charAt(0)));
            for (int j = 1; j < arrS[i].length(); j++){
                res += Character.toString(Character.toLowerCase(arrS[i].charAt(j)));
            }
            if (i < arrS.length - 1) res += " ";
        }
        System.out.println(res); 

        // Cách 2: Dùng StringBuilder - kiểu char[]; nên vẫn phải ép toString();
        StringBuilder sb = new StringBuilder("");
        for (String x : arrS){
            sb.append(Character.toUpperCase(x.charAt(0)));
            for (int j = 1; j < x.length(); j++){
                sb.append(Character.toLowerCase(x.charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.reverse().toString());
    }
}
