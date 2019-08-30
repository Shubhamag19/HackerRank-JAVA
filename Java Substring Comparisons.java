import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int len=s.length();
        String[] arr=new String[len-k+1];
        for(int i=0;i<len-(k-1);i++) {
            arr[i]=s.substring(i,i+k);
        }
        if(len==k) {
            largest=s;
            smallest=s;
        }
        else {
        if(arr[0].compareTo(arr[1])<0) {
            smallest=arr[0];
            for(int i=1;i<len-k+1;i++) {
                if(smallest.compareTo(arr[i])>0) {
                    smallest=arr[i];
                }
            }
        }
        else {
            smallest=arr[1];
            for(int i=2;i<len-k+1;i++) {
                if(smallest.compareTo(arr[i])>0) {
                    smallest=arr[i];
                }
            }
        }
        
        if(arr[0].compareTo(arr[1])>0) {
            largest=arr[0];
            for(int i=1;i<len-k+1;i++) {
                if(largest.compareTo(arr[i])<0) {
                    largest=arr[i];
                }
            }
        }
        else {
            largest=arr[1];
            for(int i=2;i<len-k+1;i++) {
                if(largest.compareTo(arr[i])<0) {
                    largest=arr[i];
                }
            }
        }
        }
        return smallest + "\n" + largest;
    }   


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
