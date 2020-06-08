class Transaction {
    protected AbstractAccount src;
    protected AbstractAccount dest;

    private float amount;

    private char type;
    /* MAP_TYPES :
        W = "withdraw",
        D = "deposit",
    } */

    public Transaction(
        AbstractAccount src,
        char type,
        float amount
    ) {
        this.amount = amount;
        this.src = src;
    }

    public final void execute(){
        if (type == 'W') {
            this.src.withdraw(amount);
            if (dest instanceof AbstractAccount) {
                this.dest.deposit(amount);
            }
        } else if (type == 'D'){
            this.src.deposit(amount);
        }
    }

    public void setDest(AbstractAccount dest) {
        this.dest = dest;
    }

    public void setSrc(AbstractAccount src) {
        this.src = src;
    }
}