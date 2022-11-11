import java.util.*;
public class MyClass {
    public static int[] expand(String str,int left, int right){
        int[] ans =  new int[3];
        while(left>=0 && right<str.length()){
            if(str.charAt(left) == str.charAt(right)){
                ans[2]+=1;
                ans[0]=left;
                ans[1]=right;
            }else{
                break;
            }
            left--;
            right++;
        }
        return ans;
    }
    public static String longestPalindrome(String str){
        int N = str.length();
        int[] maxLen= new int[3]; //i=0->left,i=1->right,i=2->len
        //oddlength
        for(int i=0; i<N; i++){
            int[] len=expand(str,i-1,i+1);
            if(len[2]>maxLen[2]){
                maxLen[2] = len[2];
                maxLen[0] = len[0];
                maxLen[1] = len[1];
                
            }
            
        }
        
        //evenLength
        for(int i=0; i<N; i++){
            int[] len = expand(str,i,i+1);
            if(len[2]>maxLen[2]){
                maxLen[2] = len[2];
                maxLen[0] = len[0];
                maxLen[1] = len[1];
                
            }
        }
        return str.substring(maxLen[0],maxLen[1]+1);
    }
    public static void main(String args[]) {
    Scanner sc =  new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(longestPalindrome(str));
    }
}
