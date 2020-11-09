package exo1;

public abstract class Person implements SecureFields {
    protected int id, socialNum;
    public String name, lastname;

    public Person(int id, int socialNum, String name, String lastname) {
        this.id = id;
        this.socialNum = socialNum;
        this.name = name;
        this.lastname = lastname;
    }

    public abstract String toString();
}
