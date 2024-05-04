import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Jan Nowak", 30);
            System.out.println("Imie: " + person.getName() + ", Wiek: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        int sum = MathUtils.add(10, 20);
        System.out.println("10+20=" + sum);
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Wynik dodawania to: "+sum);
    }
}