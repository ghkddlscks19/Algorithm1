import java.util.Scanner;

public class Caesar {
    public static String pwd(String s, int n) {
        String answer = "";
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch+n>'z'){
                    answer += (char)(ch-26+n);
                }else{
                    answer += (char)(ch+n);
                }

            }else if(ch>='A' && ch<='Z'){
                if(ch+n>'Z'){
                    answer += (char)(ch-26+n);
                }else{
                    answer += (char)(ch+n);
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        System.out.println(pwd(str,num));
    }
}
