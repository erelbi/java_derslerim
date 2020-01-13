
package kalıtım.pkg1;


/*
Yeni Türeyen sınıf, türetilen sınıfın global alanlarına ve yordamlarına 
(static veya değil) otomatik sahip olur.
private olanlar hariç
Anahtar sözcüğü extends
*/

class Kedi{
    protected int ayaksayisi = 4;
    public void yakalaAv(){
        System.out.println("kedi sınıfı av yakaldi");
    }

}

/**
 *
 * @author xc
 */
public class Kaplan extends Kedi{
    public static void main(String args[]){
        Kaplan kp = new Kaplan();
        kp.yakalaAv();
        System.out.println("Ayak sayısı = " + kp.ayaksayisi);
    }
}

