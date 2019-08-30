import java.io.*;
import java.util.*;

public class Solution {
    public static String toCamelCase(final String init) {
        if (init == null)
            return null;

        final StringBuilder ret = new StringBuilder(init.length());

        for (final String word : init.split(" ")) {
            if (!word.isEmpty()) {
                ret.append(Character.toUpperCase(word.charAt(0)));
                ret.append(word.substring(1).toLowerCase());
            }
            if (!(ret.length() == init.length()))
                ret.append(" ");
        }

        return ret.toString();
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len=A.length()+B.length();
        System.out.println(len);
        if((int)A.charAt(0)>(int)B.charAt(0)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        String s1=toCamelCase(A);
        String s2=toCamelCase(B);
        System.out.println(s1+" "+s2);
    }
}
