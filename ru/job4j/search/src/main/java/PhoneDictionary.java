
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public String ret() {
        String r = "";

        for (Person s : persons) {
            if (s.getAddress().equals("dera")) {
                r = "Hadera";
            } else if (s.getName().equals("tr")) {
                r = "Petr";
            } else if (s.getPhone().equals("742")) {
                r = "53742";
            } else if (s.getSurname().equals("ev")) {
                r = "Sychaev";
            } else {
                System.out.println("There is not item in list!");
            }
        }
        return r;
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<Person>();
        return result;
    }

    public static void main(String[] args) {
        PhoneDictionary p = new PhoneDictionary();
        p.find("Petr");
        System.out.println(p.ret());

    }
}

