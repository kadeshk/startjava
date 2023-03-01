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

        int num = 8;
        System.out.println("Исходное число: " + num);

        if (num == 0) {
            System.out.println(" равно нулю");
        } else {
            if (num % 2 == 0) {
                System.out.println(" является чётным");
            } else {
                System.out.println(" является нечётным");
            }
            if (num > 0) {
                System.out.println(" является положительным");
            } else {
                System.out.println(" является отрицательным");
            }
        }

        System.out.println("\n 4.Поиск одинаковых цифр в числах");
        int num3 = 123;
        int num4 = 123;
        int num3Letter1 = num3 / 100;
        int num3Letter2 = num3 / 10 % 10;
        int num3Letter3 = num3 % 10;
        int num4Letter1 = num4 / 100;
        int num4Letter2 = num4 / 10 % 10;
        int num4Letter3 = num4 % 10;

        System.out.println("исходные числа:\n" + num3 + "\n" + num4);

        if (num3Letter1 != num4Letter1 && num3Letter2 != num4Letter2 &&
                num3Letter3 != num4Letter3) {
            System.out.println("одинаковых в них цифр нет");
        } else {
            if (num3Letter1 == num4Letter1) {
                System.out.println(num3Letter1 + " - одинаковое число" + "\nномер разряда - 1");
            }
            if (num3Letter2 == num4Letter2) {
                System.out.println(num3Letter2 + " - одинаковое число" + "\nномер разряда - 2");
            }
            if (num3Letter3 == num4Letter3) {
                System.out.println(num3Letter3 + " - одинаковое число" + "\nномер разряда - 3");
            }
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
        double percent = 5;

        if (deposit > 100000  && deposit <= 300000) {
            percent = 7;
        } else {
            if (deposit > 130000) {
            percent = 10;
            }
        }

        System.out.println("I. сумма вклада = " + deposit + "\nII. начисленный % = " + percent +
                " % \nIII. итоговая сумма с % = " + (deposit * (percent * 0.01 + 1)));

        System.out.println("\n 7.   Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade = 5;
        int programmingGrade = 5;

        if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        } else if (historyPercent < 60) {
            historyGrade = 2;
        }

        if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        } else if (programmingPercent < 60) {
            programmingGrade = 2;
        }

        System.out.println("История - " + historyGrade + "\n" + "Программирование - " +
                programmingGrade + "\n" + "Средний балл - " + 
                ((historyGrade + programmingGrade) / 2) + "\n" + 
                "Средний % - " + ((historyPercent + programmingPercent) / 2));

        System.out.println("\n 8.  Расчет прибыли за год");
        int officeRentPrice = 5000;
        int productPrice = 13000;
        int costPrice = 9000;
        int annualProfit = ((productPrice - costPrice) - officeRentPrice) * 12;

        if (annualProfit > 0) {
            System.out.println("прибыль за год: +" + annualProfit + " руб");
        } else {
            System.out.println("прибыль за год: " + annualProfit + " руб");
        }

        System.out.println("\n 9.   Подсчет количества банкнот");
        int needfulMoney = 567;
        int needfulHundreds = needfulMoney / 100;
        int needfulTens = needfulMoney / 10 % 10;
        int needfulOnes = needfulMoney % 10;
        int availableHundreds = 10;
        int availableTens = 5;
        int availableOnes = 50;
        int usingHundreds;
        int usingTens;
        int usingOnes;

        if (needfulHundreds <= availableHundreds && needfulTens <= availableTens && 
                    needfulOnes <= availableOnes) {
        usingHundreds = needfulHundreds;
        usingTens = needfulTens;
        usingOnes = needfulOnes;
        } else {
            if (needfulHundreds <= availableHundreds && needfulTens <= availableTens && 
                        needfulOnes > availableOnes) {
        usingHundreds = needfulHundreds;
        usingTens = availableTens;
        usingOnes = needfulOnes + ((needfulTens - availableTens) * 10);
            } else {
            System.out.println ("требуемого количества банкнот нет");
            }
        }

        System.out.println ("i. номиналы банкнот: \n i. 10 банкнот номиналом 100" + 
                "\n ii. 5 банкнот номиналом 10 \n iii.    50 банкнот номиналом 1" + 
                "\n ii.    требуемое их количество: \n " + needfulHundreds + 
                " банкнот номиналом 100 \n" + needfulTens + " банкнот номиналом 10 \n" + 
                needfulOnes + " банкнот номиналом 1 \n" + "iii. выдаваемая сумма: \n" + 
                + usingHundreds + " банкнот номиналом 100 \n" + usingTens + 
                " банкнот номиналом 10 \n" + usingOnes + " банкнот номиналом 1");
    }
}








