import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    public List<Person> familyList;

    public FamilyTree(List<Person> familyList) {
        this.familyList = familyList;
    }
    public void addPerson(Person person){
        familyList.add(person);
    }

    public FamilyTree(){
        this(new ArrayList<>());
    }

    @Override
    public String toString() {
        return familyList.toString();
    }
}
