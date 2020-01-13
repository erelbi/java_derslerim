/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders.kalitim;

/**
 *
 * @author xc
 */
public class DersKalitim {

    /**
     * @param args the command line arguments
     */
 
    public class Hayvan {
    
    //Hayvanların Özellikleri
    public void beslenme(){
        System.out.println(“Hayvanlar beslenir”);
    }
    
    public void barinma(){
        System.out.println(“Hayvanlar Barınır”);
    }
    
    public void diski(){
        System.out.println(“Hayvanlar Dışkı Bırakır”);
    }
    
    public void boyut(){
        System.out.println(“Hayvanların Boyutları vardır”);
    }
    
    public void solunum(){
        System.out.println(“Hayvanlar Solunum yapar”);
    }
    
}

//–Kus sınıfı

public class Kus extends Hayvan {

    public void ucma() {
        System.out.println(“Kuşlar Uçar”);
    }

    @Override
    public void barinma() {
        System.out.println(“Kuşlar Samanlardan Yaptıkları “
                + “Yuvalarda Barınırlar”);
    }
}

//–Balık Sınıfı

public class Balik extends Hayvan{
    
    public void sudayuzer(){
        System.out.println(“Balıklar suda yüzer”);
    }    
    //Balıkların farklı bir özelliğini belirtiyoruz
    //Balıktan türeyen sınıflar bu değişiklikten etkilenir.
    @Override
    public void solunum() {
        System.out.println(“Balıklar Solungaçları ile Solunum Yapar”);
    }            
}

//–Güvercin Sınıfı

public class Guvercin extends Kus{
    
    //Güvercin hayvanların ortak özelliği olan beslenmeyi
    //Kendine göre değiştiriyor
    @Override
    public void beslenme() {
        System.out.println(“Güvercin buğday yer”);
    }
    
    @Override
    public void boyut() {
        System.out.println(“Güvercinin boyutları 20-30cm Arasıdır”);
        
    }    
}

//–Japon Balığı sınıfı
public class JaponBaligi extends Balik {   
    //Mirası Hayvan sınıfından değil
    //balik sınıfındaki değişmiş halini alır.
    @Override
    public void solunum() {
        // TODO Auto-generated method stub
        super.solunum();
    }

}

//–MainClass kodların çalıştırılacağı class

public class MainClass {
    //Kullanımları
    public static void main(String[] args) {
        Guvercin guvercin=new Guvercin();
        Kus kus=new Kus();
        guvercin.beslenme();
        kus.beslenme();
        
        System.out.println();
        
        guvercin.barinma();
        guvercin.boyut();
        
        System.out.println();
        
        kus.boyut();        
        kus.solunum();
        
        System.out.println();
        
        Balik balik=new Balik();
        balik.sudayuzer();
        balik.solunum();
        
        System.out.println();
        
        JaponBaligi jb=new JaponBaligi();
        jb.solunum();
    }
    
}
}
