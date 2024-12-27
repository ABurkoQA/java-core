import  javaCoreTwo.collectionsAndArrays.*;
import javaCoreTwo.javaCorePractice.JavaPractice;
import javaCoreTwo.regexTasks.*;

public class Main {
    public static void main(String[] args) {

        // Collections / Arrays

        // Part 1

        //FirstPart.wordCounter();

        // Part 2

//        SecondPart.wordCounter();
//        SecondPart.removeRepeatWord();

        // Part 3

        //ThirdPart.removeWords();

        //Part 4

//        FourthPart.saveStringToFile();
//        String test = FourthPart.readFromFile();
//
//        boolean testBool = FourthPart.findLine("man more of them live next door");

        // Regex

        // Part 1

        String test = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";

        System.out.println(RegexPart.checkForPattern(test));

        // Part 2

        System.out.println(RegexPart.findPattern(test));

        // Part 3

        String emailTest = "test 2667843 (test_email@griddynamics.com) test 67483 some string ";

        System.out.println();
        System.out.println(RegexPart.findEmail(emailTest));

        // Part 4

        String orderTest = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_Contract INFO  LogUtils - POI file name: [Integration_test_Contract], total number of orders successfully processed: [2]";

        System.out.println(RegexPart.findOrders(orderTest));

        // Java Core Practice

        String testFoeSearch = "When you first start to evaluate a cloud migration, the decisions to be made, stakeholders who need to be involved, it can sometimes feel overwhelming – and with good reason. A move to the cloud can take time, resources, and manpower, and while companies are nearly universally glad they made those investments, that doesn't cancel out the fact that they take strategic planning and up-front work."
                + "What do you need to plan for? Who needs to be involved (and when)? What roles and responsibilities need to be divided up? The answers vary a bit depending on your company size, the scope of your migration, and whether you have the budget (or need) for a migration partner."
                + "Below are the typical roles and responsibilities we see from successful migrations – and some tips to prepare your team for success. Because without the right team in place, missed deadlines, duplicative work, and post-migration workflow issues become much greater risks.";

        System.out.println(String.join(" ", JavaPractice.findWordByPrefix(testFoeSearch)));
    }
}