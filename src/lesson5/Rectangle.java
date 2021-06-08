package lesson5;
import java.util.Scanner;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap width: ");
        width = sc.nextDouble();
        System.out.println("Nhap height: ");
        height = sc.nextDouble();

    }
    public void display(){
        System.out.println("width: "+width);
        System.out.println("height: "+height);
        System.out.println("Chu vi là: "+(width+height)*2);
        System.out.println("dien tích là: "+(width*height));
        if(height==width){
            System.out.println("hinh vuong");
        }else{
            System.out.println("khong phai hinh vuong");
        }
    }
}
