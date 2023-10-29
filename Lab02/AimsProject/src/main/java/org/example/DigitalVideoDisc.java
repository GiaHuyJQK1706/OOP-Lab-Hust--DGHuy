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
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    //Các phương thức lấy dữ liệu của đĩa DVD
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public float getCost() {
        return cost;
    }
    public int getLength() {
        return length;
    }
}
