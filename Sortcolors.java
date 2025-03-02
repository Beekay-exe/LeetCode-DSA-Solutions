public class Sortcolors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 2) {
                // Swap nums[mid] and nums[high]
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--; // Decrease high to move 2s to the end
            } else if (nums[mid] == 0) { // Corrected condition
                // Swap nums[mid] and nums[low]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            } else {
                mid++; // Move past 1s
            }
        }
    }
}
