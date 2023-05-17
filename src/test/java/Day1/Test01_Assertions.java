package Day1;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test01_Assertions {

    @Test
    public void test() {
        //main metodu yokken nasil calisti???
        //JUnit icinde gömülü olarak gelen Main metodu cagriliyor
        //JUnit(Jupiter) ile metodlarin erisim belirleyicisini public yapmak zorunda degiliz.
    }

    @Test
    public void testLength() {
        String cumle = "Merhaba Dünyam"; //14 karakter
        int anlikDeger = cumle.length();
        int beklenenDeger = 14;
        assertEquals(beklenenDeger, anlikDeger);
    }

    //!!! farkli bir örnek ( toUpperCase() )
    @Test
    public void testUpperCase() {

        String anlikDeger = "Merhaba".toUpperCase(); //MERHABA
        String beklenenDeger = "MERHABA";

        //Testimiz hata verirse, mesaj vermek istersek metodun 3 parametli hali kullanilir
        assertEquals(beklenenDeger, anlikDeger, "Uppercase metodu düzgün calismadi");
    }

    @Test
    public void testToplama() {

        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1, sayi2);
        int beklenenDeger = 15;
        assertEquals(beklenenDeger, anlikDeger);

    }

    @Test
    public void testContains() {

        assertEquals(false,"Mirac".contains("z"));
    }

}
