import java.util.Scanner;

public class numsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int arr[] = new int[N];
        int sum = 0;
        for(int i =0; i<N; i++){
            arr[i] = s.charAt(i) - '0';
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
