package ex6;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //6. Scrie o functie care accepta 2 numere reprezentand anul si luna.
        //Functia va returna prima si ultima zi din luna.
        //
        //De exemplu, pentru anul 2017 si luna 1, functia va returna "2017-01-01 2017-01-31" Foloseste-te de functiile deja existente in clasa LocalDate.

        System.out.println(findFirstAndLastDay(2017,1));
    }

    public static List<LocalDate> findFirstAndLastDay (int year, int month){
        List<LocalDate> firstAndLastDay = new ArrayList<>();

        YearMonth yearMonth = YearMonth.of(year,month);
        firstAndLastDay.add(yearMonth.atDay(1));
        firstAndLastDay.add(yearMonth.atEndOfMonth());
        return firstAndLastDay;
    }

}
