package td1.exo2;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Chaise", 12.4, 20);
        Product p1Clone = new Product(1, "toto", 111.4, 0);
        Product p2 = new Product(2, "Tabouret", 3.4, 1);
        Product p3 = new Product(3, "Canapé", 32.89, 0);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p1.equals(p1Clone));

        try {
            p2.sell(2);
            p1.sell(15);
        } catch (OutOfStockException outOfStockException) {
            System.out.println(outOfStockException.getMessage());
        }

        System.out.println("Product 2 stock : " + p2.getStock());
        System.out.println("Product 1 stock : " + p1.getStock());
    }
}
