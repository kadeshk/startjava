public class VariablesTheme {

    public static void main(String... args) {
        System.out.println("Задачки на тему \"Переменные: примитивные типы данных\"");
        System.out.println("Задание выполнил Александр sb2024@yandex.ru \n");
        System.out.println("1.Вывод значений переменных на консоль");
        byte coreNumber = 8;
        float hzNum = 1.2f;
        short ramMemoryNum = 16;
        String graphicsCoprocessorName = "NVIDIA GeForce RTX 3060";
        int graphicsCoprocessorNum = 2048 ;
        short ssdSize = 512;
        long hddSize = 1;
        char series = 'W';
        double weight = 10.23;
        boolean isTrue = true;

        System.out.println("Количество ядер: " + coreNumber);
        System.out.println("Частота процессора:  " + hzNum + " Гц");
        System.out.println("Объем оперативной памяти: " + ramMemoryNum + " ГБ");
        System.out.println("Объем памяти видеокарты: " + graphicsCoprocessorNum + " МБ");
        System.out.println("Общий объем накопителей SSD: " + ssdSize + " ГБ");
        System.out.println("Общий объем накопителей HDD: " + hddSize + " ТБ");
        System.out.println("Серия: " + series);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Наличие лицензионной версии: " + isTrue);

        System.out.println("\n 2.Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        float discount = 0.11f;
        float sumOfTheDiscount = (pen + book) * discount;
        float sumPriceOfAll = ((pen + book) - sumOfTheDiscount);

        System.out.println("I. Сумма скидки: " + sumOfTheDiscount + " руб");
        System.out.println("II. Общая стоимость товаров со скидкой: " + sumPriceOfAll + " руб");

        System.out.println("\n 3.Вывод слова JAVA");
        System.out.println("   J    a  v     v  a      ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a   ");

        System.out.println("\n 4.Вывод min и max значений целых числовых типов");
        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 922337203685477580l;
        System.out.println("Первоначальное значение");
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);

        System.out.println("Значение после инкремента");
        byteNum++;
        shortNum++;
        intNum++;
        longNum++;
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);

        System.out.println("Значение после декремента");
        byteNum--;
        shortNum--;
        intNum--;
        longNum--;
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);

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
        char char35 = '#';
        char char38 = '&';
        char char64 = '@';
        char char94 = '^';
        char char95 = '_';
        System.out.println("35 = " + char35);
        System.out.println("38 = " + char38);
        System.out.println("64 = " + char64);
        System.out.println("94 = " + char94);
        System.out.println("95 = " + char95);
        System.out.println("\n 7.Вывод в консоль ASCII-арт Дюка");
        char char92 = 92;
        System.out.println("    /" + char92 + "     ");
        System.out.println("   /  " + char92 + "    ");
        System.out.println("  /_( )" + char92 + "    ");
        System.out.println(" /      " + char92 + "   ");
        System.out.println("/____/" + char92 + "__" + char92 );
        System.out.println("\n 8.Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        int m = n/100;
        int v = n/10;
        int z = n - v*10;
        int sum = m + v + z;
        int prod = m * v * z;
        System.out.println("Число " + n + " содержит: " + m + " сотню " + v + " десятков " + z + " единиц");
        System.out.println("Сумма его цифр = " + sum + ", Произведение = " + prod);
        System.out.println("\n 9.Вывод времени");
        int time = 86399;
        int hours = time/60/60;
        int min = time/60%100;
        int sec = time%863;

        System.out.println(hours + ":" + min + ":" + sec);
    }
}