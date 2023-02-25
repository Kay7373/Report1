import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

public class cactus1 {
    public static void main(String[] args) {

        String season = "";
        System.out.println("Ведите дату последнего полива в формате гггг-мм-дд");
        Scanner sc = new Scanner(System.in);
        String dayInput = sc.next();

        LocalDate dayWater = LocalDate.parse(dayInput);
        LocalDate dayToday = LocalDate.now();
        //       dayToday = dayToday.plusMonths(1);
        //       dayToday = dayToday.plusMonths(4);
        //       dayToday = dayToday.plusMonths(7);

        Period period = Period.between(dayWater, dayToday);// Количество дней между датами
        String monthToday = String.valueOf(dayToday.getMonth());// Название месяца

        if ( monthToday == "DECEMBER" || monthToday == "JANUARY" || monthToday == "FEBRUARY" ) {
            season = "winter";}
        if ( monthToday == "MARCH" || monthToday == "APRIL" || monthToday == "MAY" ) {
            season = "spring";}
        if ( monthToday == "JUNE" || monthToday == "JULY" || monthToday == "AUGUST" ) {
            season = "summer";}
        if ( monthToday == "SEPTEMBER" || monthToday == "OCTOBER" || monthToday == "NOVEMBER" ) {
            season = "autumn";}

        if (season == "winter"){
            dayWater = dayWater.plusMonths(1);
            System.out.println("Кактус необходимо полить: " + dayWater);}
        if (season == "spring"){
            dayWater = dayWater.plusWeeks(1);
            System.out.println("Кактус необходимо полить: " + dayWater);}

        if (season == "summer" && sensor() < 30 && period.getDays() > 2){
            System.out.println("Кактус необходимо сегодня полить ");
        }
        else {
            if (season == "summer"){
                System.out.println("Кактус сегодня неполивать ");}

        }
        if (season == "autumn"){
            dayWater = dayWater.plusWeeks(1);
            System.out.println("Кактус необходимо полить: " + dayWater);}

    }

    public static double sensor() { //Датчик влажности
        Random rnd = new Random();
        // получаем влажность в диапазоне от 1% до 100%
        double sen = 1 + (100-1)*rnd.nextDouble();
        return sen;
    }
}
