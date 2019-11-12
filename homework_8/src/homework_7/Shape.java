package homework_7;

public abstract class Shape implements Drawable, Comparable<Object> {
    public String getColor() {
        return color;
    }

    private String color;
    public Shape (String color ) {this.color = color;}
    public abstract double calcArea();

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ": \tcolor= " + color+"\t";
    }
}
