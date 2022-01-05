import java.util.Arrays;
import java.util.Scanner;

public class exercise {
    class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n - lost.length;
            Arrays.sort(lost);
            Arrays.sort(reserve);
            for(int i =0; i< lost.length; i++){
                for(int j =0; j< reserve.length; j++){
                    if(lost[i] == reserve[j]){
                        answer++;
                        lost[i] = reserve[j] = -10;
                        break;
                    }
                }
            }
            for(int i =0; i< lost.length; i++){
                for(int j =0; j< reserve.length; j++){
                    if(Math.abs(lost[i]-reserve[j]) == 1){
                        answer++;
                        reserve[j] = -10;
                        break;
                    }
                }
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lost[] = new int[]{2,4};
        int reserve[] = new int[]{1,3,5};
    }
}
