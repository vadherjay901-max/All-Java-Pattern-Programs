//inverted half pyramid (rotated by 180 deg)
import java.util.Scanner;
class invertedhalfpyramid180{
 public static void main(String []args){
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Number ::");
  int row = sc.nextInt();
  for(int i =1; i<=row;i++){
   for(int x= row-1;x>=i;x--){
     System.out.print("  ");
   }
    for(int j =1;j<=i;j++){
    System.out.print("* ");
 
   }
   System.out.print("\n"); 
   } 
  } 
 }