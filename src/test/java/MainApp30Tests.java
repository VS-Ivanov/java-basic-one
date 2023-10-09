import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.otus.vadim.ivanov.java.basic.lesson30.MainApp30;

public class MainApp30Tests {
    private MainApp30 testApp;

    @BeforeEach
    public void createTestApp() {
        this.testApp = new MainApp30();
    }

    @Test
    public void testGetArr(){
        int[] arr = {1, 2, 1, 2, 2};
        int[] result = testApp.getArrAfterLastOne(arr);

        //ожидаем получить {2,2}
        Assertions.assertArrayEquals(result,new int[]{2,2});
    }

    @Test
    public void testGetArrException(){
        int[] arr = {2, 2, 2, 2};
        //ожидаем получить исключение
        Assertions.assertThrows(RuntimeException.class,()->testApp.getArrAfterLastOne(arr));
    }

    @Test
    public void testArrIsContain(){
        int[] arr = {1, 2, 2, 1};
        //ожидаем получить true
        Assertions.assertTrue(testApp.arrIsContainOneTwoOnly(arr));
    }

    @CsvSource({
            "1, 2",  //true
    })

    @ParameterizedTest
    public void testArrIsContainParamsTrue(int a, int b){
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        //ожидаем получить true или false в зависимости от параметров
        Assertions.assertTrue(testApp.arrIsContainOneTwoOnly(arr));
    }

    @CsvSource({
            "1, 1",  //false
            "1, 3"   //false
    })
    @ParameterizedTest
    public void testArrIsContainParamsFalse(int a, int b){
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        //ожидаем получить true или false в зависимости от параметров
        Assertions.assertFalse(testApp.arrIsContainOneTwoOnly(arr));
    }


}
