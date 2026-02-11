import java.util.Arrays;
public class leetcode88{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr= new int [m+n];
        int count=0;
        for(int i=0; i<m; i++){
            arr[count]=nums1[i];
            count++;
        }
        for(int i=0; i<n; i++){
            arr[count]=nums2[i];
            count++;
            
        }
        count=0;
        Arrays.sort(arr);

        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }


        System.out.println(Arrays.toString(arr));
    }
    public static void main(String [] args){
        int [] nums1={1,2,3,0,0,0};
        int m=3;
        int [] nums2 = {2,5,6};
        int n=3;
        merge(nums1, m, nums2, n);
        

    }
}