package pl.radekcholuj.shoppingcart1;

public class App {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.add(new Product("Mleko", 2.25), 12);
        shop.add(new Product("Masło", 5.15), 2);
        shop.add(new Product("Ciasto", 5.15), 22);
        shop.add(new Product("Lody", 5.15), 12);

        System.out.println("To pay: "+shop.calculate());
    }
}
