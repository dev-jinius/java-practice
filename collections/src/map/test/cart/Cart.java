package map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        cartMap.put(product, cartMap.getOrDefault(product, 0)+quantity);
    }

    public void minus(Product product, int quantity) {
        if (!cartMap.containsKey(product)) return;
        if (cartMap.get(product)-quantity > 0) {
            cartMap.put(product, cartMap.get(product)-quantity);
            return;
        }
        cartMap.remove(product);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
    }
}
