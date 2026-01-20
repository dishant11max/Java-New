import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collectionApi {
    public static void main(String[] args) {
    try {
        List<Integer> nums = new ArrayList<Integer>();
       nums.add(5);
       nums.add(4);
       nums.add(3);
       nums.add(2);
    //    nums.add("s")
       System.out.println(nums.indexOf(4));
       System.out.println("The index value of 2 is:"+nums.get(2));
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
