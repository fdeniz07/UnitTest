package Day2;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test05_PerformansTest {

    //!!! Bunu nerede kullanabiliriz ??? --> Task olarak verilen sorunun cözümü icin max. 2sn icinde ekrana sonucu vermesini istiyorsam:

    @Test
    void testPrintPerformans() {

        assertTimeout(Duration.ofSeconds(2),
                () -> IntStream.rangeClosed(1, 100000).forEach(System.out::println));
    }


    @Test
    void testPerformans() {

        assertTimeout(Duration.ofSeconds(1),
                () -> IntStream.rangeClosed(1, 50000).reduce((x, y) -> Math.addExact(x, y)));
    }

}
