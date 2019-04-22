package com.company;

public class Main {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.setXY(2,4);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        MyPoint p2 = new MyPoint(3,4);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());

        MyPoint[] points = new MyPoint[9];

        for(int i=0; i<points.length; i++){
            points[i]=new MyPoint(i,i);
        }
        for (int i = 0; i<points.length; i++){
            System.out.println(points[i]);
        }

        MyCircle circle = new MyCircle(p1,10);
        System.out.println(circle.center);
        MyCircle circle2 = new MyCircle(new MyPoint(2,4),30);
        System.out.println(circle.distance(circle2));

        MyTriangle[] triangles = new MyTriangle[3];

        for(int i= 0; i<points.length; i+=3){
            MyTriangle triangle = new MyTriangle(points[i],points[i+1],points[i+2]);
            triangles[i/3]= triangle;
        }

        for(int i = 0; i<triangles.length; i++){
            System.out.println(triangles[i]);
            System.out.println("type= "+ triangles[i].getType());
            System.out.println("perimeter= "+ triangles[i].getPerimeter());
        }

    }
}
