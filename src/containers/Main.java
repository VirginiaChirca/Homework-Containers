package containers;
import java.util.*;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Comparator<Person> byName = new PersonNameComparator();
        Comparator<Person> byAge = new PersonAgeComparator();

        Set<Person> pers = new TreeSet<>(byName);
        Set<Person> pers2 = new TreeSet<>(byAge);

        pers.add(new Person("Florina", 25));
        pers.add(new Person("Ana", 20));
        pers.add(new Person("Marcel", 25));
        pers.add(new Person("Maria", 21));
        pers.add(new Person("Horia", 19));

        pers2.add(new Person("Adina", 16));
        pers2.add(new Person("Cosmin", 80));
        pers2.add(new Person("Clara", 35));
        pers2.add(new Person("Olga", 40));
        pers2.add(new Person("Paul", 17));

        System.out.println("Sortat nume");
        for (Person value : pers)
            System.out.println(value.getName() + " " + value.getAge());


        System.out.println("\n Sortat varsta");
        for (Person value : pers2) {
            System.out.println(value.getName() + " " + value.getAge());
        }

        HashMap<Person, List<Hobby>> hobbies = new HashMap<Person, List<Hobby>>();
        
        Address adresa1 = new Address("Strada Matei Basarab", "Bucuresti", "Romania");
        Address adresa2 = new Address("Strada Panselutelor", "Iasi", "Romania");
        Address adresa3 = new Address("Strada Luminii", "Constanta", "Romania");
        Address adresa4 = new Address("Strada Nordului", "Paris", "Franta");

        List<Hobby> hobbies1 = new ArrayList<Hobby>();
        hobbies1.add(new Hobby("Reading", 4, adresa1, adresa2, adresa3));
        hobbies1.add(new Hobby("Motorcycling", 3, adresa2, adresa3, adresa4));

        Person persoana1 = new Person("Anghel", 20);
        hobbies.put(persoana1, hobbies1);

        List<Hobby> hobbies2 = new ArrayList<Hobby>();
        hobbies2.add(new Hobby("Swimming", 2, adresa1, adresa4));
        hobbies2.add(new Hobby("Cycling", 2, adresa2, adresa3));

        Person persoana2 = new Person("Oana", 23);
        hobbies.put(persoana2, hobbies2);


        Person persoana = persoana1;
        System.out.println("Hobbies pentru " + persoana.getName() + ":");
        List<Hobby> personHobbies = hobbies.get(persoana);
        for (Hobby hobby : personHobbies) {
            System.out.println(hobby.getName() + " (" + hobby.getFrequency() + " ori pe saptamana)");
            hobby.printCountries();
        }
    }
}