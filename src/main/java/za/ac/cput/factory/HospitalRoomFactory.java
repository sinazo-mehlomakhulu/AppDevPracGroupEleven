package za.ac.cput.factory;
/*
    HospitalRoomFactory.java
    Factory Entity for the Hospital Rooms
    Author: Fayaad Abrahams (218221630)
    Date: 27 March 2022
*/
import za.ac.cput.entities.HospitalRoom;

public class HospitalRoomFactory {

    public static HospitalRoom createHospitalRoom(String roomID, Integer roomFloor) {
        if (roomFloor == null) {
            return null;
        }
        return new HospitalRoom.Builder().setRoomID(roomID)
                .setRoomFloor(roomFloor)
                .build();
    }
}