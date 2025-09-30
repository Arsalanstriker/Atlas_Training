import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Task11Lambda {
    public static void main( String[] args ) {


        // create an object of list using ArrayList
        List<Integer> numbers = Arrays.asList(10,12,45,10,20,11,21,01,11);

        //filtering // using lambda function for filtering
        List<Integer> RemoveDup = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("List of numbers before duplicate:" + numbers);//prints
        System.out.println("List of numbers after duplicates: "+ RemoveDup);// using lambda function sout of odd numbers
    }
}
