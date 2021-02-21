package com.leodiam.java2Solutions.randomEx;

abstract class Shape {
    private double x, y;        // Position
    protected double getX() { return x; }
    protected double getY() { return y; }
    public void setposition(double px, double py) {
        x = px;
        y = py;
    }
    public abstract double area();
    @Override public String toString() {
        return "Shape(x=" + x + ", y=" + y + ", area=" + area() + ")";
    }
}

class Circle extends Shape {
    private double radius;
    public void setradius(double r) {
        radius = r;
    }
    @Override public double area() {
        return 2 * Math.PI * radius * radius;
    }
    @Override public String toString() {
        return super.toString() + ": Circle(" + radius + ")";
    }
}

class Rectangle extends Shape {
    private double height, width;
    public void setdimensions(double h, double w) {
        height = h;
        width = w;
    }
    @Override public double area() {
        return height * width;
    }
    @Override public String toString() {
        return super.toString() + ": Rectangle(" + height + " x " + width + ")";
    }
}

class Test {
    static public void main(String args[])
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Shape s[] = new Shape[2];

        s[0] = r;
        r.setposition(1, 2);
        r.setdimensions(50, 50);

        s[1] = c;
        c.setposition(3, 4);
        c.setradius(10);
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i]);
    }
}
