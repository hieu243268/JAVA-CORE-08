/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check1;

public class test {

    public static void main(String[] args) {
        int n, i;
        n = 4;
        Phone[] a = new Phone[n];
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[i]=new Phone();
                
            } else {
                a[i] = new IntPhone();
            }
            a[i].input();
        }
        for (i = 0; i < n; i++) {
            a[i].display();
        }
        System.out.println();
    }

}
