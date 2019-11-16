package homework_7;

public class Circle extends Shape {

    @Override
    public int compareTo(Object o) {
        if (o instanceof Shape){
            return (int)(this.calcArea() - ((Shape) o).calcArea());
        }
        return 0;
    }

    private int radius;
    
    public Circle (String color, int radius){
        super(color);
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + "radius=" + radius;
    }

    @Override
    public double calcArea (){
       	return (Math.round((Math.PI*Math.pow(radius, 2))*100))/100.0;
    }

    @Override
        public void draw (){
            System.out.println(this.toString()+ ";\t area="+ this.calcArea());
        }
   

}
