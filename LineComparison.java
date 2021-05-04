package javapractice;

import java.util.Scanner;

public class LineComparison {

	public static void main(String args[]) {
		
		
		int x1,x2,y1,y2;
       

      double distance;

      Scanner sc = new Scanner(System.in);

      System.out.println("enter x1 point");

                x1=sc.nextInt();
 
                System.out.println("enter y1 point");

                y1=sc.nextInt();

      System.out.println("enter x2point");

                x2=sc.nextInt();

      System.out.println("enter y2 point");

                y2=sc.nextInt();
	    
                distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
                double  point1 = x2-x1;
                double point2 = y2-y1;
	    	 	    
        System.out.println("distance between point"+"("+x1+","+y1+") and "+"("+x2+","+y2+") is "+distance);
	

System.out.println(Double.compare(point1, point2));
System.out.println(point1==(point2));
	}
}
