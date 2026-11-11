//floyd's triangle
import java.util.Scanner;
class floydstriangle{
 public static void main(String []args){
  int a =1;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number ::");
  int row = sc.nextInt();
  for(int i= 1;i<=row;i++){
   for(int j =1;j<=i;j++){
    System.out.print(a+" ");
     a++;
     }
    System.out.println();
   } 
  } 
 }