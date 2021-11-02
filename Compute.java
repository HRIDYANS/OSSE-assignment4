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

// added by Hridya on 2nd Nov 2021
// new class AreaOfTriangle
class AreaOfTriangle 
{
   public static void main(String args[]) 
    {          
      Scanner s1= new Scanner(System.in);        
         System.out.println("Enter the 1st side:");
         int a= s1.nextInt(); 
         System.out.println("Enter the 2nd side:");
          int b= s1.nextInt(); 
         System.out.println("Enter the 3rd side:");
         int c= s1.nextInt();
        if((a+b)>c && (a+c)>b && (b+c)>a)
          {
            int s=(a+b+c)/2;
            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
             System.out.println("Area of Triangle is: " + area);    
           }
         else  
           System.out.println("Area of Triangle not exit");
   }
}
