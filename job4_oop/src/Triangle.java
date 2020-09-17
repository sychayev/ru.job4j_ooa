
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        double prd = (a + b + c) / 2;
        return prd;
    }

    public boolean exist(double ab, double ac, double bc) {
        boolean corner1 = ab < ac + bc;
        boolean corner2 = ac < ab + bc;
        boolean corner3 = bc < ab + ac;
        if (corner1 != corner2 != corner3){
            }
        return false;
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) - (p - ac) * (p - bc));
        }
        return rsl;
    }

    public static void main(String[] args) {
//        Triangle trg = new Triangle(0,4,4);
    }
}
