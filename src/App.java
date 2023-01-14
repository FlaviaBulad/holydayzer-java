import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Holydayzer holidays = new Holydayzer();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma data no formato dd/mm/aaaa:\n");
        String date = input.nextLine();

        holidays.getHoliday(date);

        System.out.println("Veja abaixo uma lista com todos os feriados brasileiros em 2023:\n");
        holidays.printHolidays();

    }
}
