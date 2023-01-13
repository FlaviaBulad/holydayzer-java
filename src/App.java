import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Holidays holidays = new Holidays();

        Scanner input = new Scanner(System.in);
        System.out.println("\nDigite uma data no formato dd/mm/aaaa ");
        String date = input.nextLine();

        holidays.isHoliday(date);

        System.out.println("\nVeja abaixo uma lista com todos os feriados brasileiros em 2023:");
        holidays.printHolidays();
      

    }
}
