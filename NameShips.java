package com.company;

public class NameShips extends  Discount{
    private static String name1 = "Lokusta";
    private static String name2;

    public static String largestToday(){
        System.out.println("Найбільші кораблі сьогодні: "+name1+ " " + name2);
        String largestShips = name1+" "+name2;
        return largestShips;


    }
    public static void allTime(){
        System.out.println("Найбільші кораблі за весь час "+largestToday());

    }

    public static String getName1() {
        return name1;
    }

    public static void setName1(String name1) {

        NameShips.name1 = name1;
    }

    public static String getName2() {
        return name2;
    }

    public static void setName2(String name2) {
        NameShips.name2 = name2;
    }


    @Override
    public void discount() {
        System.out.println("Наближаються Новорічні свята,всім користувачам знижка 5%");
    }
}
