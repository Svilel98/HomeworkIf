public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte temperature = -3;
        if (temperature < 7) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно.");
        }
    }

    public static void task4() {
        byte age = 29;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + " то ему пора спать.");
        } else if (2 <= age && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
        } else if (7 <= age && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
        } else if (18 < age && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете.");
        } else if (24 < age && age <= 60) {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он может отдохнуть.");
        }
    }

    public static void task5() {
        byte age = 7;
        byte adult = 0;
        boolean adultWith = adult > 0;
        if (age < 5 || (5 <= age && age < 14 && !adultWith)) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе.");
        } else if (5 <= age && age < 14 && adultWith) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе в сопровождении.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно без сопровождения взрослого");
        }
    }

    public static void task6() {
        byte wagonCapacity = 102;
        byte seatPlace = 60;
        byte personSequence = 102;
        if (personSequence > wagonCapacity) {
            System.out.println("Вагон уже полностью забит.");
        } else if (personSequence > seatPlace) {
            System.out.println("В вагоне есть стоячее место.");
        } else {
            System.out.println("В вагоне есть сидячее место.");
        }
    }

    public static void task7() {
        int one = 5;
        int two = 1000000;
        int three = 300000000;
        if (one > two && one > three) {
            System.out.println(one + " наибольшее число из трех");
        } else if (two > three) {
            System.out.println(two + " наибольшее число из трех");
        } else {
            System.out.println(three + " наибольшее число из трех");
        }
    }
    }