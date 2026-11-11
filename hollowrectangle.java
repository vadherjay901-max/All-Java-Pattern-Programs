// hollow rectangle
import java.util.Scanner;
class hollowrectangle{
  public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you row ::");
      int row = sc.nextInt();
     System.out.println("Enter a colum ::");
      int colum = sc.nextInt();
     System.out.print("\n"); 

    // stating colum

    for(int x = 1;x<=(colum+1);x++){
     System.out.print("* ");
    }
     System.out.print("\n");
   
   // middal part
    for(int i =1;i<=(row-1);i++){
      System.out.print("*");
        
        for(int k =1;k<(colum*2) ;k++){
          System.out.print(" ");
           }
      

      System.out.print("*");
      System.out.print("\n");
      }

   // last colum
    for(int z = 1;z<=(colum+1);z++){
     System.out.print("* ");
    }
  }
 }