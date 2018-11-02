public class Circle {
    private double radius;
    private String color;

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    private void setRadius(double radius){
        this.radius = radius;
    }
    private void setColor(String color){
        this.color = color;
    }
    double getRadius(){
        return radius;
    }
    String getColor(){
        return color;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }
    private double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public String toString(){
        return "A Circle with radius = " + getRadius() + ", Color = " + getColor() + ", Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
