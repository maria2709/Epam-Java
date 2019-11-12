package homework_7;

import java.util.Comparator;

/**
 * Created by Maryia_Gaydayenko on 11/1/2019.
 */
public class MyComparatorColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Shape) o1).getColor();
        String color2 = ((Shape) o2).getColor();

        return color1.compareTo(color2);
    }
}
