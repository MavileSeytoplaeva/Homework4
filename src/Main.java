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
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 17;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 59;
        int speedLimit = 60;
        if (speed > speedLimit) {
            System.out.println("Если скорость "+speed+", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 7;
        boolean haveToGoToKindergarten = age > 2 && age <= 6;
        boolean haveToGoToSchool = age >= 7 && age <= 18;
        boolean haveToGoToUniversity = age > 18 && age <= 24;
        if (haveToGoToKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (haveToGoToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (haveToGoToUniversity) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 18;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int sittingPlaces = 60;
        int standingPlaces = wagonCapacity - sittingPlaces;
        int newPassengers = 103;
        if (newPassengers < sittingPlaces) {
            System.out.println("Для новых "+newPassengers+" пассажиров есть "+sittingPlaces+" сидячих мест");
        } else if (newPassengers > sittingPlaces && newPassengers < wagonCapacity ) {
            System.out.println("Для новых "+newPassengers+" пассажиров есть "+sittingPlaces+" сидячих и "+standingPlaces+" стоячих мест");
        } else if (newPassengers > wagonCapacity) {
            System.out.println("Вагон полный. Для новых "+newPassengers+" пассажиров нет места.") ;
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 4;
        int two = 67;
        int three = 893;
        if (one > two) {
            if (one >= three ) {
                System.out.println("Самое большое число - "+ one);
            } else {
                System.out.println("Самое большое число - "+ three);
            }
        } else if (two > one ) {
            if (two >= three) {
                System.out.println("Самое большое число - "+ two);
            } else {
                System.out.println("Самое большое число - "+ three);
            }
        } else {
            if (one > three) {
                System.out.println("Самое большое число - " + one);
            } else if (three > one) {
                System.out.println("Самое большое число - " + three);
            } else {
                System.out.println("Все 3 числа равны.");
            }
        }
    }
}