import java.util.Scanner;

public class Melody {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();  // 결과 = 앨범에 포함된 저작권이 있는 멜로디의 개수 / 앨범에 수록된 곡의 개수(A)
        int i = sc.nextInt(); // 평균값
        int res = A*(i-1)+1; // 무조건 올림이니까 곡의개수*(평균-1)보다 1만 크면 최소의 개수가 나온다
        System.out.println(res);

    }
}
