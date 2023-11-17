import dept.*;
import java.util.*;
class branches{
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       int x=0;
       cse cs=new cse();
         ece ec=new ece();
         eee ee=new eee();
       while(x!=-1){
         System.out.println("Enter your branche");
         String s=sc.next();
         switch(s){
           case "cse":
              System.out.println("Subjects are:");
              cs.displaysubjects();
             break;
           case "ece":
           System.out.println("Subjects are:");
             ec.displaysubjects();
             break;
           case "eee":
           System.out.println("Subjects are:");
             ee.displaysubjects();
             break;
         }
         System.out.println("Enter x:");
         x=sc.nextInt();
      }
       
    }
}
