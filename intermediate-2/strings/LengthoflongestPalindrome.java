import java.util.*;
public class MyClass {
    public static int expand(String str, int left, int right){
        int len=0;
        while(left>=0 && right<str.length()){
            if(str.charAt(left)==str.charAt(right)){
                len+=2;
                
            }else{
                break;
            }
            left--;
            right++;
            
        }
        return len;
    }
    public static int palindromeLength(String str){
        int N = str.length();
        int maxLen = 0;
        //oddLengthPalindrome
        //System.out.println("oddLength");
        for(int i=0; i<N; i++){
            int len = expand(str,i-1,i+1);
           // System.out.println(i+" "+len);
            if(len+1 > maxLen){
                maxLen = len+1;
            }
        }
        //evenLengthPalindrome
       // System.out.println("evenLength");
        for(int i=0; i<N; i++){
            int len = expand(str,i,i+1);
           // System.out.println(i+" "+len);
            if(len > maxLen){
                maxLen = len;
            }
        }
        return maxLen;
        
    }
    public static void main(String args[]) {
      Scanner sc =  new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println(palindromeLength(str));
    }
}
