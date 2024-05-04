public class Main {
    public static void main(String[] args) {
        try {
            company.beans.Person person = new company.beans.Person("Jan Nowak", 30);
            System.out.println("Imie: " + person.getName() + ", Wiek: " + person.getAge());
        } catch (company.exceptions.InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        company.interfaces.Messenger messenger = new company.implementations.EmailMessenger();
        messenger.sendMessage("Dzień dobry!");
    }
}