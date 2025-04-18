class Solution {
    public String reverseStr(String s, int k) {
        int i=0;
        int j=k-1;
        if (s.length()<k){
            return reverseString(s);
        }
        while (j<s.length()){
            if(s.substring(i).length()>k) {
                s = s.substring(0, i) + reverseString(s.substring(i, i + k)) + s.substring(i + k);
            }
            else {
                if (s.substring(i).length() < 2 * k && s.substring(i).length() >= k) {
                    s = s.substring(0, i) + reverseString(s.substring(i, i + k)) + s.substring(i + k);
                }
            }
            i=i+2*k;
            j=j+2*k;
        }
        if (j>s.length() && i<s.length()){
            if (s.substring(i).length()<k){
                s=s.substring(0,i)+reverseString(s.substring(i));
            }
        }
        return s;
    }
    
    public String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        for (int k = str.length() - 1; k >= 0; k--) {
            sb.append(str.charAt(k));
        }
        return sb.toString();
    }
}