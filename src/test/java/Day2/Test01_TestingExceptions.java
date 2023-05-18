package Day2;

import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;

public class Test01_TestingExceptions {

    //!!! Test ettigimiz method bekledigimiz exception'i firlatti mi?

    @Test
    void testException() {

        String str = "Merhaba Dünya";

        assertThrows(NullPointerException.class, () -> {
            System.out.println("testException() calisti");
            str.length();
        });
    }

    //!!! Bölme islemi icin AArtihmeticException kontrolü
    @Test
    void testException2() {

        int sayi1 = 1;
        int sayi2 = 0;

        //!!! parent class'i da yazarsak da test gecer -->RunTimeException
        assertThrows(ArithmeticException.class, () -> {
            System.out.println(sayi1 / sayi2);
        });
    }

    //!!! Yukaridaki senaryoyu method ekleyerek yapalim
    @Test
    void testException3() {
        int sayi1 = 1;
        int sayi2 = 0;

        assertThrows(ArithmeticException.class, () -> {
            divide(sayi1, sayi2);
        });
    }

    private int divide(int a, int b) {

        return a / b;
    }
}
