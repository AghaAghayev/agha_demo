import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        method2();
    }

    public static void method1() {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
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

    public static void method2() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }
        List<Integer> updatedNums = new ArrayList<>();

        System.out.println("Default List: " + nums);

        for (Integer i : nums) {
            if (i % 2 == 0) {
                updatedNums.add(0, i);
            } else {
                updatedNums.add(updatedNums.size(), i);
            }
        }

        System.out.println("Updated List: " + updatedNums);
    }
}
