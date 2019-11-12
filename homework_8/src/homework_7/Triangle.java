package homework_7;

public class Triangle extends Shape{
	private int a,b,c;
	
	public Triangle(String color, int a, int b, int c) {
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	 @Override
	    public int compareTo(Object o) {
	        if (o instanceof Shape){
	            return (int)(this.calcArea() - ((Shape) o).calcArea());
	        }
	        return 0;
	    }
	 @Override
		public String toString() {
	        return super.toString() + "a=" + a + ", b= " + b + ", c=" + c;
	    }
		
		 @Override
		    public double calcArea (){
			 double p = (a+b+c)/2;
		      return Math.round((Math.sqrt(p*(p-a)*(p-b)*(p-c)))*100.0)/100.0;
		    }
		 
		 @Override
	     public void draw (){
	         System.out.println(this.toString()+ ";\tarea="+ this.calcArea());
	     }

}
