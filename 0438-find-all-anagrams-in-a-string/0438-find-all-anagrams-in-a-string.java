import java.util.ArrayList;
import java.util.List;//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result= new ArrayList<>();
        int left=0,right=p.length()-1;
        for (int i=0;i<s.length();i++){
                if (i<=s.length()-p.length() && isAnagram(s.substring(i,i+p.length()),p)){
                    result.add(i);
                }
        }
        return result;
    }

    public boolean isAnagram(String s1,String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        int[] count=new int[26];
        for (int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for (int i=0;i<26;i++){
            if (count[i]!=0){
                return false;
            }
        }
        return true;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
