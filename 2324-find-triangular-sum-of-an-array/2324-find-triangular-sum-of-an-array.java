class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1)
        return nums[0];
        
ArrayList<Integer> arr = new ArrayList<>();
       for (int num : nums) {
    arr.add(num);
}

while (arr.size() != 1) {
    arr = tri(arr);
}
        
        return arr.get(0);  
    }
    public static ArrayList<Integer> tri(ArrayList<Integer> nums)
    {
       ArrayList<Integer>li=new ArrayList<>();
       for(int i=0;i<nums.size()-1;i++)
        {
            int n=(nums.get(i)+nums.get(i+1))%10;
            li.add(n);
        }
        return li;
    }
}