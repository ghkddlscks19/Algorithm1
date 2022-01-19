import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int save = N;
        int count = 0;
        while(true){
            String num = "";
            num += save%10;
            num += ((save/10) + (save%10)) % 10;
            save = Integer.parseInt(num);
            count++;
            if(save == N){
                break;
            }

        }
        System.out.println(count);
    }
}
