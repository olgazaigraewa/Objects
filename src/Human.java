import java.util.Objects;

public class Human {
       String name;
     private  String town;
     private  int yearOfBirth;
      String jobTitle;

     void hello(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году.  Я работаю на должности -" + jobTitle + ". Будем знакомы!");
    }


    public Human(String name, String town, int yearOfBirth,  String jobTitle) {
        this.name = Objects.requireNonNullElse(name, "Информация не указана");
        this.town = Objects.requireNonNullElse(town, "Информация не указана");
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.jobTitle = Objects.requireNonNullElse(jobTitle, "Информация не указана");
    }

    @Override
    public String toString() {
        return "Human" + "name  " + name +  "town " + town + ", yearOfBirth " + yearOfBirth + ", jobTitle " + jobTitle;
    }



    public String getTown() {
         return town;
    }

    public void setTown(String town) {
        this.town = Objects.requireNonNullElse(town, "Информация не указана");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }


}

