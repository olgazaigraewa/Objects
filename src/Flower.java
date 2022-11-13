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
}
