package DZ2.DZ2_2;

public class Main {
    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.add("John", "12345");
        telephoneBook.add("John", "5789");

        var record = telephoneBook.get("John");
        System.out.println(record);

        telephoneBook.add("Lisa", "57829");
        record = telephoneBook.get("Lisa");
        System.out.println(record);

        record = telephoneBook.get("Smith");
        System.out.println(record);
    }
}