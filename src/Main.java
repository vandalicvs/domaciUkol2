import com.engeto.du2.ArchiveBook;
import com.engeto.du2.Guest;
import com.engeto.du2.Room;
import com.engeto.du2.Booking;

public class Main {
    public static void main(String[] args) {

        System.out.println("********************");
        System.out.println("****SEZNAM HOSTU****");
        System.out.println("********************\n");
        Guest newGuest1;
        newGuest1= new Guest("Jan", "Dvoracek","1995-5-5");
        System.out.println(newGuest1.getDescription());

        Guest newGuest2;
        newGuest2= new Guest("Adela", "Malikova","1993-3-13");
        System.out.println(newGuest2.getDescription());

        System.out.println("\n");
        System.out.println("*******************");
        System.out.println("***SEZNAM POKOJU***");
        System.out.println("*******************\n");

        Room room1,room2,room3;
        room1 = new Room(1,1,true, true,1000);
        room2 = new Room(2,1,true, true,1000);
        room3 = new Room(3,3,false, true,2400);

        System.out.println(room1.getDescription());
        System.out.println("===================");
        System.out.println(room2.getDescription());
        System.out.println("===================");
        System.out.println(room3.getDescription());

        System.out.println("\n");
        System.out.println("*******************");
        System.out.println("*****REZERVACE*****");
        System.out.println("*******************\n");

        Booking booking1;
        booking1 = new Booking(room1,newGuest2, "2021-07-19", "2021-07-26");

        System.out.println(booking1.getGuest().getName() +" "+ booking1.getGuest().getSurname());
        System.out.println("Pokoj c."+booking1.getRoom().getRoomKey());
        System.out.println(booking1.getDate1()+ " - " +booking1.getDate2());
        System.out.println("===================");
        Booking booking2;
        booking2 = new Booking(room3,newGuest2, "2021-09-01", "2021-09-14", newGuest1,"Recreace");

        System.out.print(booking2.getGuest().getName() +" "+ booking2.getGuest().getSurname());
        booking2.getOtherGuests().forEach(guest -> System.out.println(" a "+guest.getName()+ " "+guest.getSurname()));
        System.out.println("Pokoj c."+booking2.getRoom().getRoomKey());
        System.out.println(booking2.getDate1()+ " - " +booking2.getDate2());

        System.out.println("===================");



        ArchiveBook arch1 = new ArchiveBook();
        arch1.addArchiveBook(booking1);
        arch1.addArchiveBook(booking2);

        ArchiveBook.printBookings();

        System.out.println("===================");
        System.out.println("=====test automatickych dat=====");

        Booking booking3;
        booking3 = new Booking(room1,newGuest1);

        System.out.print(booking3.getGuest().getName() +" "+ booking3.getGuest().getSurname());
        System.out.println("\nPokoj c."+booking3.getRoom().getRoomKey());
        System.out.println(booking3.getDate1()+ " - " +booking3.getDate2());

    }
}