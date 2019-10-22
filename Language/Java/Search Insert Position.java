/* Leetcode problem: 
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2 
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int flag=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                flag=1;
                return i;
            }
        }
        if(flag==0){
            int i;
            if(target<nums[0])
                return 0;
            else if(target>nums[n-1])
                return n;
            else{
                for(i=0;i<n-1;i++){
                    if(target>nums[i] && target<nums[i+1])
                        return(i+1);
                }
            }    
        }
        return -1;
    }
}
