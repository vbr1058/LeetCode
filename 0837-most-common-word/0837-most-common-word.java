class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> mostRepeatedWord=new HashMap<>();
        String cleaned = paragraph.replaceAll("[^a-zA-Z0-9\\s]", " ").toLowerCase();
        String[] words = cleaned.split("\\s+");
        for (String word : words) {
            mostRepeatedWord.put(word, mostRepeatedWord.getOrDefault(word, 0) + 1);
        }
        String mostCommon="";
        int maxCount=0;
        int i=0;
       while(i<banned.length){
           if(mostRepeatedWord.containsKey(banned[i])){
               mostRepeatedWord.remove(banned[i]);
           }
           i++;
       }
        System.out.println(mostRepeatedWord);
        for(int j=0;j<words.length;j++){
            if (mostRepeatedWord.containsKey(words[j])) {
                if (maxCount <= mostRepeatedWord.get(words[j])) {
                    maxCount = mostRepeatedWord.get(words[j]);
                    mostCommon = words[j];
                }
            }
        }
        return mostCommon;
    }
}