// inverted half pyramid
import java.util.Scanner;
class invertedhalfpyramid{
 public static void main(String []args){
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number ::");
  int row = sc.nextInt();
  for(int i =1; i<=row;i++){
    for(int j =row;j>=i;j--){
    System.out.print("* ");
 
   }
   System.out.print("\n"); 
   } 
  } 
 }