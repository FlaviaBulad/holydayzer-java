import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Holidays {
    private List<Holiday> holidaysList = new ArrayList<>();

    public Holidays() {
        this.holidaysList.add(new Holiday("01/01/2023", "Confraternização mundial"));
        this.holidaysList.add(new Holiday("21/02/2023", "Carnaval"));
        this.holidaysList.add(new Holiday("17/04/2023", "Páscoa"));
        this.holidaysList.add(new Holiday("21/04/2023", "Tiradentes"));
        this.holidaysList.add(new Holiday("01/05/2023", "Dia do trabalho"));
        this.holidaysList.add(new Holiday("08/06/2023", "Corpus Christi"));
        this.holidaysList.add(new Holiday("07/09/2023", "Independência do Brasil"));
        this.holidaysList.add(new Holiday("12/10/2023", "Nossa Senhora Aparecida"));
        this.holidaysList.add(new Holiday("02/11/2023", "Finados"));
        this.holidaysList.add(new Holiday("15/11/2023", "Proclamação da República"));
        this.holidaysList.add(new Holiday("25/12/2023", "Natal"));
    }

    void isHoliday(String date) {

        for(int i = 0; i < holidaysList.size(); i++) {
            if(Objects.equals(holidaysList.get(i).getDate(), date)) {
                System.out.println("\nÉ feriado! " + holidaysList.get(i).getDate() + " -> " + holidaysList.get(i).getName());
                return;
            }
        }
        System.out.println(" \nNão existe feriado na data " + date);
    }

    List<Holiday> getHolidays() {
        return holidaysList;
    }

    void printHolidays() {
        for(int i = 0; i < holidaysList.size(); i++) {
            System.out.println(holidaysList.get(i).getDate() + " -> " + holidaysList.get(i).getName());
        }
    }
}