package Day3;

public class StringModify {

    //// Task : kelimenin ilk 2 harf icerisinde A varsa silinsin (kelime içindeki harflerin hepsi büyük olacak)
        //AABC --> BC, ABC --> BC, A -->"", AA-->""

    public String deleteIfItIsInFirstTwoPosition(String text){

        //Eger kullanici degeri bir karakter girerse, bunu kontrol etmek icin if koyuyoruz
        if (text.length()<=2 ){ //A
            return text.replace("A","");
        }


        String firstTwoChars = text.substring(0,2); // AABCDAVG --> AA
        String afterFirstTwoChars = text.substring(2); // AABCDAVG --> BCDAVG

        return firstTwoChars.replaceAll("A","") + afterFirstTwoChars;

    }
}
