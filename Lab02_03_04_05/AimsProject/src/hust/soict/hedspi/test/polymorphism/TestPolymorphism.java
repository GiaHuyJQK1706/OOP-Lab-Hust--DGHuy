//Do Gia Huy
//20215060
//Class "TestPolymorphism"
package hust.soict.hedspi.test.polymorphism;
import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;
import java.util.List;
public class TestPolymorphism {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();
        DigitalVideoDisc dvd = new DigitalVideoDisc(1,"Cinderella", "fantasy",4.5f,"BPL",90);

        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Happy new year",3));
        tracks.add(new Track("I want it that way",4));
        CompactDisc cd = new CompactDisc(2,"Nhac bat hu ngay xua", "Nhac nuoc ngoai" , 3.5f,"various artist",tracks);

        List<String> authors = new ArrayList<String>();
        authors.add("Phung Quan");
        authors.add("Gia Huy");
        Book book = new Book(3,"Tuoi tho du doi","novel",5.2f,authors);

        mediae.add(dvd);
        mediae.add(cd);
        mediae.add(book);

        for(Media item : mediae) {
            System.out.println(item);
        }
    }
}
