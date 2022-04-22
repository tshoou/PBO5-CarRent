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
public class CarRent {
    private CarRider rider ;
    private Car car ;
    private int rentDur ;
    
    CarRent(CarRider rider, Car car, int rentDur){
        this.rider = rider ;
        this.car = car ;
        this.rentDur = rentDur ;
    }
    public Car getCar() {
        return car;
    }
    public CarRider getRider() {
        return rider;
    }
    public int getRentDur() {
        return rentDur;
    }
}
