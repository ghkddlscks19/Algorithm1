import java.util.Scanner;

public class morning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if(H>0){
            if(M<45){
                System.out.printf("%d %d",H-1, 60-(Math.abs(M-45)));
            }else{
                System.out.printf("%d %d",H, M-45);
            }

        }else{
            if(M<45){
                System.out.printf("%d %d",23, 60-(Math.abs(M-45)));
            }else{
                System.out.printf("%d %d",H, M-45);
            }
        }

    }
}
