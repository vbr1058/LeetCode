class Solution {
    public String reverseWords(String s) {

       StringBuilder result = new StringBuilder();
       s=s.trim();
        String[] inputArray = s.split("\\s+"); // split on one or more spaces

        for(int i=inputArray.length-1;i>=0;i--){
                result.append(inputArray[i].trim());
                if (i != 0) {
                    result.append(" ");
            }
        }
        return result.toString();
    }
}