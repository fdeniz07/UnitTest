package Day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_ParameterizedTest {

    @Test
    void testLength() {

        assertTrue("Mirac".length() > 0);
        assertTrue("Fatih".length() > 0);
        assertTrue("Ebubekir".length() > 0);
        assertTrue("Ahmet".length() > 0);
    }

    //!!! yukeridaki methodda 4 defa asssertTrue yazdik ama bunu daha clean sekilde yapmak icin:

    @ParameterizedTest
    @ValueSource(strings = {"Mirac", "Fatih", "Ebubekir", "Ahmet"})
    void testLength2(String str) {

        assertTrue(str.length() > 0);
    }

    //!!! 2.Örnek
    @Test
    void testUpperCase(){

        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }

    //!!! yukaridaki örnegi parametreli yazalim:
    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA,Merhaba",
            "JAVA,Java",
            "TEST,Test"
    })
    void testUpperCase2(String str1,String str2){

        assertEquals(str1,str2.toUpperCase());
    }


    //!!! 3.Örnek
    @ParameterizedTest
    @CsvSource(value = { "true,java,a","true,junit,u","false,hello,a"})
    void testContains(boolean b1,String str1, String str2){

        assertEquals(b1,str1.contains(str2));
    }

}
