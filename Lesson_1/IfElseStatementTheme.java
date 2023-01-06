public class IfElseStatementTheme {   

    public static void main(String[] args) {
        System.out.println("Задачки на тему Ветвление: if-else");
        System.out.println("Выполнил Александр sb2024@yandex.ru");
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

        if (n1 == m1 ) { 
        System.out.println(n1 + " одинаковое число 1-ого разряда");
        } else if(n2 == m2) {
        System.out.println(n2 + " одинаковое число 2-ого разряда");
        } else if(n3 == m3) {
        System.out.println(n3 + " одинаковое число 3-его разряда");
        } else {
        System.out.println("\n Одинаковых цифр нет");
        }
                
        System.out.println("\n 8.  Расчет прибыли за год");
        int officeRentPrice = 5000;
        int productPrice = 13000;
        int costPrice = 9000;

        int annualProfit = ((productPrice - costPrice) - officeRentPrice) * 12;  
        System.out.println("i.   прибыль за год:" + annualProfit);
    }
}
