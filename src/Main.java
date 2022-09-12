import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person( "David", "0722", 30);
        Person p2 = new Person( "Johan", "0733", 40);

        Person p3 = p1;

        p1.name = "Calle";

        System.out.println(p1.name);
        System.out.println(p3.name);

        Person p4 = new Person();
        System.out.println(p4.name);

        p1.greet();
        p4.greet();

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        for(Person person : persons) {
            System.out.println(person);
            //person.greet();
        }







    }
}
