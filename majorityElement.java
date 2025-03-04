public class majorityElement {

        public int majorityElement(int[] nums) {
            int votes = 0;
            int candidate = 0;
            int n = nums.length;

            // Step 1: Find the candidate
            for (int i = 0; i < n; i++) {
                if (votes == 0) {
                    candidate = nums[i];
                    votes = 1;
                } else if (candidate == nums[i]) { // Boyer-Moore Voting Algorithm
                    votes++;
                } else {
                    votes--;
                }
            }

            // Step 2: Verify the candidate
            votes = 0;
            for (int num : nums) {
                if (num == candidate) {
                    votes++;
                }
            }

            return votes > (n / 2) ? candidate : -1; // Return candidate if it's a majority
        }

}
