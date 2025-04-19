class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int mostWater=0;
        while(i<j){
            mostWater=Math.max(mostWater ,Math.min(height[i],height[j]) * (j-i));
            if (height[i]<height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        System.out.println(mostWater);
        return mostWater;
    }
}