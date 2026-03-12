public class Main {
    public static void main(String[] args) {

        // Задание 1
        int integerValue = 10000;
        byte byteNumber= -120;
        short shortNumber = 30000;
        long longNumber = 90000000L;
        float floatNumber = 3.1415f;
        double doubleNumber= 6.2830d;

        System.out.println("Значение переменной integerValue c типом Int равно " + integerValue);
        System.out.println("Значение переменной byteNumber c типом byte равно " + byteNumber);
        System.out.println("Значение переменной shortNumber c типом short равно " + shortNumber);
        System.out.println("Значение переменной longNumber c типом long равно " + longNumber);
        System.out.println("Значение переменной floatNumber c типом float равно " + floatNumber);
        System.out.println("Значение переменной doubleNumber c типом double равно " + doubleNumber);


        // Задание 2
        double doubleValue = 27.12;
        long longValue = 987678965549L;
        float floatValue = 2.786f;
        short shortValue = 569;
        int intValue = -159;
        int intNumber = 27897;
        byte byteValue = 67;

        // Задание 3
        int lpStudent= 23;
        int aStudent = 27;
        int eaStudent = 30;
        int allPapers = 480;
        int eachPapers = allPapers / (lpStudent + aStudent + eaStudent);

        System.out.println("На каждого ученика рассчитано " + eachPapers + " листов бумаги");

        // Задание 4
        int perMin = 16/2;


        System.out.println("За 20 минут машина произвела " + (perMin * 20) + " штук бутылок ");
        System.out.println("За 24 часа машина произвела " + ((perMin * 60) * 24) + " штук бутылок ");
        System.out.println("За 3 дня машина произвела " + (((perMin * 60) * 24) * 3) + " штук бутылок ");
        System.out.println("За  месяц машина произвела " + ((((perMin * 60) * 24) * 3) * 31) + " штук бутылок ");

        // Задание 5

        int whiteColor = 2;
        int brownColor = 4;
        int allColorPaints = 120;

        System.out.println("В школе, где " + (allColorPaints / (whiteColor + brownColor)) + " классов, нужно "
                + ((allColorPaints / (whiteColor + brownColor)) * 2 +
                " банок белой краски и " + ((allColorPaints / (whiteColor + brownColor)) * 4) + " банок коричневой краски"));

        // Задание 6
        int oneBananW = 80;
        int oneMilkW = 105;
        int oneIcecream = 100;
        int oneEgg = 70;
        float breackfast;
        float breackfastKg;

        breackfast = (oneBananW * 5) + (oneMilkW * 2) + (oneIcecream * 2) + (oneEgg * 4);
        breackfastKg = breackfast / 1000 ;


        System.out.println("Вес завтрака в граммах: " + breackfast + " грамм ");
        System.out.println("Вес завтрака в килограммах: " + breackfastKg + " килограмм");

        // Задание 7
        int weightKg = 7;
        int gramm;
        int programma1 = 250;
        int programma2 = 500;

        gramm = weightKg * 1000;


        System.out.println("Потеря веса при программе '250гр за день' " + (gramm / programma1) + " дней ");
        System.out.println("Потеря веса при программе '500гр за день' " + (gramm / programma2) + " дней ");
        System.out.println("На потерю веса в среднем потребуется " + (((gramm / programma1) + (gramm / programma2)) / 2) + " дней ");

        // Задание 8
        float mashaSalary = 67760;
        float denisSalary = 83690;
        float kristinaSalary = 76230;


        System.out.println("Маша теперь получает: " + (mashaSalary + mashaSalary * 0.1f)  + " рублей в месяц. Годовой доход вырос на: "
                + (((mashaSalary + mashaSalary * 0.1f) * 12) - (mashaSalary * 12)) + "руб.");
        System.out.println("Денис теперь получает: " + (denisSalary + denisSalary * 0.1f) + " рублей в месяц. Годовой доход вырос на: "
                + (((denisSalary + denisSalary * 0.1f) * 12) - (denisSalary * 12)) + "руб.");
        System.out.println("Кристина теперь получает: " + (kristinaSalary + kristinaSalary * 0.1f) + " рублей в месяц. Годовой доход вырос на: "
                + (((kristinaSalary + kristinaSalary * 0.1f) * 12) - (kristinaSalary * 12)) + "руб.");

    }

}