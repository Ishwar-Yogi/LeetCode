class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        for(int i=0, j=0; i<n; i++, j+=2)
        {
            arr[j] = nums[i];
            arr[j+1] = nums[i+n];
        }return arr;
    }
}