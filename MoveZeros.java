public class MoveZeros {
    public int[] moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for(int num : nums){
            if(num!=0)
                nums[j++]=num;
        }

        while(j<n){
            nums[j++]=0;
        }
        return nums;
    }
}
