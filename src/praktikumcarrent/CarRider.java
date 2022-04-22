/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumcarrent;

/**
 *
 * @author tuffa
 */
public class CarRider {
    
    private String name ;
    private int age ;
    private String phone ;

    CarRider(String name, int age, String phone){
        this.name = name ;
        this.age = age ;
        this.phone = phone ;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
}
