/* Leetcode Array problem:
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int remaining=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[remaining]=nums[i];
                remaining++;
            }
        }
        /*int n=nums.length;
        if(remaining<nums.length){
            String s=Arrays.toString(nums);
            s=s.substring(remaining,n);
            System.out.println(s);
            String[] item=s.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
            for(int j=0;j<item.length;j++)
                nums[j]=Integer.parseInt(item[j]);
        }*/   
        return(remaining);
    }
}
