package com.ya;

public class JavaBasics {

    public static void main(String[] args) {

        // примитивный тип данных
        char sim = 'S';         // Символ, по умолчанию = сиволу '0'
        boolean boolFlag = true;       // используем как флаг, по умолчанию false
        byte sByte = 111;             // 128 to 127 = 8 bit (по ум 0)
        short sShort = 250;           // -32,768 to 32,767 = 16 bit (по ум 0)
        int sInt = 1000;            //2,147,483,648 to 2,147,483,647 = 32 bit (по ум 0)
        long sLong = 500505;       //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 = 64 bit (по ум 0)
        float sFloat = 13.215f;       // с плавающей точкой до 7 десят = 32 bit (по ум 0.0)
        double sDouble = 7.3566557;    // с плавающей точкой до 15 десят = 64 bit (по ум 0.0)

        String sText = "Ava";     // String - ссылочные данные

        // + сложение
        // - вычитание
        // * умножение
        // / деление (целочисленное!)
        // % взятие остатка от деления

        // логические операторы
        // & И (&&)
        // | Или (||)
        // ! Отрицание
        // != не равно
        // == равно
        // instanceof
        // > больше
        // >= больше или равно
        // < меньше
        // <= меньше или равно

        System.out.println("Сложение " + sByte + " и " + sInt + " = " + sum(sByte, sInt));
        System.out.println("Умножение " + sShort + " на " + sByte + " = " +  multiplication(sShort, sByte));
        System.out.println("Деление " + sLong + " на " + sByte + " = " + divide((int) sLong, sByte));
        System.out.println("Остаток " + sInt + " на " + 20 + " = " + ost(sInt, 20));
        System.out.println("Результат сложения " + sFloat + " и " + sDouble + " = " + sum(sFloat, sDouble));
        System.out.print(sText);

        //int i = Integer.MAX_VALUE + 10;//При переполнении в + меняется число на отрицательное и происходит вычитание
        //System.out.println(i);
        //long o = Integer.MAX_VALUE + 10L;//Преобразуем в лонг, чтобы пробить верхнее значение
        //System.out.println(o);
        //int p = Integer.MIN_VALUE - 20;//При переполнении в - меняется число на положительное и происходит вычитание
        //System.out.println(p);
        //long r = Integer.MIN_VALUE - 20L;//Преобразуем в лонг, чтобы пробить нижнее значение
        //System.out.println(r);

        System.out.println((++sByte) + 20);
        System.out.println((--sByte) + 20);
        System.out.println(sByte++);
        System.out.println(sByte);

    }

    static int sum(int a, int b) {
        return a + b;
    }
    static int multiplication(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
    static int ost(int a, int b) {
        return a % b;
    }
    static double sum(double a, double b) {
        return a + b;
    }
}
