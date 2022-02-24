import java.util.Scanner;
class Example3{
    
    public static void main(String args[]){
        
      Scanner s=new Scanner(System.in);
      System.out.println("Enter number");  //15
      
      int num=s.nextInt();
      
      if(num%2==0){
          System.out.println("Even number");
      }
      else{
          System.out.println("Odd number");
      }
       
    }
}