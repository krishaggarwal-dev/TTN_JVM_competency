package SS_JV1.Question9;

public class Square {

    private double side;

    public Square(double side) throws NoException {
        setSide(side);
    }

    public void setSide(double side) throws NoException {
        if (side < 0) {
            throw new NoException("Side cannot be negative");
        }
        this.side = side;
    }

    public double area() {
        return this.side * this.side;
    }

    public static void main(String[] args) {
        try {
            Square sq = new Square(5);
            System.out.println(sq.area());
        } catch (NoException e) {
            System.out.println(e);
        }
    }
}
