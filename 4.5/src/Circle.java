public class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius= 1.0;
    }
    public Circle(double radius){
        this.radius= 1.0;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius= 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double Perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color=" + color + ",filled=" + filled + "]radius=" + radius + "]";
    }
}
