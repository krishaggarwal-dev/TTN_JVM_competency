package SS_JV2.Question1;

public class Q1Enum {

    enum House {
        Hut(50000),
        Apartment(200000),
        Villa(500000),
        Bungalow(1000000);

        private int price;

        House(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        for(House house : House.values()) {
            System.out.println(house + " price is : " + house.getPrice());
        }
    }
}
