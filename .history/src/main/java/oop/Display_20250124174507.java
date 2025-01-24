package oop;
import oop.model.Room;
import java.util.List;


public class Display {
    public void displayRooms(List<Room> rooms){
        System.out.println("room number" + "   " + "number of beds" + "   " + "price");

    for (Room room : availableRooms) {

      System.out.println(room.getNumber + "\t\t\t\t" + room.getNumberOfBeds + "\t\t\t\t" + room.getPrice);
    }

    }
}
