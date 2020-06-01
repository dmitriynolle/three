import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.java_three.TestMain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMainTest {

    @BeforeEach
    public void init() {
        TestMain testMain = new TestMain();
    }

    @ParameterizedTest
    @MethodSource("dataForAddOperation1")
    public void testArray1(int[] a, int[] result) {
        Assertions.assertArrayEquals(result, TestMain.test_1(a));
    }

    public static Stream<Arguments> dataForAddOperation1() {
        List<Arguments> out = new ArrayList<>();
        int[][] a = {{1, 2, 4, 4, 2, 3, 4, 1, 7},
                {1, 2, 4, 4, 2, 3, 1, 1, 7},
                {1, 2, 4, 1, 2, 3, 1, 1, 7}};
        int[][] result = {{1, 7}, {2, 3, 1, 1, 7}, {1, 2, 3, 1, 1, 7}};
        for (int i = 0; i < 3; i++) {
            out.add(Arguments.arguments(a[i], result[i]));
        }
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForAddOperation2")
    public void testTrue(int[] a) {
        Assertions.assertTrue(TestMain.test_2(a));
    }

    @ParameterizedTest
    @MethodSource("dataForAddOperation2")
    public void testFalse(int[] a) {
        Assertions.assertFalse(TestMain.test_2(a));
    }

    public static Stream<Arguments> dataForAddOperation2() {
        List<Arguments> out = new ArrayList<>();
        int[][] a = {{1, 1, 1, 4, 4, 1, 4, 4},
                {4, 4, 4, 4, 4, 4, 4, 4, 4},
                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                {5, 2, 3, 5, 2, 3, 5, 6, 7}};
        for (int i = 0; i < 4; i++) {
            out.add(Arguments.arguments(a[i]));
        }
        return out.stream();
    }

    @Test
    public void Exception() {

        Assertions.assertThrows(RuntimeException.class, ()-> {
            int[] a = {3,3,5,6,8,9};
            TestMain.test_1(a);
        });
    }
}
