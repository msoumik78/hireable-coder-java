import java.util.ArrayList;
import java.util.List;

public class ForLoopDemo {
    public static void main(String[] args) {
        List doubList = new ArrayList<Double>();
        long startTime = System.currentTimeMillis();
        for (int i =0; i < 1_000_000; i++) {
            double result = Math.sqrt(i);
            doubList.add(result);
        }
        System.out.println("Time taken in mili seconds: "+(System.currentTimeMillis() - startTime));
    }
}
