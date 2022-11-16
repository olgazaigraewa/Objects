import java.util.Objects;

public class Flower {


    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = Objects.requireNonNullElse(flowerColor, " белый");
        this.country = Objects.requireNonNullElse(country, "Россия");
        this.cost = Math.max(cost, 1);
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = Objects.requireNonNullElse(flowerColor, " белый");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = Objects.requireNonNullElse(country, "Россия");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = Math.max(cost, 1);
    }

    public static void printCostOfFlowers(Flower... flowers) {
        double costOfBouquet = 0;
        int minimumLifespan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifespan) {
                minimumLifespan = flower.lifeSpan;

            }
            costOfBouquet += flower.getCost();

        }
        costOfBouquet = costOfBouquet * 1.1;
        System.out.println("Стоимость букета: " + costOfBouquet + " рублей.");
        System.out.println("Срок стояния букета: " + minimumLifespan + " дней.");
    }
    private static void printInfo(Flower flower) {
        System.out.println("Цвет: " + flower.getFlowerColor() + ", страна происхождения: " + flower.getCountry() +
                ", стоимость за штуку: " + flower.getCost() + " рублей , срок стояния: " + flower.lifeSpan + " дней");
    }
}

