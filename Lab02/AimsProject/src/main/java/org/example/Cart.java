//Do Gia Huy
//20215060
//Class "Cart" source code

package org.example;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more díc");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
            System.out.println("The disc have been added");
            return 1;
        }
    }

    //Hàm xoá đĩa (Khi cấu trúc dữ liệu của đĩa DVD là 1 mảng cấu trúc)
    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for(int i =0; i < qtyOrdered;i++) {
            if(itemsOrdered[i].equals(disc)) {
                for(int j = i;i<qtyOrdered-1;i++) {
                    itemsOrdered[i] = itemsOrdered[i+1];
                }
                itemsOrdered[qtyOrdered-1] = null;
                qtyOrdered--;
                return 1;
            }
        }
        return 0;
    }

    //Hàm tính tổng giá tiền đĩa

    public float totalCost() {
        float sum = 0f;
        for(int i =0;i< qtyOrdered;i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
}
