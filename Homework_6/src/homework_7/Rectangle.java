package homework_7;

public class Rectangle extends Shape{
	private int width, height;
	
	public Rectangle (String color, int width, int height) {
		super(color);
        this.width = width;
        this.height = height;
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
        return super.toString() + "width=" + width + ", height= " + height;
    }
	
	 @Override
	    public double calcArea (){
	      return (width*height);
	    }
	 
	 @Override
     public void draw (){
         System.out.println(this.toString()+ ";\t area="+ this.calcArea());
     }

}
