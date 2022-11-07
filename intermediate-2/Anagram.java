import java.util.*;
public class MyClass {
     public static int solve(String A, String B) {
        int N = A.length();
        int M = B.length();
        int[] arr = new int[26];
        for(int i=0; i<N; i++){
            arr[A.charAt(i)-'a']++;
        }
        for(int i=0; i<M; i++){
            arr[B.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(arr[i]!=0){
                return 0;
            }
        }
        return 1;

    }
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     String A = sc.nextLine();
     String B = sc.nextLine();
     System.out.println(solve(A,B));
    }
}
/*
A: cat | B: bat -> o/p: 0
A: secure | B: rescue ->o/p: 1
*/
