/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.constructer;

/**
 *
 * @author xc
 */
public class test {
    public static void main(String[] args){
    /*    Account hesap1 = new Account();
        hesap1.setHesapNo("89374893274897");
        hesap1.setBakiye("5000");
        hesap1.setEmail("bilselergun@gmail.com");
        hesap1.setTelefonNo("9273927");
        hesap1.setIsim("ergün elvan bilsel");*/
    
    Account hesap2 = new Account("448", "50000", "erelbi", "+905078018833");
    
    hesap2.paraYatir(500);
    
}
    
}