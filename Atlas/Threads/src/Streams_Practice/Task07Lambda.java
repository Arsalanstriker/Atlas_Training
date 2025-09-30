import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07Lambda {

    // create an object of list using ArrayList
    static List<Integer> numbers = new ArrayList<>();

    // preparing our data
    public static List getnumbers(){// getting list of numbers

        // add places and country to the list
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        return numbers;
    }

    public static void main( String[] args ) {

        List<Integer> mynumebrs = getnumbers();
        System.out.println("List of Square numbers:");
        numbers.stream().map(n -> n * n).forEach(sq -> System.out.println(sq));
    }//lambda function to square each numbers

}
