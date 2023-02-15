public class IfElseStatementTheme {   

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 30;
        boolean maleSex = true;
        double height = 2.5;
        char capitalLetter = "Name".charAt(0);

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

        capitalLetter = "Name".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Ваше имя начинается с М");
        } else if (capitalLetter == 'I') {
            System.out.println("Ваше имя начинается с I");
        } else {
            System.out.println("Ваше имя начинается не с M и I");
        }  

        System.out.println("\n 2.Поиск max и min числа");
        int num1 = 1;
        int num2 = 5;

        if (num1 == num2) {
            System.out.println("num1 и num2 равны");
        } else if (num1 > num2) {
            System.out.println("max является num1 = " + num1 + ", min является num2 = " + num2);
        } else {
            System.out.println("max является num2 = " + num2 + ", min является num1 = " + num1 );
        }

        System.out.println("\n 3.Проверка числа");
        int num = -78;

        System.out.println("Исходное число: " + num);
        if (num == 0) {
            System.out.println(" равно нулю");
        } else if (num % 2 == 0) {
                    if (num < 0)
            System.out.println(num + " является чётным и отрицательным");
        } else {
            System.out.println(num + " является чётным и положительным");
        } if (num % 2 != 0) {
                    if (num < 0) {
            System.out.println(num + " является чётным и отрицательным");
        } else {
            System.out.println(num + " является чётным и положительным");
        }
    }

        System.out.println("\n 4.Поиск одинаковых цифр в числах");
        int sameNum1 = 380;
        int sameNum2 = 180;
        int sameNum1Letter1 = sameNum1 / 100;
        int sameNum1Letter2 = sameNum1 / 10 % 10;
        int sameNum1Letter3 = sameNum1 % 10;
        int sameNum2Letter1 = sameNum2 / 100;
        int sameNum2Letter2 = sameNum2 / 10 % 10;
        int sameNum2Letter3 = sameNum2 % 10;

        System.out.println("i.  исходные числа:\n" + sameNum1 + "\n" + sameNum2);

        if (sameNum1Letter1 == sameNum2Letter1) {
            System.out.println(sameNum1Letter1 + " - одинаковое число" + "\nномер разряда - 1");
        }

        if (sameNum1Letter2 == sameNum2Letter2) {
            System.out.println(sameNum1Letter2 + " - одинаковое число" + "\nномер разряда - 2");
        }

        if (sameNum1Letter3 == sameNum2Letter3) {
            System.out.println(sameNum1Letter3 + " - одинаковое число" + "\nномер разряда - 3");
        }

        if (sameNum1Letter1 != sameNum2Letter1 && sameNum1Letter2 != sameNum2Letter2 &&
                sameNum1Letter3 != sameNum2Letter3) {
            System.out.println("одинаковых в них цифр нет");
        }

        System.out.println("\n 5.Определение символа по его коду");
        char someSymbol = '\u0057';

        if (someSymbol >= '0' && someSymbol <= '9') {
            System.out.println(someSymbol + " является числом");
        } else if (someSymbol >= 'a' && someSymbol <= 'z') {
            System.out.println(someSymbol + " является маленькой буквой");
        } else if (someSymbol >= 'A' && someSymbol <= 'Z') {
            System.out.println(someSymbol + " является заглавной буквой");
        } else {
            System.out.println(someSymbol + " не является ни буквой, ни числом");
        }

        System.out.println("\n 6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 100000;
        int percent;

        if (deposit < 100000) {
            percent = 5;
        } else if (deposit > 100000  && deposit <= 300000) {
            percent = 7;
        } else {
            percent = 10;
        }

        System.out.println("I. сумма вклада = " + deposit + "\nII. начисленный % = " + percent +
                " % \nIII. итоговая сумма с % = " + (deposit * (percent * 0.01 + 1)));

        System.out.println("\n 7.   Определение оценки по предметам");
        int historyPoints = 59;
        int programmingPoints = 91;
        int historyGrade = 3;
        int programmingGrade = 5;

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

        if (annualProfit > 0) {
            System.out.println("i.   прибыль за год:" + "+" + annualProfit);
        } else {
            System.out.println("i.   прибыль за год:" + annualProfit);
        }

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



