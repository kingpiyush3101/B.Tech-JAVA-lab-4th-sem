/*
QUE: Write a java program to find the maximum value from the given type of elements using a generic function.
*/
import java.util.*;
public class Test {
    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) {
        Iterator<? extends T> MyList = coll.iterator();
        T element = MyList.next();
        while (MyList.hasNext()) {
            T next_element = MyList.next();
            if (next_element.compareTo(element) > 0)
                element = next_element;
        }
        return element;
    }
    public static void main(String[] args)
    {
        List<Integer> ints = new ArrayList<Integer>(Arrays.asList(1, 55, 4, 3, 23, 12, 25, 9));
        int max = Collections.max(ints);
        System.out.println(ints);
        System.out.println("maximum Value is " + max);
        List<Character> chars = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char maxc = Collections.max(chars);
        System.out.println(chars);
        System.out.println("Maximum Value is " + maxc);
    }
}