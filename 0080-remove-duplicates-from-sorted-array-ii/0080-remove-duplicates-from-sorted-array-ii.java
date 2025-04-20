class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length<2) return nums.length;
        int i=2;
        for(int j=2;j<nums.length;j++){
            if (nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}


// 0,0,1,1,1,1,2,3,3
//     i
//     j
