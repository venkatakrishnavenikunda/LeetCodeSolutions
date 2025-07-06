package ArraysPrograms;

import java.util.*;

public class ConcatedWords {

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        String[] words = {"cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        List<String> result = sol.findAllConcatenatedWordsInADict(words);
        System.out.println(result);
    }
}
class Solution1 {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> s = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            s.add(word);
        }
        for (String word : words) {
            if (check(word, s)) {
                ans.add(word);
            }
        }
        return ans;
    }

    public static boolean check(String word, Set<String> s) {
        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i, word.length());
            if (s.contains(prefix) && (s.contains(suffix) || check(suffix, s))) {
                return true;
            }
        }
        return false;
    }
}




//Leetcode Solution
//
//class Solution {
//    public List<String> findAllConcatenatedWordsInADict(String[] words) {
//        Set<String> s=new HashSet<>();
//        List<String> ans=new ArrayList<>();
//        for(String word:words){
//        s.add(word);
//        }
//        for(String word:words){
//            if(check(word,s)){
//            ans.add(word);
//        }
//    }
//        return ans;
//    }
//    public static boolean check(String word, Set<String>s)
//    {
//        for(int i=1;i<word.length();i++)
//        {
//            String prefix=word.substring(0,i);
//            String suffix=word.substring(i,word.length());
//            if(s.contains(prefix) && (s.contains(suffix) || check(suffix,s)))
//            return true;
//        }
//        return false;
//    }
//}