public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load =   another.load - this.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery b1 = new Battery(10);
        Battery b2 = new Battery(100);
        System.out.println("load first : " + b1.load +
                " ,load second :" + b2.load);
        b1.exchange(b2);
        System.out.println("load first : " + b1.load +
                " ,load second : " + b2.load);
    }

}
