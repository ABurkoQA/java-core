package thirdTask;

public class MakingChanges {
    public static void changeIdentities(Person p1, Person p2){
        if(p1 == null || p2 == null){
            System.out.println("Person cannot be null");
            return;
        }

        Person p3 = new Person(p1.getName(), p1.getAge());

        p1.setAge(p2.getAge());
        p1.setName(p2.getName());

        p2.setName(p3.getName());
        p2.setAge(p3.getAge());
    }
}
