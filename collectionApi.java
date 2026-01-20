import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collectionApi {
    public static void main(String[] args) {
        try {
            Collection<Integer> nums = new TreeSet<Integer>();
            nums.add(45);
            nums.add(40);
            nums.add(31);
            nums.add(12);
            // nums.add("s")
            // System.out.println(nums.indexOf(4));
            // System.out.println("The index value of 2 is:"+nums.get(2));
            Iterator<Integer> values = nums.iterator();

            while (values.hasNext()) {
                System.out.println(values.next());
            }
            // for (int num : nums) {
            //     System.out.println(num);
            // }
            System.out.println(nums);

        } catch (Exception e) {
            System.out.println("Error Detected" + e);
        }

    }
}
// tree set sorts the array while hashset doesnt,hashset is used when you want unique values 