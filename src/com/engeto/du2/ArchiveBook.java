package com.engeto.du2;

import java.util.ArrayList;
import java.util.List;

public class ArchiveBook {

    private static List<Booking> archive=(new ArrayList<>());

    public static List<Booking> getArchive() {
        return archive;
    }

    public void addArchiveBook(Booking booking) {
        getArchive().add(booking);
    }


    public static void printBookings() {
        for (Booking booking : archive) {
            System.out.println("Room: " + booking.getRoom().getRoomKey()
                    + "\nJmeno rezervace: " + booking.getGuest().getName()+ " " + booking.getGuest().getSurname()+ "\nOd:" + booking.getDate1()+ " do " + booking.getDate2()+ "\n" + booking.getVacationType());
            booking.getOtherGuests().forEach(guest -> {
                if (guest != null) {
                    System.out.println("Dalsi host: " + guest.getName() + " " + guest.getSurname());
                }
            });
            System.out.println();
            // booking.getOtherGuests().forEach(guest -> System.out.println(" a "+guest.getName()+ " "+guest.getSurname()));
        }
    }
}
