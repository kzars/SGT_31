package oop;

public class Triangle {

    //Fields
    private double side1;
    private double side2;
    private double side3;

    //Setter methods
    public void setSide1(double side1) {this.side1 = side1;}
    public void setSide2(double side2) {this.side2 = side2;}
    public void setSide3(double side3) {this.side3 = side3;}

    //Getter methods
    public double getSide1() {return side1;}
    public double getSide2() {return side2;}
    public double getSide3() {return side3;}

    private boolean isValid(double side1, double side2, double side3){
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public double triangleArea(){
        double area;
        if(isValid(side1,side2,side3)){
            double halfPer = (side1 + side2 + side3)/2;
            area = Math.sqrt(halfPer * (halfPer-side1) * (halfPer - side2) * (halfPer - side3));
        }else {
            System.out.println("Triangle is not valid");
            area = 0.0D;
        }
        return area;
    }



}
