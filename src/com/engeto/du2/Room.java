package com.engeto.du2;


public class Room {
    private int roomKey;
    private int numberBeds;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private int price;

    public int getRoomKey() {
        return roomKey;
    }

    public void setRoomKey(int roomKey) {
        this.roomKey = roomKey;
    }

    public int getNumberBeds() {
        return numberBeds;
    }

    public void setNumberBeds(int numberBeds) {
        this.numberBeds = numberBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Room(int roomKey, int numberBeds, boolean hasBalcony, boolean hasSeaView, int price) {
        this.roomKey = roomKey;
        this.numberBeds = numberBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.price = price;
    }


    public String getDescription() {
        String sea;
        String balcony;
        if (isHasSeaView()) {
            sea = "\n Ma vyhled na more: Ano";
        }
        else {
            sea = "\n Ma vyhled na more: Ne";
        }
        if (isHasBalcony()) {
            balcony = "\n Ma balkon: Ano";
        }
        else {
            balcony = "\n Ma balkon: Ne";
        }

        String description = "Pokoj cislo: "+String.valueOf(getRoomKey())+
                "\n Pocet posteli: "+String.valueOf(getNumberBeds())+
                "\n Cena za noc: " +String.valueOf(getPrice())
                +sea
                +balcony;


        return description;
    }
}
