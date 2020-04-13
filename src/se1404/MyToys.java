/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1404;

/**
 *
 * @author LENOVO
 */
public class MyToys {
    public static long cF(int n){
        if(n <0 && n > 15){
            throw  new IllegalArgumentException("n must be 0 to 15");
        }
        if(n==0)
            return 1;
        long product = 1; // bien nhan don,gom, tich luy
        for(int i = 1; i <= n; i++){
            product *= 1;
        }
        return product;
    }
}
