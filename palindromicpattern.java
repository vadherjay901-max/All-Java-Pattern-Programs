// Palindromic Pattern
import java.util.Scanner;
class palindromicpattern{
 public static void main(String []args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number ::");
 int n =sc.nextInt();
 for(int i = 1; i<=n;i++){
    for(int j = 1; j<=n-i;j++){
       System.out.print("  ");
    }
    for(int k = i; k>=1;k--){
       System.out.print(k+" ");
    }
    for(int z =2;z<=i;z++){
       System.out.print(z+" ");
    }
    System.out.println();
  } 
 }
}