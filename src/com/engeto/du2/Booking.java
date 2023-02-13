package com.engeto.du2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private String date1;
    private String date2;
    private List<Guest> otherGuests;
    private String vacationType;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    public String getVacationType() {
        return vacationType;
    }

    public void setVacationType(String vacationType) {
        this.vacationType = vacationType;
    }

    public Booking(Room room, Guest guest, String date1, String date2, Guest otherGuests, String vacationType) {
        this.room = room;
        this.guest = guest;
        this.date1 = date1;
        this.date2 = date2;
        this.otherGuests = new ArrayList<>();
        this.otherGuests.add(otherGuests);
        this.vacationType = vacationType;
    }

    public Booking(Room room, Guest guest, String date1, String date2){
        this(room, guest, date1, date2, null, "rekreace");
    }

    public Booking(Room room, Guest guest){
        this(room, guest, null, "rekreace");
        LocalDate autDate1 = LocalDate.now();
        LocalDate autDate2 = autDate1.plusDays(6);
        this.date1 = String.valueOf(autDate1);
        this.date2 = String.valueOf(autDate2);


    }
}
