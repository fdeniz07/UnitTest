package Day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatTestMultipleTimes {

    //!!! Testi tekrarlamak istersek ???

    @RepeatedTest(5)
    void TestSubstring() {

        assertEquals("Java", "Java is an OOP language".substring(0, 4));
        System.out.println("Test calisti");
    }


    @RepeatedTest(3)
    @Disabled
        //Herhangi bir testi pasif hale getirmek icin @Disable annotation kullanilir.
    void testRepeated() {

        assertEquals(2, Math.addExact(1, 1));
        System.out.println("test2 calisti");
    }

    //!!! 3.Örnek
    Random rm = new Random();

    @RepeatedTest(5)
    void testMathExact() {

        int sayi1 = rm.nextInt(10);
        int sayi2 = rm.nextInt(10);

        assertEquals(sayi1 + sayi2, Math.addExact(sayi1, sayi2));
        System.out.println("Sayi1 : " + sayi1 + " Sayi2 : " + sayi2 );
    }
}
