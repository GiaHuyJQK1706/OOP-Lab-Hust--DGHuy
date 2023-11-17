//Do Gia Huy
//20215060
//Class "DigitalVideoDisc" source code
package hust.soict.hedspi.aims.disc;
public class DigitalVideoDisc {
    //Khai báo thuộc tính
    private static int nbDigitalVideoDiscs = 0; // Class attribute can khai bao
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id; // Instance attribute ID

    //Phương thức khởi dựng các thông tin của đĩa DVD
    //Các phương thức khởi dựng trên nạp chồng
    //Constructor by title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    }
    //Constructor by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    }
    //Constructor by title, category , director, cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    }
    // Constructor by all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Update class variable and assign id
    }

    //Các phương thức lấy dữ liệu của đĩa DVD

    //Getter for title
    public String getTitle() { return title; }
    //Getter for category
    public String getCategory() { return category; }
    //Getter for director
    public String getDirector() { return director; }
    //Getter for length
    public int getLength() { return length; }
    //Getter for cost
    public float getCost() { return cost; }
    public int getId() { return id; } // Ham lay id

    //Cac phuong thuc chinh sua thuoc tinh cua du lieu
    //Setting for title
    public void setTitle(String titleSet){ title = titleSet; }
    public void setCategory(String categorySet){ category = categorySet; }
    public void setDirector(String directorSet){ director = directorSet; }
    public void setLength(int lengthSet){ length = lengthSet; }
    public void setCost(float costSet){ cost = costSet; }
}
