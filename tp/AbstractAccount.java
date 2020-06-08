
public abstract class AbstractAccount {
    private static final String WITHDRAWAL_FROM_EMPTY_ACCOUNT =
            "Cannot withdraw money from an empty account";
    private static final String WITHDRAWAL_TOO_BIG =
            "Cannot withdraw more money than is currently in the account";
    private static final String NEGATIVE_AMOUNT =
            "Cannot deposit or withdraw negative amount";
    private static final String ACCOUNT_CLOSED =
            "Account closed";

    private float[] history;
    private float balance = 0.0f;
    private boolean closed = true;

    public void open() {
        closed = false;
    }

    public void close() {
        closed = true;
    }

    public AbstractAccount(float[] history, float balance, boolean closed) {
        this.history = history;
        this.balance = balance;
        this.closed = closed;
    }

    public float getBalance() {
        return closed ? error(ACCOUNT_CLOSED)
                : balance;
    }

    public float deposit(final float deposit) {
        return deposit < 0 ? error(NEGATIVE_AMOUNT)
                : updateBalance(deposit);
    }

    public float withdraw(final float withdrawal) {
        if (withdrawal < 0) {
            return error(NEGATIVE_AMOUNT);
        } else {
            return updateBalance(-withdrawal);
        }
    }

    private float updateBalance(final float amount) {
        this.history = push(this.history, amount);
        try {
            if (closed) {
                error(ACCOUNT_CLOSED);
            } else {
                final float oldBalance = balance;
                final float newBalance = oldBalance + amount;

                if (newBalance < 0) {
                    throw new RuntimeException(
                            oldBalance == 0
                                    ? WITHDRAWAL_FROM_EMPTY_ACCOUNT
                                    : WITHDRAWAL_TOO_BIG
                    );
                }

                return newBalance;
            }
        } catch (final RuntimeException ex) {
            return balance;
        }
        return balance;
    }

    public void getHistory() {
        System.out.println("Amount history");
        for (int i = 0; i <= history.length; i++) {
            System.out.println(history[i]);
        }
    }

    public float error(String message)  {
        System.out.println(message);
        return balance;
    }

    public static float[] push(float[] array, float push) {
        float[] longer = new float[array.length + 1];
        System.arraycopy(array, 0, longer, 0, array.length);
        longer[array.length] = push;
        return longer;
    }
}
