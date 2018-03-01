/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kontrolltoo;

import java.io.IOException;


public class main {
    public static void main(String[] arg) throws IOException{
         
        
        
        kiirused k1 = new kiirused (90,10);
        kiirused k2= new kiirused (90,10);
        kiirused k3 = new kiirused (180,5);
        kiirused k4= new kiirused (50,15);
        kiirused k5 = new kiirused (110,7);
        kiirused k6= new kiirused (70,13);
        
        System.out.println("Kahe kilomeetrise lõigu läbimise keskmine kiirus: "+k1.keskmineKiirus(k2)+"km/h");
        System.out.println("Kuue kilomeetrise lõigu läbimise keskmine kiirus: "+Math.round(k1.keskminePikem(k2,k3,k4,k5,k6))+"km/h");
        System.out.println(k1.kiirusedPildile(k2,k3,k4,k5,k6));
        
    }
}
