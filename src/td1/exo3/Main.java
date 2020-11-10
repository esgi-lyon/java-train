package td1.exo3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
		d1.cry();

		ArrayList<Animal> listAnimals = new ArrayList<Animal>();

        listAnimals.add(d1);
        listAnimals.add(cat3);
        listAnimals.add(d3);
        listAnimals.add(cat2);
        listAnimals.add(d2);
        listAnimals.add(cat1);

        for (Animal var : listAnimals)
        {
            System.out.println(var.cry());
        }
    }
}
