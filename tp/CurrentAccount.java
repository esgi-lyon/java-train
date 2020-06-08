import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class CurrentAccount extends AbstractAccount {
    private static final String OVER_BARE_AMOUNT =
            "OVER_BARE_AMOUNT";
    private float bareAmount = (float) 0.00;

    public CurrentAccount (float bareAmount, boolean toOpen) {
        this.bareAmount = bareAmount;

        if (toOpen) {
            this.open();
        } else {
            this.close();
        }
    }

    @Override
    public float getBalance() {
        return unpack(this.getBalance());
    }

    @Override
    public float deposit(final float deposit) {
        return unpack(this.deposit(deposit));
    }

    @Override
    public float withdraw(final float withdrawal) {
        return unpack(this.withdraw(withdrawal));
    }

    /**
     * Decorator to verify user can operate in his account
     *
     * @param result
     * @return
     * @throws BankAccountActionInvalidException
     */
    private float unpack(final float result){

        if (this.bareAmount < result) {
            this.error(OVER_BARE_AMOUNT);
        }

        return result;
    }
}