class Solution {
    public int minimumOperations(int[] nums) {
    int c=0;
    int n=nums.length;
    for(int i=0;i<n;i+=3)
    {
        boolean f=true;
        for(int j=i;j<n-1;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(nums[j]==nums[k]){
                f=false;
                break;
                }
            }
            if(!f)
            break;
        }
        if(f)
        return c;
        c++;
    }
    return c;  
    }
}