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
public class Car {
    private String carType ;
    private String polNum ;
    private String merk ;
    private boolean status ;

    Car(String carType, String polNum, String merk, boolean status){
        this.carType = carType ;
        this.polNum = polNum ;
        this.merk = merk ;
        this.status = status ;
    }

    public String getCarType() {
        return carType;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public boolean status() {
        return status;
    }

    public void status2(String status) {
        this.status = Boolean.parseBoolean(status);
    }
}


