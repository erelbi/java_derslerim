/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders2;

/**
 *
 * @author xc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int x = 10;
          int y;
          int sadi;
          sadi = 10;
          System.out.println("merhaba dünya"+ sadi);
          String s = "ben kara  bir melek gibiyim nalaaan" ;
          s = s.toUpperCase();
          System.out.println(s);
          int İlkBosluk = s.indexOf(" ");
          var SonBosluk = s.lastIndexOf(" ");
          String SonKelime = s.substring(SonBosluk);
          String İlkKelime = s.substring(0, İlkBosluk);
          System.out.println();
          
     //     String ilkKelime = s.indexOf
          System.out.println(SonKelime+ İlkBosluk + İlkKelime);
                  
    }
    
}
