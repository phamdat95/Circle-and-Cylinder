public class Cylinder extends Circle {
    private double height;

    Cylinder(double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }

    private void setHeight(double height){
        this.height = height;
    }
    private double getHeight(){return height;}

    double getArea(){
        return 2 * Math.PI * getRadius() * (getRadius() + getHeight());
    }
    private double getVolume(){
        return Math.PI * Math.pow(getRadius(),2) * getHeight();
    }
    public String toString(){
        return "A Cylinder with radius = " + getRadius() + ", Color = " + getColor() + ", Area = " + getArea() + ", Volume = " + getVolume();
    }
}
