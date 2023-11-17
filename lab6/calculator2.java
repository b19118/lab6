import java.util.*;
import calculator.cal1;
class calculator2{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      cal1 mathcalculator=new cal1();
      int x=0;
      while(x!=-1){
         System.out.println("Enter a:");
         int a=sc.nextInt();
         System.out.println("Enter b:");
         int b=sc.nextInt();
         System.out.println("Enter your opertation");
         String s=sc.next();
         switch(s){
           case "add":
             System.out.println("result is"+mathcalculator.add(a,b));
             break;
           case "multiply":
             System.out.println("result is"+mathcalculator.multiply(a,b));
             break;
           case "div":
             System.out.println("result is"+mathcalculator.div(a,b));
             break;
            case "sub":
             System.out.println("result is"+mathcalculator.sub(a,b));
             break;
         }
          System.out.println("Enter x:");
         x=sc.nextInt();
      }
      
      
   }
}
