
package check1;
import java.util.Scanner;

public class Phone {
    public int area;
    public int num;
    
    

    public Phone(int area, int num) {
        this.area = area;
        this.num = num;
    }
    public void input(){
       Scanner sc = new Scanner(System.in); 
       area=sc.nextInt();
       num=sc.nextInt();
        
    }
    public void display(){
        System.out.println("Area: "+area);
        System.out.println("num: "+num);
    }
}
