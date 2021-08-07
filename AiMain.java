//人类的本质是复读机，所以AI也一样

public class AiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.next();
            str = str.replace( target: "吗", replacement: "");
            str = str.replace( target: "？", replacement: "！");
            str = str.replace( target: "?", replacement: "！");
            System.out.println(str);
        }
    }
}
