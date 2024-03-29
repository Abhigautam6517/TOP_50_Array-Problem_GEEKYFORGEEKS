public class LongestAlternatingSequence{
    public int AlternatingaMaxLength(int[] nums)
    {
        int down=1;
        int up=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                down=up+1;
            }
            if(nums[i]>nums[i-1]){
                up=down+1;
            }
        }
        return Math.max(down,up);
    }

}