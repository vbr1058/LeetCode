class Solution {
    public int lengthOfLongestSubstring(String s) {
         int count=0;
        int left=0;
        Set<Character> visited=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(visited.contains(s.charAt(right))){
                visited.remove(s.charAt(left));
                left++;
            }
            visited.add(s.charAt(right));
            count=Math.max(count,right-left+1);

        }
        return count;
    }
}