public class IfElseStatementTheme {   

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java (это название задачи)");
        int age = 30;
        boolean maleSex = true;
        double height = 2.5;
        char capitalLetter;

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
        int checkingNum = -1;

        if (checkingNum == 0) {
            System.out.println("число " + checkingNum + " равно нулю");
        } else if (checkingNum % 2 == 0 && checkingNum > 0) {
            System.out.println("число " + checkingNum +" является чётным и положительным");
        } else if ((checkingNum % 2) == 0 && checkingNum < 0) {
            System.out.println("число " + checkingNum + " является чётным и отрицательным");
        } else if (checkingNum < 0) {
            System.out.println("число " + checkingNum + " является нечётным и отрицательным");
        } else if (checkingNum > 0) {
            System.out.println("число " + checkingNum + " является нечётным и положительным");
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

        if (sameNum1Letter1 == sameNum2Letter1 && sameNum1Letter2 == sameNum2Letter2 && 
                    sameNum1Letter3 == sameNum2Letter3) { 
            System.out.println("i.  исходные числа:\n" + sameNum1 + "\n" + sameNum2 +
                    "\n ii. одинаковые в них цифры \n" + sameNum1Letter1 + "\n" + sameNum1Letter2 +
                    "\n" + sameNum1Letter3 + "\n iii. номера разрядов \n" + "1,2,3");
        } else if (sameNum1Letter1 == sameNum2Letter1 && sameNum1Letter2 == sameNum2Letter2) {
            System.out.println("i.  исходные числа:\n" + sameNum1 + "\n" + sameNum2 +
                    "\n ii. одинаковые в них цифры \n" + sameNum1Letter1 + "\n" + sameNum1Letter2 +
                    "iii. номера разрядов \n" + "1,2");
        } else if (sameNum1Letter1 == sameNum2Letter1 && sameNum1Letter3 == sameNum2Letter3) {
            System.out.println("i.  исходные числа:\n" + sameNum1 + "\n" + sameNum2 +
                    "\n ii. одинаковые в них цифры \n" + sameNum1Letter1 + "\n" + sameNum1Letter3 +
                    "\n iii. номера разрядов \n" + "1,3");
        } else if (sameNum1Letter2 == sameNum2Letter2 && sameNum1Letter3 == sameNum2Letter3) {
            System.out.println("i.  исходные числа:\n" + sameNum1 + "\n" + sameNum2 +
                    "\n ii. одинаковые в них цифры \n" + sameNum1Letter2 + "\n" + sameNum1Letter3 +
                    "\n iii. номера разрядов \n" + "2,3");
        } else if (sameNum1Letter1 == sameNum2Letter1) {
            System.out.println("i.  исходные числа:\n" + sameNum1 + "\n" + sameNum2 +
                    "\n ii. одинаковые в них цифры \n" + sameNum1Letter1+
                    "\n iii. номера разрядов \n" + "1");
        } else if (sameNum1Letter2 == sameNum2Letter2) {
            System.out.println("i.  исходные числа:\n" + sameNum1 + "\n" + sameNum2 +
                    "\n ii. одинаковые в них цифры \n" + sameNum1Letter2 +
                    "iii. номера разрядов \n" + "2");
        } else if (sameNum1Letter3 == sameNum2Letter3) {
            System.out.println("i.  исходные числа:\n" + sameNum1 + "\n" + sameNum2 +
                    "\n ii. одинаковые в них цифры \n" + sameNum1Letter3+
                    "\n iii. номера разрядов \n" + "3");
        }

        System.out.println("\n 5.Определение символа по его коду");
        char definingSymbol = '\u0057';

        if (definingSymbol >= '0' && definingSymbol <= '9') {
        System.out.println(definingSymbol + " является числом");
        } else if (definingSymbol >= 'a' && definingSymbol <= 'z') {
        System.out.println(definingSymbol + " является маленькой буквой");
        } else if (definingSymbol >= 'A' && definingSymbol <= 'Z') {
        System.out.println(definingSymbol + " является заглавной буквой");
        } else 
        System.out.println(definingSymbol + " не является ни буквой, ни числом");

        System.out.println("\n 6.Подсчет суммы вклада и начисленных банком %");
        int deposit = 300000;
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


