//Do Gia Huy
//20215060
//Class "DigitalVideoDisc" source code
package hust.soict.hedspi.aims.media;
import hust.soict.hedspi.aims.media.Media;
public class DigitalVideoDisc extends Disc implements Playable {

    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(int id, String title, String category, float cost, String director, float length) {
        super(id, title, category, cost, director, length);
        nbDigitalVideoDiscs++;
    }

    public  DigitalVideoDisc(int id, String title, String category, float cost) {
        super(id,title,category,cost);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}

