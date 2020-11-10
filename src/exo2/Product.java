package exo2;

public class Product implements Id{
    private long id;
    private String label;
    private double priceExcludingTax;
    private int stock;
    private final float tax = (float) 0.20;

    public Product(long id, String intitule, double priceExcludingTax, int stock) {
        this.id = id;
        this.label = intitule;
        this.priceExcludingTax = priceExcludingTax;
        this.stock = stock;
    }

    public void provision(int quantity) {
        this.stock++;
    }

    public double getPriceIncludingTax() {
        return this.priceExcludingTax * (1 + this.tax);
    }

    public void sell(int quantity) throws OutOfStockException {
        if (this.stock < quantity)
                throw new OutOfStockException(this);
        this.stock--;
    }

    public boolean equals(Product otherProduct) {
        return this.id == otherProduct.id;
    }

    public long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", intitule='" + label + '\'' +
                ", priceExcludingTax=" + priceExcludingTax +
                ", stock=" + stock +
                '}';
    }
}
