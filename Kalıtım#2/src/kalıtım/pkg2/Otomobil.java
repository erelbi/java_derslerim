/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalıtım.pkg2;

public class Tasit
{
    private String isim;
    public Tasit()
    {
        isim="";
    }
    public Tasit(String ilkIsim)
    {
        isim = ilkIsim;
    }
    public void setIsim(String  yeniIsim)
    {
        isim = yeniIsim;
    }
    public String getIsim(){
        return isim;
    }
    public void ciktiYaz()
    {
        System.out.println("Isim :" + isim);
    }
    public boolean ayniIsim(Tasit digerTasit)
    {
        return (this.isim.equalsIgnoreCase(digerTasit.isim));
    }
}
