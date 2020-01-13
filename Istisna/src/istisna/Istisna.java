package istisna;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Istisna implements Human{
    
    static void fun(){
        
        double sayi;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz");
        try{
            sayi = sc.nextDouble();
            System.out.println(sayi);    
        } catch (InputMismatchException hata){
            System.out.println("Integer değer girmelisin...");
            throw hata;
        } 
        
    }

    public static void main(String[] args) {
        
        try{
            fun();
        } catch(InputMismatchException e){
            System.out.println("Caugth in main..");
        } finally{
            System.out.println("Finally");
        }
        

    }
    
}

interface Human{
    String ad = "Emre";
}
