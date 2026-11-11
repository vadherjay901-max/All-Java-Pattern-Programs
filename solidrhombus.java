import java.util.Scanner;
class solidrhombus{
 public static void main (String []args){
  Scanner s1 = new Scanner(System.in);
  System.out.println("Enter a row number ::");
  int row = s1.nextInt();
  System.out.println("Enter a colum number ::");
  int colum = s1.nextInt();
 
  for(int i = 1;i<=row;i++){
   for(int j =row-1;j>=i;j--){
     System.out.print("  ");
   }
   for(int k=1;k<=colum;k++){
    System.out.print("* ");
   }
  System.out.println();
  }
 }
}