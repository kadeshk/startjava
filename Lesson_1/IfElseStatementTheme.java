public class IfElseStatementTheme {   

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java (это название задачи)");
        int age = 30;
        boolean maleSex = true;
        double height = 2.5;
        char letterName1;

        if (age > 20) {
            System.out.println("Вам больше 20 лет");
        } else {
            System.out.println ("Вам менее 20 лет");
        }

        if (!maleSex) {
            System.out.println("Мужской пол");
        } else {
            System.out.println ("Женский пол");
        }

        if(height < 1.80) {
            System.out.println("Ваш рост больше 180 м");
        } else {
            System.out.println("Ваш рост меньше 180 м ");
        }

        letterName1 = "Name".charAt(0);
        if (letterName1 == 'M') {
            System.out.println("Ваше имя начинается с М");
        } else if (letterName1 == 'I') {
            System.out.println("Ваше имя начинается с I");
        } else {
            System.out.println("Ваше имя начинается не с M и I");
        }  

        System.out.println("\n 2.Поиск max и min числа");
        int x = 1;
        int y = 5;

        if (x == y) {
            System.out.println("x и y равны");
        } else if (x > y) {
            System.out.println("max является x = " + x + ", min является y = " + y );
        } else {
            System.out.println("max является y = " + y + ", min является x = " + x );
        }

        System.out.println("\n 3.Проверка числа");
        int c = 0;

        System.out.println("\n Исходное число:" + c);
        if (c == 0) {
            System.out.println("число с равно нулю");
        } else if ((c%2)==0) {
            System.out.println("число c является чётным");
        } else if (c > 0) {
            System.out.println("число c является положительным");
        } else {
            System.out.println("число c является нечётным и отрицательным");
        }

        System.out.println("\n 4.Поиск одинаковых цифр в числах");
        int n = 321;
        int m = 426;
        int n1 = n / 100;
        int n2 = n / 10 % 10;
        int n3 = n % 100;
        int m1 = m / 100;
        int m2 = m / 10 % 10;
        int m3 = m % 100;

        if (n1 == m1) { 
            System.out.println(n1 + " одинаковое число 1-ого разряда");
        } else if (n2 == m2) {
            System.out.println(n2 + " одинаковое число 2-ого разряда");
        } else if (n3 == m3) {
            System.out.println(n3 + " одинаковое число 3-его разряда");
        } else {
            System.out.println("\n Одинаковых цифр нет");
        }

        System.out.println("\n 5.Определение символа по его коду");
        char p = '\u0057';

        if (p >= '0' && p <= '9') {
        System.out.println(p + " является числом");
        } else if (p >= 'a' && p <= 'z') {
        System.out.println(p + " не является заглавной буквой");
        } else if (p >= 'A' && p <= 'Z') {
        System.out.println(p + " является заглавной буквой");
        } else 
        System.out.println(p + " не является ни заглавной буквой, ни числом");

        System.out.println("\n 6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
        int percentLess100000 = 5;
        int percentLess300000 = 7;
        int percentMore300000 = 10;
        double percentLess100000TotalSum = 1.05;
        double percentLess300000TotalSum = 1.07;
        double percentMore300000TotalSum = 1.1;

        if (deposit < 100000) {
            System.out.println("сумма вклада = " + deposit + "\n II. начисленный % = " + 
                percentLess100000 + "\n итоговая сумма с % = " + 
                (deposit * percentLess100000TotalSum));
        } else if (deposit > 100000  && deposit <= 300000) {
            System.out.println("сумма вклада = " + deposit + "\n II. начисленный % = " + 
                percentLess300000 + "\n итоговая сумма с % = " + 
                (deposit * percentLess300000TotalSum));
        } else if (deposit > 300000) {
            System.out.println("сумма вклада = " + deposit + "\n II. начисленный % = " + 
                percentMore300000 + "\n итоговая сумма с % = " + 
                (deposit * percentMore300000TotalSum));
        }

        System.out.println("\n 7.   Определение оценки по предметам");
        int historyPoints = 59;
        int programmingPoints = 91;
        int historyGrade;
        int programmingGrade;

        if (historyPoints > 91) {
            historyGrade = 5;
        } else if (historyPoints > 73) {
            historyGrade = 4;
        } else if (historyPoints > 60) {
            historyGrade = 3;
        } else {
            historyGrade = 2;
        }

        if (programmingPoints > 91) {
            programmingGrade = 5;
        } else if (programmingPoints > 73) {
            programmingGrade = 4;
        } else if (programmingPoints > 60) {
            programmingGrade = 3;
        } else {
            programmingGrade = 2;
        }

        System.out.println("История - " + historyGrade + "\n" + "Программирование - " +
                programmingGrade + "\n" + "Средний балл - " + 
                ((historyGrade + programmingGrade) / 2) + "\n" + 
                "Средний % - " + ((historyPoints + programmingPoints) / 2));


        System.out.println("\n 8.  Расчет прибыли за год");
        int officeRentPrice = 5000;
        int productPrice = 13000;
        int costPrice = 9000;
        int annualProfit = ((productPrice - costPrice) - officeRentPrice) * 12;

        System.out.println("i.   прибыль за год:" + annualProfit);

        System.out.println("\n 9.   Подсчет количества банкнот");
        int needfulmoney = 567;
        int needfulhundreds = needfulmoney / 100;
        int needfultens = needfulmoney / 10 % 10;
        int needfulones = needfulmoney % 10;
        int availablehundreds = 10;
        int availabletens = 5;
        int availableones = 50;
        int usinghundreds;
        int usingtens;
        int usingones;

        if (needfulhundreds <= availablehundreds && needfultens <= availabletens && 
                    needfulones <= availableones) {
        usinghundreds = needfulhundreds;
        usingtens = needfultens;
        usingones = needfulones;
        } else {
        usinghundreds = needfulhundreds;
        usingtens = availabletens;
        usingones = needfulones + ((needfultens - availabletens) * 10);
        }

        System.out.println ("i. номиналы банкнот: \n i. 10 банкнот номиналом 100" + 
                "\n ii. 5 банкнот номиналом 10 \n iii.    50 банкнот номиналом 1" + 
                "\n ii.    требуемое их количество: \n " + needfulhundreds + 
                " банкнот номиналом 100 \n" + needfultens + " банкнот номиналом 10 \n" + 
                needfulones + " банкнот номиналом 1 \n" + "iii. выдаваемая сумма: \n" + 
                + usinghundreds + " банкнот номиналом 100 \n" + usingtens + 
                " банкнот номиналом 10 \n" + usingones + " банкнот номиналом 1");
    }
}


