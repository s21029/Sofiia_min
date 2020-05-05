package com.university;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private List<Room> rooms = new ArrayList<>();
    private static int roomsCount = 0;

    private House(String address) {
        this.address = address;
    }

    public House createHouse(String address) {
        return new House(address);
    }
    public void addRoom(Room room) {
        rooms.add(room);
        roomsCount = rooms.size();
    }

    public void addRooms(List<Room> rooms) {
        this.rooms.addAll(rooms);
        roomsCount = rooms.size();
    }

    public int getRoomCount() {
        return rooms.size();
    }
}
