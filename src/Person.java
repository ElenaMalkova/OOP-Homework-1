import java.util.List;

public class Person {
    public String name;
    public String birthDate;
    public String gender;
    public Person father;
    public Person mother;
    List<Person> children;

    public Person(String name, String birthDate, String gender, Person father, Person mother) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
//        father.children.add(this);
//        mother.children.add(this);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gender='" + gender + '\'' +
                ", father=" + father +
                ", mother=" + mother + "\n";
    }
}
