/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hesaplama;

/**
 *
 * @author xc
 */
public class Main{
    public static void main(String[] args){
   
    Hesaplama.Toplama ht = new Hesaplama().new Toplama();
    int sonuc = ht.toplamayap(4, 40);
    System.out.println("Sonuc :" + sonuc);
    
}
}