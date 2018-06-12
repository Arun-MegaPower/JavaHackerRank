import java.util.*;
import java.io.*;
import java.lang.Math;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double prev_value = a;
             for(int j=0;j<n;j++){
             System.out.printf("%d ",(int)(Math.pow(2,j)*b+prev_value));
             prev_value += Math.pow(2,j)*b;
            }
           System.out.println("");
        }
       
        
        in.close();
    }
}
