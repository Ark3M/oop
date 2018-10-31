public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape(){};

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}

class Circle extends Shape {

    protected double radius;

    public Circle(){};

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "It's circle";
    }
}

class Rectangle extends Shape{

    protected double weight;
    protected double length;

    public Rectangle(){};

    public Rectangle(double weight, double length){
        this.weight = weight;
        this.length = length;
    }

    public Rectangle(double weight, double length, String color, boolean filled){
        this.weight = weight;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    
    //Доделать 
}
