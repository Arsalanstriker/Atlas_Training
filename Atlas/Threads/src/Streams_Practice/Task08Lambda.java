import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Task08Lambda {
    public static void main( String[] args ) {


        // create an object of list using ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

          //filtering // using lambda function for filtering
        List<Integer> addnumebrs = numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());

        System.out.println("List of Odd numbers:");//prints
        addnumebrs.forEach(n-> System.out.println(n));// using lambda function sout of odd numbers
    }
}