import shape.mathshapes;
class calshapes{
  public static void main(String [] args){
      mathshapes ms=new mathshapes();
      int x=0;
       ms.circle cs =new ms.circle();
       ms.square ss =new ms.square();
       ms.triangle tt =new ms.triangle();
       while(x!=-1){
         System.out.println("Enter your shape");
         String s=sc.next();
         switch(s){
           case "circle":
              System.out.println("enter your radius");
              int r=sc.nextInt();
              System.out.println("area is"+cs.calarea(r));
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
