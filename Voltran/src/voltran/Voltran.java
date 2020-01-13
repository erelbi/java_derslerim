/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voltran;

class Govde{
    void benzinTankiniKontrolEt() {}
}
class SolBacak{
    void maviLazerSilahiAtesle() {}
            
}
class SagBacak{
    void kirmiziLazerSilahiAtesle(){System.out.println("Kırmızı Silah ateşlendi");}
    
    
}
class SagKol{
        void hedehodoKalkaniCalistir(){
            System.out.println("hede hodo kalkani devrede");
            
        }
}
class SolKol{
    void guckaynagiKontrolEt(){
}
} 
class Kafa {
     void  tumBirimlereUyariGondor(){
         System.out.println("Tüm birimler devreye alındı");
         
     }
}

public class Voltran {
        Govde gv = new Govde();
        SolBacak slb = new SolBacak();
        SagBacak sgb = new SagBacak();
        SagKol sgk = new SagKol();
        SolKol slk = new SolKol();
        Kafa kf = new Kafa();


    public static void main(String[] args) {
        Voltran vr = new Voltran();
        vr.kf.tumBirimlereUyariGondor();
        vr.sgb.kirmiziLazerSilahiAtesle();
    }
       
    }
    

