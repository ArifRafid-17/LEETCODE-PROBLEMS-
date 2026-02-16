import java.util.Arrays; 
public class leetcode26 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        int k = 1; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,3,3,3,4,4,4,8,8,9,9};
        int k = removeDuplicates(nums);

        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}
