/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalıtım;

    


public class Motor{
    private static final  int motor_gucu = 60;
    
  public void calis() {
      System.out.println("motor calisiyor");
      
  }
    
  public void dur(){
      System.out.println("Motor Durdu");
  }
}
    public class AileArabasi {
    private final Motor m = new Motor ();
    public void hareketEt(){
        m.calis();
        System.out.println("aile arabasi calist");
        
    }
 public void dur(){
     m.dur();
     System.out.println("aile arabasi durdu");
     
 }
 
 public static void main (String args []) {
     AileArabasi aa = new AileArabasi();
     aa.hareketEt();
     aa.dur();
 }
}