import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание-1");
        System.out.println("Задание 1");
        byte age = 13;
        if (age >= 18) {System.out.println("Поздравляем! Вам есть 18 лет");}
        if (age < 18) {System.out.println("Вам еще нет 18 лет, стоит немного подождать");}

        System.out.println("Задание 2");
        byte person = 21;
        if (person >= 7 && person < 18) {System.out.println("Ребенок ходит в школу");}
        if (person >= 18 && person < 24) {System.out.println("Человек ходит в университет");}
        if (person >= 24) {System.out.println("Человек окончил университет и может идти работать");}

        System.out.println("Задание 3");
        byte seat = 105;
        if (seat >= 1 && seat < 60) {System.out.println("Есть сидчие места");}
        if (seat >= 60 && seat < 102) {System.out.println("Сидячих мест нет, есть стоячие места");}
        if (seat >= 102) {System.out.println("Вагон без мест");}

        System.out.print("Домашнее задание-2");
        System.out.print("Задание 1");

        byte ageElse = 13;
        if (ageElse >= 18) {System.out.println("Поздравляем! Вам есть 18 лет");}
        else {System.out.println("Вам еще нет 18 лет, стоит немного подождать");}

        System.out.println("Задание 2");
        byte personElse = 22;
        if (personElse >= 7 && personElse < 18) {System.out.println("Ребенок ходит в школу");}
        else
        if (personElse >= 18 && personElse < 24) {System.out.println("Человек ходит в университет");}
        else
        if (personElse > 24) {System.out.println("Человек окончил университет и может идти работать");}

        System.out.println("Задание 3");
        byte seatElse = 105;
        if (seatElse >= 1 && seat < 60) {System.out.println("Есть сидчие места");}
        else
            if (seatElse >= 60 && seat < 102) {System.out.println("Сидячих мест нет, есть стоячие места");}
        else
            if (seatElse >= 102) {System.out.println("Вагон без мест");}

        System.out.println("Домашнее задание-3");
            System.out.println("Задание 1");
            byte human = 4;
            if (human >= 2 && human < 6) {System.out.println("Если возраст человека равен " + human +
                    " то ему нужно ходить в детский сад");}
            if (human >= 7 && human < 18) {System.out.println("Если возраст человека равен " + human +
                    " то ему нужно ходить в школу");}
            if (human >= 19 && human < 24) {System.out.println("Если возраст человека равен " + human +
                    " то ему нужно ходить в универститет");}
            if (human >= 25) {System.out.println("Если возраст человека равен " + human +
                    " то ему пора работать");}

            System.out.println("Задание 2");
            byte child = 12;
            if (child <=4) {System.out.println("Ребенку " + child +
                    " лет, без сопровождения взрослого кататься запрещено");}
            if (child >= 5 && child < 13) {System.out.println("Ребенку " + child +
                    " лет, кататься можно только в сопровождении взрослого");}
            if (child >= 14) {System.out.println("Ребенку " + child +
                    " лет, кататься можно без сопровождения взрослого");}

            System.out.println("Задание 3");
            int one = 1;
            int two = 2;
            int three = 1;
            if (one < two && one < three && two < three)
            {System.out.println(three + " больше one и two");}
            else
            {System.out.println( three + " не больше one и two.");}












    }
}


