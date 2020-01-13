package araba;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

class Araba {

    private String renk;
    private int beygirGucu;
    private int hiz;
    
    public Araba(String renk, int guc, int hiz){
       this.renk = renk;
       this.beygirGucu = guc;
       this.hiz = hiz;
    }
    public int getHiz(){
        return this.hiz;
    }
    public void setRenk(String renk){
        this.renk = renk;
    }
            
    public void setBeygitgucu(int guc){
        this.beygirGucu =guc;
    }
    
    
    @Override
    public String toString()
    {
        String ozellikler =  null;
        ozellikler += "Renk = " + this.renk + "\n";
        ozellikler +="beygir gucu=" + this.beygirGucu + "\n";
        ozellikler +="hiz" + this.hiz + "\n";
        return (ozellikler);
    }
}

public class Main{
    
    public static void main(String[] args) {
    PrintWriter ciktiAkimi = null;
    String dosya;
        dosya = "ornekdosyaAraba.txt";
    try{
        ciktiAkimi = new PrintWriter (new FileOutputStream(dosya));
       
    }
    catch (FileNotFoundException hata){
        System.out.println("ornek araba dosyaı");
        System.out.println("olusturken hata olustu");
        System.exit(0);
    }
    Araba ferrari = new Araba("kirmizi", 4500, 3000);
    Araba fiat = new Araba("punto", 444, 333);
    Araba opel =  new Araba("mavi",555,655);
    
    ciktiAkimi.println("Ferrari ozellıkleri");
    ciktiAkimi.println(ferrari.toString());
                        
    ciktiAkimi.println("Opel ozellıkleri");
    ciktiAkimi.println(opel.toString());
    ciktiAkimi.println();
        System.out.println("Araba ozellıklerı ornekaraba.txt");
        System.out.println("dosyasına yazıldı");
    }
}
