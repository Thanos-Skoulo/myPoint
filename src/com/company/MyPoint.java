package com.company;

import java.lang.reflect.Array;

public class MyPoint {
    int x;
    int y;

    public MyPoint() {
        x=0;
        y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
       return new int[]{x,y};
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y){
        int difx = this.x - x;
        int dify = this.y - y;
        double distance = Math.sqrt(difx*difx + dify*dify);
        return distance;

    }

    public double distance(){
        return distance(0,0);
    }

    public double distance(MyPoint point){
        return distance(point.getX(),point.getY());
    }
}
