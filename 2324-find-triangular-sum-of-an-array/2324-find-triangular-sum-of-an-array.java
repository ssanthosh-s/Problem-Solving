class Solution {
    public int triangularSum(int[] nums) {
    int n=nums.length-1;
    for(int i=n;i>0;i--)
    {
        for(int j=0;j<i;j++)
        nums[j]=(nums[j]+nums[j+1])%10;
    }  
    return nums[0];  
    }
}