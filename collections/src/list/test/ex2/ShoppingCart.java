package list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : itemList) {
            System.out.println("상품명:" + item.getName() + ", 합계: " + item.getTotalPrice());
        }

        System.out.println("전체 가격 합:" + caculateSum());
    }

    private int caculateSum() {
        int sum = 0;
        for (Item item : itemList) {
            sum += item.getTotalPrice();
        }
        return sum;
    }
}
