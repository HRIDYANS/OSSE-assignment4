import java.util.Scanner;
class AreaOfCircle 
{
   public static void main(String args[]) 
    {   
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the radius:");
      double rad= s.nextDouble();      
      double  a=area(rad);
      System.out.println("Area of Circle is: " + a);      
   }
   static double area(double r)
    {
	return (22*r*r)/7;
    }
}

//added by Joby Jose on 2nd Nov 2021
// new class PerimeterOfCircle
class PerimeterOfCircle
{
      
   public static void main(String args[]) 
    {   
           Scanner s= new Scanner(System.in);
        
           System.out.println("Enter the radius:");
           
	   double r= s.nextDouble();
         
	   double  a=PerimeterOfCircle.area(r); 
 
           System.out.println("Perimeter of Circle is: " +c);   
      }
     public static double area(double r)
    {   
       
	   double  a=(22*2*r)/7;
 
           return a;
      }
 
 
}

// added by Sanu Mony on 2nd Nov 2021
//new class AreaOfRectangle

class AreaOfRectangle 
{
   public static void main(String args[]) 
 
    {   
 
    System.out.println("The value of length:");
 
         double l= 5;
         
     System.out.println("The value of Breadth:");
        
         double b= 10;
         
        double  area=l*b;
     System.out.println("Area of Rectangle is: " + area);   
   
         }
}
