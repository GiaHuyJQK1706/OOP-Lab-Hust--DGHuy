//Do Gia Huy
//20215060
//Class "Track"
package hust.soict.hedspi.aims.media;
import java.util.Objects;
import hust.soict.hedspi.aims.exception.PlayerException;
public class Track {
    private String title;
    private int length;

    public int getLength() { return length; }

    public String getTitle() { return title; }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public void play() throws PlayerException {
        if(this.getLength() < 0) {
            throw new PlayerException("ERROR: DVD-length is non-positive!");
        } else {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        }
    }

    public boolean equals(Track tmp) {
        return (title == tmp.getTitle()) && (length == tmp.getLength());
    }
}
