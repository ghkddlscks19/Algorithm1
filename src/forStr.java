import java.util.Scanner;

public class forStr {
    public static String Main(int a){
        String ans = "";
        int i =0;
        while(i<a){
            if(i%2 == 0){
                ans += "수";
            }else{
                ans += "박";
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Main(n));
    }
}
