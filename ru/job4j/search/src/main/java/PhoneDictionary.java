
import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }


    public ArrayList<Person> find(String key) {
        ArrayList<Person> res = new ArrayList<Person>();
        for (Person s : res) {
            if(  s.getAddress().equals(key)){
                System.out.println("Hadera");
            } else if (s.getName().equals(key)) {
                System.out.println("Petr");
            } else if (s.getPhone().equals(key)) {
                System.out.println("53742");
            } else if (s.getSurname().equals(key)) {
                System.out.println("Sychaev");
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

