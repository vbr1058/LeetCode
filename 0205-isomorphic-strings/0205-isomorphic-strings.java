class Solution {
    public boolean isIsomorphic(String s, String t) {
         if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> mappingCharacters=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (mappingCharacters.containsKey(s.charAt(i))){
                if (mappingCharacters.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else {
                 if (mappingCharacters.containsValue(t.charAt(i))){
                    return false;
                }
                mappingCharacters.put(s.charAt(i), t.charAt(i));
            }

        }
        return true;
    }
}
