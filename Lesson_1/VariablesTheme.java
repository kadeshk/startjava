public class VariablesTheme {

    public static void main(String... args) {
        System.out.println("Задачки на тему \"Переменные: примитивные типы данных\"");
        System.out.println("Задание выполнил Александр sb2024@yandex.ru \n");
        System.out.println("1.Вывод значений переменных на консоль");
        byte coreNum = 8;
        float ghzNum = 1.2f;
        short ramNum = 16;
        String graphicsCoprocessorName = "NVIDIA GeForce RTX 3060";
        int graphicsCoprocessorNum = 2048 ;
        short ssdSize = 512;
        long hddSize = 1;
        char series = 'W';
        double weight = 10.23;
        boolean licenseStatus = true;

        System.out.println("Количество ядер: " + coreNum);
        System.out.println("Частота процессора:  " + ghzNum + " Гц");
        System.out.println("Объем оперативной памяти: " + ramNum + " ГБ");
        System.out.println("Объем памяти видеокарты: " + graphicsCoprocessorNum + " МБ");
        System.out.println("Общий объем накопителей SSD: " + ssdSize + " ГБ");
        System.out.println("Общий объем накопителей HDD: " + hddSize + " ТБ");
        System.out.println("Серия: " + series);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Наличие лицензионной версии: " + licenseStatus);

        System.out.println("\n 2.Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        float discount = 0.11f;
        float discountSum = (penPrice + bookPrice) * discount;
        float discountPrice = ((penPrice + bookPrice) - discountSum);

        System.out.println("I. Сумма скидки: " + discountSum + " руб");
        System.out.println("II. Общая стоимость товаров со скидкой: " + discountPrice + " руб");

        System.out.println("\n 3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n 4.Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 922337203685477580l;
        System.out.println("Первоначальное значение \n" + byteMax + "\n" + shortMax + "\n" + intMax + "\n" + longMax);

        byteMax++;
        shortMax++;
        intMax++;
        longMax++;
        System.out.println("\n Значение после инкремента \n" + byteMax + "\n" + shortMax + "\n" + intMax + "\n" + longMax);

        byteMax--;
        shortMax--;
        intMax--;
        longMax--;
        System.out.println("\n Значение после декремента \n" + byteMax + "\n" + shortMax + "\n" + intMax + "\n" + longMax);

        System.out.println("\n 5.Перестановка значений переменных");
        int x = 2;
        int y = 5;

        System.out.println("x = " + x + ", y = " + y + ".");
        System.out.println("I. C помощью третьей переменной");
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y + ".");
        System.out.println("II. C помощью арифметических операций");
        x += y;
        y = x - y;
        x -= y;
        System.out.println("x = " + x + ", y = " + y + ".");
        System.out.println("III. C помощью побитовой операции ^");
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("x = " + x + ", y = " + y + ".");

        System.out.println("\n 6.Вывод символов и их кодов");
        char char35 = 35;
        char char38 = 38;
        char char64 = 64;
        char char94 = 94;
        char char95 = 95;

        System.out.println("35 = " + char35);
        System.out.println("38 = " + char38);
        System.out.println("64 = " + char64);
        System.out.println("94 = " + char94);
        System.out.println("95 = " + char95);

        System.out.println("\n 7.Вывод в консоль ASCII-арт Дюка");
        char char92 = 92;
        String str = ("    /" + char92 + "\n   /  " + char92 + "\n  /_( )" + char92 + "\n /      " + char92 + "\n/____/" + char92 + "__" + char92);
        System.out.println(str);

        System.out.println("\n 8.Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = num / 10;
        int ones = num % 10;
        int sum = hundreds + tens + ones;
        int multiplication = hundreds * tens * ones;
        System.out.println("Число " + num + " содержит: " + hundreds + " сотню " + tens + " десятков " + ones + " единицы");
        System.out.println("Сумма его цифр = " + sum + ", Произведение = " + multiplication);
     
        System.out.println("\n 9.Вывод времени");
        int time = 86399;
        int hours = time / 60 / 60;
        int min = time / 60 % 100;
        int sec = time % 60;

        System.out.println(hours + ":" + min + ":" + sec);
    }
}