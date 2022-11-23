package transport;

import lombok.Getter;

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
}
