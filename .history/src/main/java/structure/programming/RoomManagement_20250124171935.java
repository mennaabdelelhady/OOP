package structure.programming;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class RoomManagement {

  DataStore dataStore;

  RoomManagement(DataStore dataStore) {

    this.dataStore = dataStore;
  }

  void addRoom(int roomNumber, int numberOfBeds, double price) {

    Room newRoom = new Room();

    newRoom.setNumber(roomNumber);
    newRoom.setNumberOfBeds(numberOfBeds);
    newRoom.setPrice(price);

    dataStore.rooms.add(newRoom);
  }

  void removeRoom(int roomNumber) {

    for(Room room : dataStore.rooms) {

      if(room.getNumber == roomNumber) {

        dataStore.rooms.remove(room);
      }
    }
  }

  void getAvailableRooms() {
    List<Room> availableRooms = new ArrayList<>();
    for(Room room : dataStore.rooms) {

      if(!room.isReserved) {

        availableRooms.add(room);
      }
    }

    System.out.println("room number" + "   " + "number of beds" + "   " + "price");

    for (Room room : availableRooms) {

      System.out.println(room.getNumber + "\t\t\t\t" + room.getNumberOfBeds + "\t\t\t\t" + room.getPrice);
    }
  }

  void reserveRoom(int roomNumber, int reservationDays, String customerName, String customerId) {

    Room selectedRoom = null;
    for(Room room : dataStore.rooms) {

      if(room.getNumber == roomNumber) {

        selectedRoom = room;
      }
    }

    selectedRoom.setReserved(true);
    selectedRoom.reservationStartDate = LocalDate.now();
    selectedRoom.reservationEndDate = LocalDate.now().plusDays(reservationDays);
    selectedRoom.customerId = customerId;
    selectedRoom.customerName = customerName;

  }

  void freeRoom(int roomNumber) {

    Room selectedRoom = null;
    for(Room room : dataStore.rooms) {

      if(room.number == roomNumber) {

        selectedRoom = room;
      }
    }

    selectedRoom.reservationEndDate = null;
    selectedRoom.reservationStartDate  = null;
    selectedRoom.customerName = null;
    selectedRoom.customerId = null;
    selectedRoom.isReserved = false;
  }

}
