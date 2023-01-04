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
        int m = 456;
        int n1 = n / 100;
        int n2 = n / 10 % 10;
        int n3 = n % 100;
        int m1 = m / 100;
        int m2 = m / 10 % 10;
        int m3 = m % 100;

        if (n1 = m1) { 
            else if (n2 = m2) {
            else if (n3 = m3) {

            }

            }
        }
        System.out.println("Исходные числа \n n = " + n + "\n m = " + m);
        System.out.println("\n II. Одинаковые в них цифры \n ");
        System.out.println("\n III. Номера разрядов");
        }

        System.out.println("\n 5.Определение символа по его коду");
        char p = '\u0057';
        System.out.println("p = " + p);


        System.out.println("\n 6.Подсчет суммы вклада и начисленных банком %");
        int bank = 300000;
        if (bank < 100000) {
            (bank*0.05 + bank);
        } else if (bank > 100000 ) {

        }
        System.out.println("\n сумма вклада = " + bank + "\n II. начисленный % = " + + "\n итоговая сумма с % = " + );

        System.out.println("\n 7.   Определение оценки по предметам");

        int historyPoints = 59;
        int programmingPoints = 91;
        string historyName = "История - ";
        string programmingName = "Программирование - ";
        string averagePoint = "Средний балл";
        string averagePercentage = "Средний %";
        char historyGrade;
        char programmingGrade;

        if (historyPoints > 91) {
            historyGrade = '5';
        } else if (historyPoints > 73) {
            historyGrade = '4';
        } else if (historyPoints > 60) {
            historyGrade = '3';
        } else if (historyPoints <= 60) {
            historyGrade = '2';
        }

                if (historyPoints > 91) {
            historyGrade = '5';
        } else if (historyPoints > 73) {
            historyGrade = '4';
        } else if (historyPoints > 60) {
            historyGrade = '3';
        } else if (historyPoints <= 60) {
            historyGrade = '2';
        }
        System.out.println("Grade = " + grade);

}