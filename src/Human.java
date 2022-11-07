import java.util.Objects;

public class Human {
     private final String name;
     private final String town;
     private final int yearOfBirth;
     private String jobTitle;

     void hello(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году.  Я работаю на должности -" + jobTitle + ". Будем знакомы!");
    }


    public Human(String name, String town, int yearOfBirth,  String jobTitle) {
         if (name==null){
             this.name = "Информация не указана";
         }else {
             this.name = name;
         }
        if (town==null){
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }
        if (yearOfBirth<=0){
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle==null){
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Human" + "name  " + name +  "town " + town + ", yearOfBirth " + yearOfBirth + ", jobTitle " + jobTitle;
    }


}

