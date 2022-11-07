import java.util.*;
public class  LongestCommonPrefixClass{
    public static boolean check(String[] arr, int start, int end){
        char prevStart = arr[0].charAt(start);
        char prevEnd   = arr[0].charAt(end);
         //System.out.println("start: "+start+" end: "+end);
        for(int i=1; i<arr.length; i++){
            //System.out.println(prevStart+" "+arr[i].charAt(start)+" | "+ prevEnd+" "+ arr[i].charAt(end));
            if(prevStart != arr[i].charAt(start) || prevEnd!= arr[i].charAt(end)){
                return false;
            }
        }
        return true;
    }
    public static String longestCommonPrefix(String[] A){
         int N = A.length;
        int Max_len = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            Max_len = Max_len > A[i].length() ? A[i].length() : Max_len;
        }
        int start=0, end = Max_len;
        // System.out.println("start: "+start+" end: "+end);
        while(end>=0){
             //System.out.println("start: "+start+" end: "+end);
               if(check(A,start,end)){
                //   System.out.println("start: "+start+" end: "+end);
                  String  str = A[0].substring(start,end+1);
                  boolean flag = true;
                   for(int i=1; i<N; i++){
                       if((A[i].substring(start,end+1)).equals(str) == false){
                           Max_len--;
                           flag = false;
                           break;
                       }
                   }
                   if(flag==true){
                       return str;
                   }
               }
               end--;
        }
        return "";
        
        
        
    }

    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     String[] arr =  new String[N];
     for(int i=0; i<N; i++){
         arr[i] = sc.next();
     }
     System.out.println(Arrays.toString(arr));
     System.out.println("Common Prefix: "+ longestCommonPrefix(arr));
    }
}
/*
Example Input
Input 1:

A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:

A = ["abab", "ab", "abcd"];


Example Output
Output 1:

"a"
Output 2:

"ab"
*/
