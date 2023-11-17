package shape;
public class mathshapes{
   class circle{
       public double calarea(double r){
          return 3.14*r*r;
       }
       public double calperimeter(double r){
          return 2*3.14*r;
       }
       
   }
    class square{
       public double calarea(double r){
          return  s*s;
       }
       public double calperimeter(double r){
          return  4*r;
       }
       
   }
    class triangle{
       public double calarea(double l,double b){
          return l*b; 
       }
       public double calperimeter(double b,double h){
          return 1/2*b*h;
       }   
   }
}
