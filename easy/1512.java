// https://leetcode.com/problems/number-of-good-pairs/description/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int fre[] = new int[101];
        for(int i: nums) fre[i]++;

        for(int i: fre) {
            if(i>0) count = count + (i)*(i-1)/2;
        }

        return count;
    }
}
