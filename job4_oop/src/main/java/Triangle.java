
public class Triangle {
    private Point first;
    private Point second;
    private Point third;
    public  Triangle(Point ap, Point pc, Point cp) {
        this.first = ap;
        this.second = pc;
        this.third = cp;
    }

    public static double period(double a, double b, double c) {
        double prd = (a + b + c) /2;
        return prd;
    }

    public static boolean exist(double ab, double ac, double bc) {
        boolean corner1 = ab < ac + bc;
        boolean corner2 = ac < ab + bc;
        boolean corner3 = bc < ab + ac;
        if (corner1 != corner2 != corner3) {
        }
        return false;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(first);
        double ac = second.distance(second);
        double bc = third.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) - (p - ac) * (p - bc));
        }
        return rsl;
    }

    public static void main(String[] args) {

        System.out.println(Triangle.period(0,4,0));
//        System.out.println(Triangle.exist(0,4,4));

    }
}
