public class HowmanynumsLessdhan {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int [] bucket = new int[102]; //will store the frequency

        for(int num : nums){
            bucket[num]++;//tells the frequency of each element
        }

        for(int i=1;i<102;i++){
            bucket[i] += bucket[i-1];
        }

        int result[] = new int [nums.length];
        for(int i=0;i<result.length;i++){
            if(nums[i] == 0)
                result[i] =0; //base case

            else
                result[i] = bucket[nums[i] - 1];
        }
        return result;
    }
}
