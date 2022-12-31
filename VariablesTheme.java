        System.out.println("8.Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        int x = n/100;
        int y = n/10;
        int z = n/1;
        int sum = x + y + z;
        int prod = x * y * z;
        System.out.println("Число " + n + " содержит: " + x + " сотен " + y + " десятков " + z + " единиц");
        System.out.println("Сумма его цифр = " + sum + ", Произведение = " + prod);
    }
}