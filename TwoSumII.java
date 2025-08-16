// leetcode 167

import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left =0 ; int right =numbers.length-1;
        ArrayList<Integer> arr = new ArrayList<>();
         int[] res = new int[2];

        while (left < right){
            int sum  = numbers[left] + numbers[right];
            if ( sum == target){
                arr.add(left + 1);
                arr.add(right + 1);
                res[0] = arr.get(0);
                res[1] = arr.get(1);
                return res;
            } else if(sum < target){
                left ++;
            } else {
                right --;
            }
        }
        return res;
    }
}
