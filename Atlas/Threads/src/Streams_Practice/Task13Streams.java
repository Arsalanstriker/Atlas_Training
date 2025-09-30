import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Task13Streams{
    public static void main( String[] args ) {


        // create an object of list using ArrayList
        List<String> names  = Arrays.asList("Arsalan","Taha","Striker","Thor","Dr.Strange","Shan","SA","arsalan");

        //filtering // using lambda function for filtering
        List<String> SortedNames = names.stream().sorted().collect(Collectors.toList());

        System.out.println("List of Names before sorting:" + names);//prints
        System.out.println("List of Names after Sorting: "+ SortedNames);// using lambda function sout of Sorted names
    }
}
