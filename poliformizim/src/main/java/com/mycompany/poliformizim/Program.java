/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poliformizim;

/**
 *
 * package com.mycompany.poliformizim;
 * @author xc
 */
class AnaSinif {
    public void Yaz()
    {
    System.out.println("Ana Sınıf");
        }
}
    class Tureyen1 extends AnaSinif{
    
        public void Yaz(){
            System.out.println("Tureyen1");
        }
}
class Tureyen2 extends AnaSinif
{

public void Yaz()
{
System.out.println("Tureyen2");
        }
}
class Tureyen3 extends AnaSinif
{

public void Yaz()
{
System.out.println("Tureyen3");
        }
}

public class Program
{
    public static void Yaz(AnaSinif t)
{
     t.Yaz();
}
    
    public static void main(String[] args)
{
    Tureyen1 t1= new Tureyen1();
    Tureyen2 t2= new Tureyen2();
    Tureyen3 t3= new Tureyen3();
    Yaz(t1);
    Yaz(t2);
    Yaz(t3);
}
}