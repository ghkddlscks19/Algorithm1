import java.util.Scanner;

public class CycleMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int save = N;
        int count = 0;
        // 26 -> 68 -> 84
        while(true){
            N = (N%10)*10 + ((N/10)+(N%10))%10;
            count++;
            if(save == N){
                break;
            }
        }
        System.out.println(count);
    }
}
