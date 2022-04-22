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
import java.util.ArrayList;
public class RentArchive {
    ArrayList<CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){

        CarRent newCarRent = new CarRent(rider,car,rentDur);
        rentData.add(newCarRent);

        if(car.status()){
            System.out.println("MOBIL BERHASIL DISEWA");
            car.status2("false");
        }
        else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
            car.status2("true");
        }


    }

    public void status(){

        System.out.println("===========================================");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("===========================================");

        for(CarRent rent : rentData){

            System.out.println("NAMA PEMINJAM   : " + rent.getRider().getName());
            System.out.println("TIPE MOBIL      : " + rent.getCar().getCarType());
            System.out.println("NO POLISI       : " + rent.getCar().getPolNum());
            System.out.println("LAMA RENTAL     : " + rent.getRentDur());
            System.out.println("=============================================");

        }
    }
}
