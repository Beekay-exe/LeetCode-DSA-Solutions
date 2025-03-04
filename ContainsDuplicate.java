import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

        public boolean containsDuplicate(int[] nums) {
            int size = nums.length;
            Set<Integer> seen = new HashSet<>();
            for(int num : nums) {
                if(seen.contains(num)){
                    return true;
                }
                seen.add(num);
            }
            return false;
        }

}
