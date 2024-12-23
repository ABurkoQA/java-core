package javaCoreFirst.thirdTask;

public class MakingChanges {
    public static void changeIdentities(Person p1, Person p2){
        if(p1 == null || p2 == null){
            System.out.println("Person cannot be null");
            return;
        }

        String tempName = p1.getName();
        int tempAge =  p1.getAge();

        p1.setAge(p2.getAge());
        p1.setName(p2.getName());

        p2.setName(tempName);
        p2.setAge(tempAge);
    }
}
