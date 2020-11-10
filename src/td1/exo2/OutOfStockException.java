package td1.exo2;

public class OutOfStockException extends Exception {
    public OutOfStockException(Id entity) {
        super(entity.getClass().getSimpleName() + " " + entity.getId() + " is out of stock");
    }
}
