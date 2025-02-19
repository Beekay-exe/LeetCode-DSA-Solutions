import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<size;i++){
            int curr = nums[i];
            int x = target - curr;
            if(map.containsKey(x)){
                return new int[] {map.get(x),i};
            }
            map.put(curr,i);
        }
        return null;
    }
}
