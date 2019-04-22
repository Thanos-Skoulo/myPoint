package com.company;

public class MyTriangle {

    MyPoint v1;
    MyPoint v2;
    MyPoint v3;
    double side1;
    double side2;
    double side3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;

        side1 = v1.distance(v2);
        side2 = v2.distance(v3);
        side3 = v3.distance(v1);
    }

    public MyPoint getV1() {
        return v1;
    }

    public void setV1(MyPoint v1) {
        this.v1 = v1;
        side1 = v1.distance(v2);
        side3 = v3.distance(v1);
    }

    public MyPoint getV2() {
        return v2;
    }

    public void setV2(MyPoint v2) {
        this.v2 = v2;
        side1 = v1.distance(v2);
        side2 = v2.distance(v3);
    }

    public MyPoint getV3() {
        return v3;
    }

    public void setV3(MyPoint v3) {
        this.v3 = v3;
        side2 = v2.distance(v3);
        side3 = v3.distance(v1);
    }

    public double getPerimeter(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {

        if((side1 == side2) && (side2 == side3) && (side3 == side1)){
            return "equilateral";
        }else if(((side1 == side2))|| (side1 == side3)||(side2==side3)){
            return "isoskeles";
        }else{
            return "skalene";
        }

    }

    @Override
    public String toString() {
        return "My Triangle[ " + v1 + ", " + v2 + ", " + v3 +"]";
    }
}
