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
public class PraktikumCarRent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarData data = new CarData();
        
        data.addCar("SUV", "G 12121 C", "Honda");
        data.addCar("TRUCK", "B 798787 A", "SUZUKI");
        data.addCar("SERENA", "K 98989 XA", "NISSAN");
        data.addCar("Elite Sedan", "L 33535 AB", "Mazda");

        data.listOfCar();
        
        CarRider rider1 = new CarRider("Tanjiro Kamado",30, "080284384939");
        CarRider rider2 = new CarRider("Mitsuha Miyamizu", 19, "083879283092");
        CarRider rider3 = new CarRider("Gojo Satoru", 20, "081232879372");
        CarRider rider4 = new CarRider("Yuta Okkotsu", 28, "08863829832");
        
        RentArchive rentArc = new RentArchive();
        
        rentArc.Rent(rider1, data.carList.get(2), 10);
        rentArc.Rent(rider2,data.carList.get(2),11);
        rentArc.Rent(rider3, data.carList.get(3), 3);
        rentArc.Rent(rider4, data.carList.get(3), 7);

        System.out.println();
        rentArc.status();
    }
    
}
