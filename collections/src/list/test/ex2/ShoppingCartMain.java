package list.test.ex2;

//요구사항
    // ShoppingCart 클래스를 작성해서 Item들을 담아 장바구니 상품을 출력해라.
public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
