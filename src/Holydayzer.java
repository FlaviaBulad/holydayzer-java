import java.util.HashMap;
import java.util.Map;

public class Holydayzer {
    Map<String, String> holidays = new HashMap<String, String>();

    public Holydayzer() {
        addHoliday();
    }

    public void getHoliday(String holiday) {
        String getHoliday = holidays.get(holiday);

        if (getHoliday == null) {
            System.out.println("Não existe feriado na data " + holiday + "\n");
            return;
        } else {
            System.out.println("É feriado! " + holiday + " -> " + getHoliday + "\n");
        }
    }

    void printHolidays() {
        holidays.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    public void addHoliday() {
        holidays.put("01/01/2023", "Confraternização mundial");
        holidays.put("21/02/2023", "Carnaval");
        holidays.put("17/04/2023", "Páscoa");
        holidays.put("21/04/2023", "Tiradentes");
        holidays.put("01/05/2023", "Dia do trabalho");
        holidays.put("08/06/2023", "Corpus Christi");
        holidays.put("07/09/2023", "Independência do Brasil");
        holidays.put("12/10/2023", "Nossa Senhora Aparecida");
        holidays.put("02/11/2023", "Finados");
        holidays.put("15/11/2023", "Proclamação da República");
        holidays.put("25/12/2023", "Natal");
    }
}