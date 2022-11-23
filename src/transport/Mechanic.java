package transport;

import lombok.Getter;

@Getter
public class Mechanic < T extends Transport> {

    private final String name;
    private final String surname;
    private  final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean service(T t){
        return t.service();
    }
    public void repair(T t){
        t.repair();

    }

    @Override
    public String toString() {
        return name + " " + surname +  ", компания - " + company;

    }
}
