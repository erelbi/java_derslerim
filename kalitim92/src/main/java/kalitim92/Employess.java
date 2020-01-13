/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalitim92;

/**
 *
 * @author xc
 */
public class Employess {
    private String name;
    private String department;
    private int salary;
    
    /**
     *
     * @param name
     * @param department
     * @param salary
     */
    public Employess(String name, String department,int salary){

        this.name= name;
        this.department= department;
        this.salary= salary;
    }

    Employess() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void showInfo(){
        System.out.println("Bilgiler....");
        System.out.println("İsim:" + this.name);
        System.out.println("Departman:" + this.department);
        System.out.println("maaş:" + this.salary);
    }
}
