
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamApi {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 4, 2, 1, 6, 8);
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n-> n%2==0);
        // Stream<Integer> s3 = s2.map(n-> n*2);

        int res = nums.stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * 2)
                        .reduce(0, (c, e) -> c + e);

        // s3.forEach(n -> System.out.println(n));
        System.out.println(res);
        System.out.println(nums);

    }
}
