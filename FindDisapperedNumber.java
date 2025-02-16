import java.util.*;
public class FindDisapperedNumber {

        public List<Integer> findDisappearedNumbers(int[] nums) {
            int size = nums.length;

            List<Integer> result = new ArrayList<>();

            for(int i=0;i<size;i++){
                int index = Math.abs(nums[i]) -1;

                if(nums[index]<0){
                    continue;
                }
                nums[index] *= -1;

            }

            for(int i = 0;i<size;i++){
                if(nums[i]>0){
                    result.add(i+1);
                }
            }
            return result;

        }
}
