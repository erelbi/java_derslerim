package javaapplication6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) throws FileNotFoundException {
          
        String dosya = "ornek.txt";
        PrintWriter ciktiAkimi = null;
        try{
           ciktiAkimi = new PrintWriter(new FileOutputStream(dosya));
        }
        catch (FileNotFoundException hata){
            System.out.println("ornek.txt dosyası oluşturulurke hata oldu");
            System.exit(0);
        }
        
        System.out.print("Bir cümle giriniz : ");
        Scanner klavye = new Scanner(System.in);
        
        String cumle = klavye.nextLine();
        ciktiAkimi.println("klavyeden girdiğiniz cümle = "+cumle);
        ciktiAkimi.println("Dosyayı kapatabilirsiniz");
        ciktiAkimi.close(); 
    }
    
}
