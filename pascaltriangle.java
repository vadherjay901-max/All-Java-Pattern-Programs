// Pascal Triangle
import java.util.*;
class pascaltriangle{
 public static void main(String []args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a Number ::");
 int n = sc.nextInt();
 for(int i=0;i<=n;i++){
     int  value = 1;
    for(int j =0;j<n-i;j++){
       System.out.print(" ");
    } 
    for(int k = 0;k<=i;k++){
       System.out.print(value+" ");
        value = value*(i-k)/(k+1);
    }
   System.out.println();
 } 
 } 
}
     