package transport;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Sponsor {

    private  final String name;
    private  final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public void toSponsorRace(){
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %s", name, amount);
    }

    @Override
    public String toString() {
        return  name +  ", сумма поддержки - " + amount;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null|| getClass()!= o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
