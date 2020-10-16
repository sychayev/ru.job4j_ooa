package ex;

public class FindE1 {

    public static int indexOf(String[] value, String key) {
        int rsl = -1;
        for(String s : value){
            System.out.println(s);
        }
        return rsl;
    }

    public static void main(String[] args) {
        String [] s = new String[]{"a","b","c"};
        System.out.println( FindE1.indexOf(s,"b"));
    }
}
