package ex;

public class FindE1 {
    public static int indexOf(String[] value, String key)
            throws UserInputException {
        ElementNotFoundException el = new ElementNotFoundException("Null");
        int rsl = -1;
        for (String s : value) {
            if (s != "b") {
                System.out.println(s);
            }
            else  {
                System.out.println(el);
            }
        }
        return rsl;
    }

    public static void main(String[] args) throws UserInputException {
        String[] s = new String[]{"a", "b", "c", null};
        try {
           FindE1.indexOf(s, "b");
        } catch (UserInputException a) {
            a.printStackTrace();
        }
    }
}
