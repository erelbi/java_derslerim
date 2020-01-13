/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplama1;

/**
 *
 * @author xc
 */
public class Hesaplama1{
    public class Toplama{
        public int toplamaYap(int a, int b){
            return a+b;
        }
    }
    protected class Cikartma{
        public int cikarmaYap(int a, int b){
            return a-b;
            
        }
    }
     class Carpma{ 
         public int carpmaYap(int a, int b){
             return a*b;
         }
        
    }
     private class Bölme{
         public int bölmeYap(int a, int b){
                 return a/b;
     }
}
        


    public static void main(String[] args) {
        Hesaplama1.Toplama ht = new Hesaplama1().new Toplama();
      /**  Hesaplama1.Cikartma hc =new Hesaplama1().new Cikartma();
        Hesaplama1.Bölme hb = new Hesaplama1().new Bölme();
        Hesaplama1.Carpma hca = new Hesaplama1().new Carpma();
        int sonuc1 = ht.toplamaYap(4, 5);
        int sonuc2 = hc.cikarmaYap(3, 3);
        int sonuc3 = hb.bölmeYap(8, 8);
        int sonuc4 = hca.carpmaYap(10, 1);
        System.out.println("Toplama" + sonuc1);
        System.out.println("Cikarma" + sonuc2);
        System.out.println("carpma"  + sonuc3);
        System.out.println("Bölme" + sonuc4);
        **/
        int sonuc1 = ht.toplamaYap(4, 5);
        System.out.println("Toplama" + sonuc1);
        
        // TODO code application logic here
    }
    
}
