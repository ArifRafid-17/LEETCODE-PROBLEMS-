import java.util.Arrays;
class leetcode344 {
    public static void reverseString(char [] s) {
        String [] result =new String [s.length];
        int val = s.length-1;
        String c="";

        for(int i=0; i<s.length; i++){
           c+=s[val-i];
           result[i]=c;
           c="";
        }
        System.out.println(Arrays.toString(result));

        
    }
    public static void main(String [] args){
        String [] StringArray = {"H","a","n","n","a","h"};
        int n = StringArray.length;
        String word = "";
        char [] s = new char[n];


        for(int i=0; i<n; i++){
            word+=StringArray[i];
        }

        for(int i=0; i<n; i++){
            char c= word.charAt(i);
            s[i]=c;
        }
        System.out.println(Arrays.toString(StringArray));
        //reverseString(s);
    }
}