import java.io.*;
import java.util.*;


public class Solution {

        public static String capitilize(String input){
        String output = input.substring(0, 1).toUpperCase() + input.substring(1);
        return output;

    }
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)<=0){System.out.println("No");}
        else{System.out.println("Yes");}
        System.out.printf("%s %s",capitilize(A),capitilize(B));
        
    }
}




