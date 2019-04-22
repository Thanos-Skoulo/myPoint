package com.company;

public class MyCircle {

    MyPoint center;
    int radius;

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI* Math.pow(radius,2);
        return area;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public double distance(MyCircle otherCircle){
        return center.distance(otherCircle.center);
    }

    @Override
    public String toString() {
        return "MyCircle[radius = " + radius + ", center = " + center;
    }
}
