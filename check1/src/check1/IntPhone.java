
package check1;

import java.util.Scanner;

public class IntPhone extends Phone{
    public int code;

    public IntPhone(int code, int area, int num) {
        super(area, num);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
     @Override
     public void input(){
       Scanner sc = new Scanner(System.in); 
         System.out.println("Enter area= ");
         area=sc.nextInt();
         System.out.println("Enter num= ");
         num=sc.nextInt();
       code=sc.nextInt();
        
    }
     @Override
    public void display(){
        System.out.println("code: "+code);
    }
    
    
}
