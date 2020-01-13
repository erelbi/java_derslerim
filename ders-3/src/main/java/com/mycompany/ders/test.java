/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ders;

/**
 *
 * @author xc
 */
public class test {
    public static void main (String[] args){
     araba araba1 = new  araba();
     araba1.SetModel("fiat");
     System.out.println("araba1 modeli" + araba1.getModel());
     
     
     araba1.setKapilar(-7);
     System.out.println("araba1 kapilar" + araba1.getKapilar());
    
     
     /*araba araba3 = null;
     araba3.SetModel("fiat");*/
}
}

