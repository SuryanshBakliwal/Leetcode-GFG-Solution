class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
            System.out.println(slow + " " + fast);
        }while(slow!=fast);
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
            System.out.println(slow + " " + fast);

        }
        return slow;
    }
}