class Solution {
    public int[] singleNumber(int[] nums) {
     Arrays.sort(nums);
     int i=0;
     int j=0;
     int arr[]=new int[2];
     for(i=0;i<nums.length;)
     {
        if(i<nums.length-1 && nums[i]==nums[i+1])
        i+=2;
        else 
        {      
            arr[j++]=nums[i];
              i++;
              if(j==2)
              break;
        }
     }
        return arr;
    }
}