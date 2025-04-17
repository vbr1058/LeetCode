class Solution {
    HashMap<Character,Integer> orderindex=new HashMap<>();
    public boolean isAlienSorted(String[] words, String order) {
        for (int i=0;i<order.length();i++){
            orderindex.put(order.charAt(i),i);
        }
        int firstWord=0;
        int secondWorld=1;
        while(secondWorld<words.length){
            if(!lexicographical(words[firstWord],words[secondWorld])){
                return false;
            }
            else {
                firstWord++;
                secondWorld++;
            }
        }
        return true;

    }
    public boolean lexicographical(String str1,String str2){
         int j=0;
        int minLength=Math.min(str1.length(),str2.length());
        while(j<minLength){
            if(orderindex.get(str1.charAt(j))<orderindex.get(str2.charAt(j))){
                return true;
            }
            if(orderindex.get(str1.charAt(j))>orderindex.get(str2.charAt(j))){
                return false;
            }
            j++;
        }
        if (str1.length()>str2.length()){
            return false;
        }
        return true;
    }
}