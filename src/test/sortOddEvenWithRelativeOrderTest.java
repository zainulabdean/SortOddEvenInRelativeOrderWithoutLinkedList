package test;


import com.company.SortOddEvenWithRelativeOrder;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class sortOddEvenWithRelativeOrderTest {

    int[] arr = {34, 21, 12, 19, 31, 32, 4, 13, 50, 5, 3, 7, 16, 20, 17};
    int[] expectedResponse = {21, 19, 31, 13, 5, 3, 7, 17, 34, 12, 32, 4, 50, 16, 20};

    @Test
    public void testSortOddEvenWithRelativeOrder_ProvidesSortedList() {

        SortOddEvenWithRelativeOrder sort = new SortOddEvenWithRelativeOrder();
        sort.sortOddEvenNumbers(arr);

        assertArrayEquals(expectedResponse, arr);
    }

    @Test
    public void testSortOddEvenWithRelativeOrder_NotProvidesSortedList() {

        SortOddEvenWithRelativeOrder sort = new SortOddEvenWithRelativeOrder();
        sort.sortOddEvenNumbers(arr);

        assertNotEquals(expectedResponse, arr);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        final InputStream original = System.in;
        SortOddEvenWithRelativeOrder.main(args);
        System.setIn(original);
    }

}



