//Hollow Rhombus
import java.util.*;
class hollowrhombus{
 public static void main (String []args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a row number ::");
 int row = sc.nextInt();
 System.out.print("Enter a colum number ::");
 int colum = sc.nextInt();
 
 for(int i =1 ; i<=row;i++){
    for(int j = row-1;j>=i;j--){
       System.out.print("  ");
    }
    for(int k =1 ; k<= colum;k++){
        if(i==1||k==1||i==row||k==colum){
          System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
    }
 System.out.println();
  }
 }
}