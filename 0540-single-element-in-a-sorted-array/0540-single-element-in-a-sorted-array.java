class Solution {
    public int singleNonDuplicate(int[] nums) {
    int fre[]=new int[nums[nums.length-1]+1];
    for(int i : nums)
    fre[i]++;
    for(int i=0;i<fre.length;i++)
    {
        if(fre[i]==1)
        return i;
    }  
    return 0; 
    }
}