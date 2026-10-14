import java.util.Arrays;

class Solution {
    public static  void moveZeroes(int[] nums) {
        int i = 0; 
        int j = 1;


        while(j!=nums.length){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                // i++;
                j++;
                System.out.println(i +","+ j);
                System.out.println(Arrays.toString(nums));
            }
            else if(nums[j]!=0){
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }
            else{
                j++;
            }
        }
        System.out.print(Arrays.toString(nums));

    }

    /*
    
import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

    */


    public static void main(String[] args) {
        // int[] nums = {0,1,0,3,12};
        // int[] nums = {1,23,0, 4, 12, 0};
        int[] nums = {1,2,3,1};
        moveZeroes(nums);   
    }
}