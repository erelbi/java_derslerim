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
public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    
     Account(String hesapNo, double bakiye,String isim,String email,String telefonNo){
      this.hesapNo = hesapNo;
      this.bakiye=bakiye;
      this.isim=isim;
      this.telefonNo=telefonNo;
      
        
    }

  
    
    
    public void paraYatir(double Miktar){
        bakiye += Miktar;
        System.out.println("yeni bakiye "+ bakiye);
        
    }

    public void paraCekme(double Miktar){
        if (Miktar > 1500 ){
            System.out.println("yasak");
        }
        if (bakiye - Miktar < 0 ){
            System.out.println("yeterli miktar yok" + Miktar);
        }
        else {
            bakiye -= Miktar;
            
            System.out.println("yeni bakiye= "  + bakiye);
            
        }
    }
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNo
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * @param telefonNo the telefonNo to set
     */
    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    
    
}
