// Diamond Pattern 
import java.util.Scanner;
class diamondpattern{
 public static void main(String []args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number :: ");
 int n = sc.nextInt();
 for(int i =1;i<=n;i++){
    for(int j=n;j>=i;j--){
        System.out.print(" ");
    }
    for(int k =1;k<=i;k++){
        System.out.print("* ");
    }
 System.out.println();
  }
 for(int i =n-1;i>=1;i--){
    for(int j=n;j>=i;j--){
        System.out.print(" ");
    }
    for(int k =1;k<=i;k++){
        System.out.print("* ");
    }
 System.out.println();
  }		
 }
}