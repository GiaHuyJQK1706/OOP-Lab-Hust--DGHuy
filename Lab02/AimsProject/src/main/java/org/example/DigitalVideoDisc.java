//Do Gia Huy
//20215060
//Class "DigitalVideoDisc" source code
package org.example;
public class DigitalVideoDisc {
    //Khai báo thuộc tính
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    //Phương thức khởi dựng các thông tin của đĩa DVD
    //Các phương thức khởi dựng trên nạp chồng

    //Constructor by title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }
    //Constructor by category, title and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    //Constructor by title, category , director, cost
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    // Constructor by all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
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
}
