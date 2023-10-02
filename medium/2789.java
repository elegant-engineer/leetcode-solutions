// Largest Element in an Array after Merge Operations
class Solution {
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        long ans = nums[n-1]; 
        long monster = nums[n-1];

        for(int i=n-2;i>=0;i--) {
            if(nums[i]<=monster) {
                monster+=nums[i];
            } else {
                monster = nums[i];
            }
            ans = Math.max(ans, monster);
        }
        
        return ans;
    }
}
