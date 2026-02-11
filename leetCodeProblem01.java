import java.util.Arrays;
public class solution{
    public static void main(String [] args){
        int [] arr = {2,7,11,15};
        int target =9;
        int [] final_arr= new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                int num = arr[i]+arr[j];
                if(num==target){
                    final_arr[0]=i;
                    final_arr[1]=j;
                }
            }
        }
        System.out.println(Arrays.toString(final_arr));
    }
}
