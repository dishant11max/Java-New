import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collectionApi {
    public static void main(String[] args) {
    try {
        Set<Integer> nums = new HashSet<Integer>();
       nums.add(45);
       nums.add(40);
       nums.add(31);
       nums.add(12);
    //    nums.add("s")
    //    System.out.println(nums.indexOf(4));
    //    System.out.println("The index value of 2 is:"+nums.get(2));
        for(int num : nums)
            {
            System.out.println(num);
            }
        System.out.println(nums);

    } catch (Exception e) {
       System.out.println("Error Detected"+ e);
    }
       
    }
}
