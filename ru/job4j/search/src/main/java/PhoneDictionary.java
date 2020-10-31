
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }


    public ArrayList<Person> find(String key) {
        ArrayList<Person> res = new ArrayList<Person>();
        for (Person s : res) {
            if (s.equals(key) || s.getAddress().equals(key)) {
                res.add(s);
            } else if (s.equals(key) || s.getName().equals(key)) {
                res.add(s);
            } else if (s.equals(key) || s.getPhone().equals(key)) {
                res.add(s);
            } else if (s.equals(key) || s.getSurname().equals(key)) {
                res.add(s);
            } else {
                System.out.println("There is not item in list!");
            }

        }
        return res;
    }

    public static void main(String[] args) {
        PhoneDictionary p = new PhoneDictionary();
        ArrayList<Person> per = new ArrayList<>();
        p.find("dera");
        p.find("tr");
        p.find("742");
        p.find("ev");

    }
}

