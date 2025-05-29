//Using HashMap

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<0 && map.containsKey(nums[i]-target)){
                return new int[]{i,map.get(nums[i]-target)};
            }
            else if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}

// Using For loop