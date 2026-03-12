public class Main {
    public static void main(String[] args) {

        // Задание 1
        int iint = 10000;
        byte by= -120;
        short sh = 30000;
        long lo= 90000000L;
        float fl = 3.1415f;
        double doub= 6.2830d;

        System.out.println("Значение переменной iint c типом Int равно " + iint);
        System.out.println("Значение переменной by c типом byte равно " + by);
        System.out.println("Значение переменной sh c типом short равно " + sh);
        System.out.println("Значение переменной lo c типом long равно " + lo);
        System.out.println("Значение переменной fl c типом float равно " + fl);
        System.out.println("Значение переменной doub c типом double равно " + doub);


        // Задание 2
        double d = 27.12;
        long l = 987678965549L;
        float f = 2.786f;
        short s = 569;
        int i = -159;
        int i1 = 27897;
        byte c = 67;

        // Задание 3
        int lpStudent= 23;
        int aStudent = 27;
        int eaStudent = 30;
        int allPapers = 480;
        int eachPapers = allPapers / (lpStudent + aStudent + eaStudent);

        System.out.println("На каждого ученика рассчитано " + eachPapers + " листов бумаги");

        // Задание 4
        int perMin = 16/2;
       // int perTwentyMin = perMin * 20;
       // int perHour = perMin * 60;
       // int perDay = perHour * 24;
       // int perThreeDays = perDay * 3;
       // int perMonth = perDay * 31;

        System.out.println("За 20 минут машина произвела " + (perMin * 20) + " штук бутылок ");
        System.out.println("За 24 часа машина произвела " + ((perMin * 60) * 24) + " штук бутылок ");
        System.out.println("За 3 дня машина произвела " + (((perMin * 60) * 24) * 3) + " штук бутылок ");
        System.out.println("За  месяц машина произвела " + ((((perMin * 60) * 24) * 3) * 31) + " штук бутылок ");

        // Задание 5
        //int allClasses;
        int whiteColor = 2;
        int brownColor = 4;
        int allColorPaints = 120;
        //int oneClassWhite;
        //int oneClassBrowm;
        // Сколько всего классов
        //allClasses = allColorPaints / (whiteColor + brownColor); // 120 / (2+4) = 20 классов

        //На одмн класс - 20*2 + 20*4
        // oneClassWhite = allClasses * 2;
        //oneClassBrowm = allClasses * 4;
        System.out.println("В школе, где " + (allColorPaints / (whiteColor + brownColor)) + " классов, нужно "
                + ((allColorPaints / (whiteColor + brownColor)) * 2 +
                " банок белой краски и " + ((allColorPaints / (whiteColor + brownColor)) * 4) + " банок коричневой краски"));

        // Задание 6
        int oneBananW = 80;
        int oneMilkW = 105;
        int oneIcecream = 100;
        int oneEgg = 70;
       // float breackfast;
       // float breackfastKg;

      //  breackfast = (oneBananW * 5) + (oneMilkW * 2) + (oneIcecream * 2) + (oneEgg * 4);
      //  breackfastKg = breackfast / 1000 ;


        System.out.println("Вес завтрака в граммах: " + ((oneBananW * 5) + (oneMilkW * 2) + (oneIcecream * 2) + (oneEgg * 4))
                + " грамм ");
        System.out.println("Вес завтрака в килограммах: " + (((oneBananW * 5) + (oneMilkW * 2) + (oneIcecream * 2)
                + (oneEgg * 4)) / 1000 ) + " килограмм");

        // Задание 7
        int weightKg = 7;
        int gramm;
        int programma1 = 250;
        int programma2 = 500;
/*        int days1;
        int days2;
        int days3;
*/
        gramm = weightKg * 1000;
/*
        days1 = gramm / programma1;
        days2 = gramm / programma2;
        days3 = (days1 + days2) / 2;
*/

        System.out.println("Потеря веса при программе '250гр за день' " + (gramm / programma1) + " дней ");
        System.out.println("Потеря веса при программе '500гр за день' " + (gramm / programma2) + " дней ");
        System.out.println("На потерю веса в среднем потребуется " + (((gramm / programma1) + (gramm / programma2)) / 2) + " дней ");

        // Задание 8
        float masha = 67760;
        float denis = 83690; //увеличить зп на 10%
        float kristina = 76230; //увеличить зп на 10%

    /*    float yearMashaBefore;
        float yearMashaAfter;

        float yearDenisBefore;
        float yearDenisAfter;

        float yearKristinaBefore;
        float yearKristinaAfter;

       // yearMashaBefore = masha * 12;
       // yearMashaAfter = (masha + masha * 0.1f) * 12;
       // yearMashaAfter = masha * 12;

        yearDenisBefore = denis * 12;
        yearDenisAfter = (denis + denis * 0.1f) * 12;
        //yearDenisAfter = denis * 12;

        yearKristinaBefore = kristina * 12;
        yearKristinaAfter =(kristina + kristina * 0.1f) * 12;
        //yearKristinaAfter= kristina * 12;
*/
        System.out.println("Маша теперь получает: " + (masha + masha * 0.1f)  + " рублей в месяц. Годовой доход вырос на: "
                + (((masha + masha * 0.1f) * 12) - (masha * 12)) + "руб.");
        System.out.println("Денис теперь получает: " + (denis + denis * 0.1f) + " рублей в месяц. Годовой доход вырос на: "
                + (((denis + denis * 0.1f) * 12) - (denis * 12)) + "руб.");
        System.out.println("Кристина теперь получает: " + (kristina + kristina * 0.1f) + " рублей в месяц. Годовой доход вырос на: "
                + (((kristina + kristina * 0.1f) * 12) - (kristina * 12)) + "руб.");

    }

}