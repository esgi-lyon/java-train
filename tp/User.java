public class User {
    private final String name;
    private CurrentAccount currentAccount;

    public CompanyAccount getCompanyAccount() {
        return companyAccount;
    }

    public void setCompanyAccount(CompanyAccount companyAccount) {
        this.companyAccount = companyAccount;
    }

    private CompanyAccount companyAccount;

    public User(String newName) {
        name = newName;
    }

    // G & S
    public String getName() {
        return this.name.toUpperCase();
    }

    public CurrentAccount getCurrentAccount() { return currentAccount; }

    public void setCurrentAccount(CurrentAccount currentAccount) { this.currentAccount = currentAccount; }

    // Magic methods
    public String toString() {
        return (String) name;
    }
}