import java.util.Arrays;
import java.util.List;

public class listlist {
    public static void main(String[] args) {
        List<String> GDSC = Arrays.asList("지민", "지수", "예지", "용민", "정민", "현균");
        for(int i =0; i< GDSC.size(); i++){
            System.out.println(GDSC.get(i)+" GDSC");
        }
    }
}
