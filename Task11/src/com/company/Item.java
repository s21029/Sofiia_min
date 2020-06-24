package com.company;

public class Item {

    private String Name;
    private int ID;


    public Item(String name, int ID) {
        this.Name = name;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void show() {
        System.out.println(this.getName());
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


}
