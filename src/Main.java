public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Person person1 = new Person("Ivan", "01.01.1960", "male", null, null);
        Person person2 = new Person("Maria", "02.02.1965", "female", null, null);
        Person person3 = new Person("Nick", "03.03.1990", "male", person1, person2);
        Person person4 = new Person("Olga", "04.04.1993", "female", null, null);
        Person person5 = new Person("Anna", "05.05.2015", "female", person3, person4);
        familyTree.addPerson(person1);
        familyTree.addPerson(person2);
        familyTree.addPerson(person3);
        familyTree.addPerson(person4);
        familyTree.addPerson(person5);

        System.out.println(familyTree);

    }
}