import firstTask.*;
import fourthTask.*;
import secondTask.*;
import thirdTask.*;

public class Main {
    public static void main(String[] args) {

        // Task 1

        System.out.println(SortedArray.checkSortedArray(4, "1 2 3 4"));
        System.out.println(SortedArray.checkSortedArray(4, "1 2 3 0"));

        // Task 2

        System.out.println(StringReverser.firstStringReverser("Hello"));
        System.out.println(StringReverser.secondStringReverser("Hello"));
        System.out.println(StringReverser.thirdStringReverses("Hello"));

        // Task 3

        Person p1 = new Person("Arsen", 15);
        Person p2 = new Person("Andrzej", 123);

        MakingChanges.changeIdentities(p1,p2);

        // Task 4

        User user1 = new User(23, "Arsen", "Burko");
        User user2 = new User(32, "Andrzej", "Koko");
        User user3 = new User(12, "Vasya", "Kiki");
        User user4 = new User(443, "Matidla", "Bobo");
        User user5 = new User(123, "Anfisa", "Bibi");
        User user6 = new User(543, "Artur", "Momo");
        User user7 = new User(759, "Bodya", "Rere");

        Account account1 = new Account(123,7726, user1);
        Account account2 = new Account(4234,1000, user2);
        Account account3 = new Account(1231,1500, user3);
        Account account4 = new Account(8924,2000, user4);
        Account account5 = new Account(9288,200, user5);
        Account account6 = new Account(1635,3000, user6);
        Account account7 = new Account(8372,0, user7);

        Account[] accounts = new Account[] {account1, account2, account3, account4, account5,
                account6, account7};

        AccountServiceImpl accountService = new AccountServiceImpl(accounts);

        Account testAccout = accountService.findAccountByOwnerId(123L);
        long result = accountService.countAccountsWithBalanceGreaterThan(1);
    }
}