class Solution {
    public void moveZeroes(int[] nums) 
    {
     for(int i=0,zero=0;i<nums.length;i++)
     {
      if(nums[i]!=0)
         {
           int temp=nums[zero];
           nums[zero++]=nums[i];
           nums[i]=temp;
         }
     }
    }
}
