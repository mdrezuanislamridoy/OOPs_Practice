// Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.

abstract class Shape {

    abstract double calculateArea();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {

        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    double calculateArea() {
        return l * w;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Polymorphism_practice_2.java {

    public static void main(String[] args) {

        Shape s = new Circle(5);
        Shape r = new Rectangle(5, 6);
        Shape t = new Triangle(4, 7);

        double ss = s.calculateArea();
        System.out.println("Area of circle is " + ss);

        double rr = r.calculateArea();
        System.out.println("Area of Rectangle is " + rr);

        double tt = t.calculateArea();
        System.out.println("Area of Triangle is " + tt);
    }
}
