package homework_7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    	
	Shape [] shapes = {
			new Rectangle("blue", 17, 5),
            new Rectangle("pink", 120, 20),
            new Rectangle("green", 40, 14),
            new Rectangle("white", 10, 25),
           
            new Circle("pink", 120),
            new Circle("green", 40),
            new Circle("white", 10),
            
            new Triangle("black", 18, 22, 36),
			new Triangle("violet", 120, 82, 70),
    };

        for (Shape elem: shapes) {
            elem.draw();

        }
        System.out.println("\nSorted array by color: ");
  
        Arrays.sort(shapes, new MyComparatorColor());

        for (Shape elem: shapes) {
            elem.draw();

        }
        
        System.out.println("\nSquare of all elements is " + squareOfAll(shapes));
        System.out.println("Square of rectangles is " + squareOfRectangles(shapes));
        System.out.println("Square of circles is " + squareOfCircles(shapes));
        System.out.println("Square of triangles is " + squareOfTriangles(shapes));
     
    }
    
  

	static double squareOfAll (Shape[] shapes1) {
   	 double s = 0;
   	 for (Shape elem: shapes1) {
   		 s = s+elem.calcArea();
   	 }
        return Math.round(s*100)/100.0;    

        }
	
	static double squareOfRectangles (Shape[] shapes1) {
	   	 double s = 0;
	   	 
	   	 for (int i = 0; i<shapes1.length; i++) {
	   		 	if (shapes1[i].getClass().getSimpleName().contains("Rectangle") ) {
	   		 		s = s + shapes1[i].calcArea();
	   		 	}
	   		 
	   	 }
	        return  Math.round(s*100)/100.0;    

	        }
	
	static double squareOfCircles (Shape[] shapes1) {
	   	 double s = 0;
	   	 
	   	 for (int i = 0; i<shapes1.length; i++) {
	   		 	if (shapes1[i].getClass().getSimpleName().contains("Circle") ) {
	   		 		s = s + shapes1[i].calcArea();
	   		 	}
	   		 
	   	 }
	        return  Math.round(s*100)/100.0;    

	        }
	
	static double squareOfTriangles (Shape[] shapes1) {
	   	 double s = 0;
	   	 
	   	 for (int i = 0; i<shapes1.length; i++) {
	   		 	if (shapes1[i].getClass().getSimpleName().contains("Triangle") ) {
	   		 		s += shapes1[i].calcArea();
	   		 	}
	   		 									
	   	 }
	        return Math.round(s*100)/100.0;    

	        }

}
