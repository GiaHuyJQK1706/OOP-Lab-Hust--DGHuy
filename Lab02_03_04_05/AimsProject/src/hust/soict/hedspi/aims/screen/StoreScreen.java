//Do Gia Huy
//20215060
//Class "StoreScreen"
package hust.soict.hedspi.aims.screen;
import javax.swing.*;
import javafx.scene.control.Tab;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StoreScreen extends JFrame {
    private Store store;
    private Container cp;
    private Cart cart;
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north,BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");
        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));

        JMenuItem addCD = new JMenuItem("Add CD");
        smUpdateStore.add(addCD);
        addCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddCDStoreScreen popUp = new AddCDStoreScreen(store);
            }
        });

        JMenuItem addDVD = new JMenuItem("Add DVD");
        smUpdateStore.add(addDVD);
        addDVD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddDVDStoreScreen popUp = new AddDVDStoreScreen(store);
            }
        });
        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header,BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(),Font.PLAIN,50));
        title.setForeground(Color.CYAN);

        JButton cart1 = new JButton("View cart");
        cart1.setPreferredSize(new Dimension(100,50));
        cart1.setMaximumSize(new Dimension(100,50));
        cart1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Container cp = getContentPane();
                cp.add(new CartScreen(cart));
            }
        });
        header.add(Box.createRigidArea(new Dimension(10,10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart1);
        header.add(Box.createRigidArea(new Dimension(10,10)));
        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));
        LinkedList<Media> mediaStore = store.getItemsInStore();
        for(Media media : mediaStore) {
            MediaStore cell = new MediaStore(media,cart);
            center.add(cell);
        }
        return center;
    }

    public StoreScreen(Store store, Cart myCart) {
        this.store  = store;
        this.cart = myCart;
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(),BorderLayout.NORTH);
        cp.add(createCenter(),BorderLayout.CENTER);
        setVisible(true);
        setTitle("Store");
        setSize(1024,768);
    }

    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc(1,"Cinderella","Fantasy",
                13.5f,"Gia Huy",97);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(6,"Han Duty F009","Phim cam dong",
                23.5f,"Qianchang, Kelan",117);

        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Happy new year",3));
        tracks.add(new Track("i want it that way",4));
        CompactDisc cd = new CompactDisc(2,"Nhac 90's","Nhac nuoc ngoai",20.5f,"Various artist",tracks);

        ArrayList<Track> tracks2 = new ArrayList<Track>();
        tracks2.add(new Track("Tobu - Candyland",3));
        tracks2.add(new Track("Niviro - You",4));
        tracks2.add(new Track("MBB - Beach",2));
        tracks2.add(new Track("MBB - Island",4));
        tracks2.add(new Track("MBB - Feel Good",3));
        tracks2.add(new Track("Alan Walker - Force",4));
        tracks2.add(new Track("Syn Cole - Feel Good (Best of 2016 EDM)",4));
        tracks2.add(new Track("Syn Cole - Gizmo",4));
        tracks2.add(new Track("Deamn - Sign",4));
        tracks2.add(new Track("MBB - Arrival",3));
        tracks2.add(new Track("EnV - Pneumatic",5));
        CompactDisc cd2 = new CompactDisc(5,"Nhac EDM gay nghien","Nhac quoc te",37.25f,"Various artist",tracks2);

        List<String> authors = new ArrayList<String>();
        authors.add("Agatha cristine");
        Book book1   = new Book(3,"Ten little niggers","detective",25.2f,authors);
        List<String> authors2 = new ArrayList<String>();
        authors2.add("Phung Quan");
        Book book2   = new Book(4,"Tuoi tho du doi","novel",27.45f,authors2);
        Store store = new Store();

        store.addMedia(cd);
        store.addMedia(cd2);
        store.addMedia(dvd);
        store.addMedia(dvd2);
        store.addMedia(book1);
        store.addMedia(book2);

        Book[] books = new Book[15];
        Cart myCart = new Cart();
        new StoreScreen(store,myCart);
    }

    private class AddDVDStoreScreen extends JFrame {
        public AddDVDStoreScreen(Store store) {
            this.setLayout(new GridLayout(4, 2, 5, 5));
            this.add(new JLabel("Enter title: "));
            TextField title = new TextField(10);
            this.add(title);
            this.add(new JLabel("Enter category: "));
            TextField category = new TextField(10);
            this.add(category);
            this.add(new JLabel("Enter cost: "));
            TextField cost = new TextField(10);
            this.add(cost);

            this.setTitle("Add DVD");
            this.setSize(300, 100);
            JButton turnInBtn = new JButton("Add");
            this.add(turnInBtn);
            turnInBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DigitalVideoDisc dvd = new DigitalVideoDisc(2, title.getText(), category.getText(), Float.parseFloat(cost.getText()));
                    store.addMedia(dvd);
                    cp.add(createCenter(), BorderLayout.CENTER);
                    cp.revalidate();
                    title.setText("");
                    category.setText("");
                    cost.setText("");
                }
            });
            this.show();
        }
    }

    private class AddCDStoreScreen extends JFrame {
        public AddCDStoreScreen(Store store) {
            this.setLayout(new GridLayout(7, 2, 5, 5));
            this.add(new JLabel("Enter title: "));
            TextField title = new TextField(10);
            this.add(title);
            this.add(new JLabel("Enter category: "));
            TextField category = new TextField(10);
            this.add(category);
            this.add(new JLabel("Enter cost: "));
            TextField cost = new TextField(10);
            this.add(cost);
            this.add(new JLabel("Enter artist: "));
            TextField artist = new TextField(10);
            this.add(artist);
            this.setTitle("Add CD");
            this.add(new JLabel("Number of tracks: "));
            TextField numberOfTracks = new TextField(10);
            this.add(numberOfTracks);
            this.pack();
            JButton turnInBtn = new JButton("Add");
            this.add(turnInBtn);
            turnInBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    CompactDisc dvd = new CompactDisc(2, title.getText(), category.getText(), Float.parseFloat(cost.getText()),artist.getText(),new ArrayList<Track>());
                    store.addMedia(dvd);
                    cp.add(createCenter(), BorderLayout.CENTER);
                    cp.revalidate();
                    title.setText("");
                    category.setText("");
                    cost.setText("");
                }
            });
            this.show();
        }
    }
}