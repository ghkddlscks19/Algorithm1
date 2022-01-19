import java.util.Scanner;

public class Divisor {
    public static int div(int left, int right){
        int count = 0;
        int res = 0;
        for(int i = left; i<=right; i++){
            for(int j =1; j<=i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count %2 == 0){
                res += i;
            }else {
                res -= i;
            }
            count = 0;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(div(l,r));

    }
}
