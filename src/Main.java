public class Main {
    public static void main(String[] args) {
        try {
            company.beans.Person person = new company.beans.Person("Jan Nowak", 30);
            System.out.println("Imie, nazwisko: " + person.getName() + ", Wiek: " + person.getAge());
        } catch (company.exceptions.InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
        int sum = company.utils.MathUtils.add(10, 20);
        System.out.println("10+20=" + sum);
        company.interfaces.Messenger messenger = new company.implementations.EmailMessenger();
        messenger.sendMessage("Wynik dodawania to: "+sum);
    }
}