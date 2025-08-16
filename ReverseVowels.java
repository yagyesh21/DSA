// leetcode 345

class Solution {
    static final String vowels = "aeiouAEIOU";

    public String reverseVowels(String s) {
        int first = 0 , last = s.length()-1;// declare two Pointer
        char[] array = s.toCharArray();

        while ( first < last ){
            // indexof returns -1 when array doesn't have the char in it
        while ( first < last && vowels.indexOf(array[first]) == -1){
            first ++;
        }
        while( first < last && vowels.indexOf(array[last])== -1){
            last --;
        }
        // swapping vowels
        char temp = array[first];
        array[first] = array[last];
        array[last] = temp;
         first ++;
         last --;
        }

      return new String(array);
    }
}
