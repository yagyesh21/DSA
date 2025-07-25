//217(leetcode )

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
            //nums.length-1 gives the index of the last element
        for(int i = 0 ; i <nums.length-1; i++){
            // checking for duplicates with in arrray
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
          return false;
    
    }
  
}

public class ContainsDuplicate {
    //example
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,1};

        System.out.println(solution.containsDuplicate(nums1));
    }
}