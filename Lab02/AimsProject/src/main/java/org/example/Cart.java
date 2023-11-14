//Do Gia Huy
//20215060
//Class "Cart" source code
package org.example;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;   //Số lượng tối đa đĩa DVD trong giỏ hàng

    //Mảng lưu các đĩa DVD được thêm vào giỏ hàng
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;     //Số lượng đĩa DVD hiện có trong giỏ hàng

    //Hàm thêm đĩa DVD vào giỏ hàng
    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more díc");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The DVD " + '\"' +disc.getTitle() + '\"' + " have been added!");
            return 1;
        }
    }

    public int addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int addedCount = 0;
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full. Can't add more disc");
                break;
            } else {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The DVD " + '\"' + disc.getTitle() + '\"' + " has been added!");
                addedCount++;
            }
        }
        return addedCount;
    }


    //Hàm xoá đĩa (Khi cấu trúc dữ liệu của đĩa DVD là 1 mảng cấu trúc)
    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(itemsOrdered[0] ==  null) {
            System.out.println("Your cart is empty!");
            return 0;
        }
        for(int i =0; i < qtyOrdered;i++) {
            if(itemsOrdered[i].equals(disc)) {
                for(int j = i;i<qtyOrdered-1;i++) {
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                System.out.println("Remove DVD " + '\"'+ disc.getTitle() + '\"' + " successfully!");
                return 1;
            }
        }
        System.out.println("No DVD match!");
        return 0;
    }

    //Hàm tính tổng giá tiền đĩa
    public float totalCost() {
        float sum = 0.00f;
        for(int i =0;i< qtyOrdered;i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}
