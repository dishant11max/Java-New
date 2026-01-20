import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionApi {

    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>()
         {
            public int compare(Integer i, Integer j)
             {
                if (i % 10 > j % 10) {
                    return 1;
                } else
                    return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(25);
        nums.add(24);
        nums.add(91);
        nums.add(22);
        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
