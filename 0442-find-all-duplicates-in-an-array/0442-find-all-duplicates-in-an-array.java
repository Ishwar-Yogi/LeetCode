class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);

        LinkedList<Integer> ans = new LinkedList<>();

        for(int i=1; i <nums.length ; i++){
            if(nums[i-1]==nums[i]){
                ans.add(nums[i-1]);
            }
        }
        return ans;
    }
}