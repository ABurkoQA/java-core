## Part: 1
1. Find in Google song ""beatles yellow submarine""
2. Save this song as String
3. Remove all "","" , ""\n "" and convert all words to lowercase (Programmatically!)
4. Make an array[] (not a List) from the string (array of words)
5. Print to consol word and how many times it appeared in the array"
##   Part: 2
1. Update Task #1 to use collections to count the words.  (Put song from array to List)
2. Remove all duplicate words from the song and print to console
3. Sort song words by String length. "

## Part: 3
1. Take List<String> of song from task1
2. Remove all world ""yellow"" and ""submarine""
3. Print the result."                        
##   Part 4:
1. Save song ""beatles yellow submarine"" to txt file
2. Read song from file (serialization, use a try with resources)
3. Define a custom exception : BeatlesException extending Exception, add a ""Beatles"" to a caught exception message
4. Create a method which verifies if some random string (ex: ""Show must go on!"") can be found in song above
5. Throw BeatlesException defined above if a given random string is not found in your song text."
##   Part 5: 
Fix this Set. It should contain 3 Objects

``` java
   import java.util.HashSet;
   import java.util.Set;
   public class SetProblem {
   static class User {
   private String name;
   private int age;
   public User(String name, int age) {
   this.name = name;
   this.age = age;
   }
   public String getName() {
   return name;
   }
   public void setName(String name) {
   this.name = name;
   }
   public int getAge() {
   return age;
   }
   public void setAge(int age) {
   this.age = age;
   }
   }

   public static void main(String[] args) {
   Set<User> users = new HashSet<>();
   users.add(new User("Max", 27));
   users.add(new User("Veronika", 20));
   users.add(new User("Denis", 30));
   users.add(new User("Max", 27));

           if (users.size() == 3) {
           System.out.println("System works well!");
           } else {
           throw new RuntimeException("Users set size should be 3!");
           }
   }
   }
```