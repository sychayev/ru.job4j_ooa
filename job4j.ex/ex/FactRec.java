package ex;

public class FactRec {
    public static int calc(int n) {
        int  rsl = 0;
        if(n == 0 || n == 1){
        return 1;
        }else {
          rsl =  calc(n - 1) * n;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
