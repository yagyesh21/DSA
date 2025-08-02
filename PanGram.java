//leetcode 1832

import java.util.HashSet;
import java.util.Set;

// here we created a hashSet of Character then we run a for of the sentence 
// after that we convert char to lowerCase and then at it in letterHashSet
// then check the size of hashSet
public class PanGram {

    public boolean checkIfPangram(String sentence){
        Set<Character> letter= new HashSet<>();
        
        for(int i = 0 ; i < sentence.length(); i++){
            // converted to lowerCase 
            char currentLetter = sentence.toLowerCase().charAt(i);

            letter.add(sentence.charAt(i));
        }
            return letter.size() == 26;
    }


}
 
  

