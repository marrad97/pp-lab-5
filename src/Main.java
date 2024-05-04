import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Jan Nowak", 30);
            System.out.println("Imie, nazwisko: " + person.getName() + ", Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        int sum = MathUtils.add(10, 20);
        System.out.println("10+20=" + sum);
        Messenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Wynik dodawania to: "+sum);

        Person[] people = new Person[5];
        final int b = 10;

        try {people[0] = new Person("John Doe", 30);
            people[1] = new Person("Maria Kowalska", 25);
            people[2] = new Person("Anita Nowak", 40);
            people[3] = new Person("Mariusz Kowalski", 22);
            people[4] = new Person("Jan Nowak", 35);

            Messenger messenger = new EmailMessenger();

            for (int i = 0; i < people.length; i++) {
                int newAge = MathUtils.add(people[i].getAge(), b);
                messenger.sendMessage("Wiek dla " + people[i].getName() + " to: " + newAge);
            }
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}