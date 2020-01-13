package kalitim;

 class Motor{
    private static  int motor_gucu = 3600;

    public void calis(){
    System.out.println("Motor Calisiyor");

}
    public void dur(){
        System.out.println("Motor Durdu");
    }
}

public class AileArabasi{
    private final  Motor m = new Motor();
    
    public void hareketEt(){
        m.calis();
        System.out.println("Aile Arabasi çalıştı");
    }
    public void dur(){
        m.dur();
    System.out.println("Aile arabası durdu");
    }
     public static void  main(String[] args){
    AileArabasi aa = new AileArabasi();
    aa.hareketEt();
    aa.dur();
}
}