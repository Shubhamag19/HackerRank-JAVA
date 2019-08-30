import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++) {
            int val=sc.nextInt();
            list.add(val);
        }
        int Q=sc.nextInt();
        for(int j=0;j<Q;j++) {
        String s=sc.next();
        if(s.equals("Insert")) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<list.size()) {
                list.add(x, y);    
            }
            else {
                list.add(y);
            }
        }
        else if(s.equals("Delete")) {
            int x=sc.nextInt();
            list.remove(x);
        }
    }
        Iterator itr=list.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(" ");
        }
    }
}
