public class SingleNumber {
    public int singleNumber(int[] nums) {
        int j=nums.length;

        int xorr = 0;
        for (int i = 0; i < j; i++) {
            xorr = xorr ^ nums[i];
        }
        return xorr;
    }
}
