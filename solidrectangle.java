// solid rectangle
import java.util.Scanner;
class solidrectangle{
  public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you row ::");
      int row = sc.nextInt();
     System.out.println("Enter a colum ::");
      int colum = sc.nextInt();
     System.out.print("\n");
    for(int i =1;i<=row;i++){
      for(int j=1;j<=colum;j++){
       System.out.print("* ");
      }
     System.out.print("\n");
    }
   
  }
 }