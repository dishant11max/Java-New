import java.util.HashMap;
import java.util.Map;

public class collectionApi {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Dishy", 99);
        students.put("Sahil", 32);
        students.put("Subasis", 98);
        students.put("Himashu", 49);
         students.put("Sahil", 94);
        for(String studs : students.keySet()){
            System.out.println(studs + ":" + students.get(studs));
        }
        System.out.println(students);
    }
}
