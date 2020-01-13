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
public class araba {
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;
    
    public void SetModel(String model){
        this.setModel(model);
        
    }
    
    public String getModel(){
        return this.model;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kağilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kağilar the kağilar to set
     */
    public void setKapilar(int kapilar) {
        
        if (kapilar < 0)
            System.out.println("kapilar sıfırdan küçük olamaz");
        else
            this.kapilar = kapilar;
    }

    /**
     * @return the tekerlekler
     */
    public int getTekerlekler() {
        return tekerlekler;
    }

    /**
     * @param tekerlekler the tekerlekler to set
     */
    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    
}
