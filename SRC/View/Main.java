package HotelManager.SRC.View;

import HotelManager.SRC.Model.*;
import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    // Creacion de el hotel

    Hotel hotel = new Hotel("Pokemon Hotel", "Carrera 29 # 122 - 144", 9, 1);

        System.out.println(hotel.getName());
        System.out.println(hotel.getAdress());
        System.out.println(hotel.getTotalfloor());
        System.out.println(hotel.getId());
    }
    
}
