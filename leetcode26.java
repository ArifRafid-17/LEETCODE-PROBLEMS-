import java.util.Arrays;
public class leetcode26{

    public static int removeDuplicate(int [] nums){
        int count=1;
        int p=0;
        for(int i=0; i<nums.length; i++){

          if(count<nums.length){

            for(int j =count; j<nums.length-i; j++){
                if(nums[i]==nums[j]){
                    
                    int num = nums[j];
                    for(int k=count; k<nums.length; k++){
                        if(k<nums.length-1){
                            nums[k]=nums[k+1];
                        }
                        
                    }
                    nums[nums.length-1]=num;
                    p++;
                }
                
            }
            count++;
          }

        }
        return p;
    }
    public static void main(String [] args){
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int p = removeDuplicate(nums);
        System.out.println(p);
        System.out.println(Arrays.toString (nums));
    }
}