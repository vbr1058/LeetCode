class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> visited=new HashMap<>();
        for (int i=0;i<ransomNote.length();i++){
            if (!visited.containsKey(ransomNote.charAt(i))){
                visited.put(ransomNote.charAt(i),1);
            }
            else{
                visited.put(ransomNote.charAt(i),visited.get(ransomNote.charAt(i))+1);
            }
        }
        System.out.println(visited);

        for (int i=0;i<magazine.length();i++){
            if (visited.containsKey(magazine.charAt(i))) {
                visited.put(magazine.charAt(i), visited.get(magazine.charAt(i)) - 1);
                if (visited.get(magazine.charAt(i)) == 0) {
                    visited.remove(magazine.charAt(i));
                }
            }
        }
        if (visited.isEmpty()){
            return true;
        }
        return false;
    }
}