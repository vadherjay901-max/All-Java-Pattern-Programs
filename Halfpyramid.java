import java.util.Scanner;
public class Halfpyramid{
 public static void main (String args[]){
  Scanner s1 = new Scanner(System.in);
  System.out.println("Enter a number ::");
  int n = s1.nextInt();
      int row = n;
  
 for(int i =1;i<=row;i++){

    for(int j =1;j<=i;j++){
      System.out.print("* ");
     
      }
    System.out.println();
    }
  }
}