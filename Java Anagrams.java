import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
         char[] s1=a.toLowerCase().toCharArray();
         char[] s2=b.toLowerCase().toCharArray();
         int size=s1.length;
         if(a.length()!=b.length()) {
             return false;
         }
         else {
             for(int i = 0; i<size-1; i++) {
                 for (int j = i+1; j<size; j++) {
                    if((int)s1[i]>(int)s1[j]) {
                       char temp = s1[i];
                       s1[i] = s1[j];
                       s1[j] = temp;
                    }
                 }
              }
             for(int i = 0; i<size-1; i++) {
                 for (int j = i+1; j<size; j++) {
                    if((int)s2[i]>(int)s2[j]) {
                       char tem = s2[i];
                       s2[i] = s2[j];
                       s2[j] = tem;
                    }
                 }
              }
             for(int i=0;i<size;i++) {
                 if(s1[i]!=s2[i]) {
                     return false;
                 }
             }
             }
       return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
