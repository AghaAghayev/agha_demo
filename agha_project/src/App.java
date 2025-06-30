import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*100);
        }

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (Integer integer : nums) {
            if (integer % 2 == 0) {
                evens.add(integer);
            } else {
                odds.add(integer);
            }
        }

        System.out.println(evens.addAll(odds));

        System.out.println(Arrays.toString(nums));
    }
}
