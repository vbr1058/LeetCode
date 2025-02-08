class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.containsKey(target-num)){
                int idx= map.get(target-num);
                return new int[]{idx,i};
            }
            map.put(num,i);
        }
        return new int[]{-1,-1};
    }
}