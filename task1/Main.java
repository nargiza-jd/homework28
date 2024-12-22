package kg.attractor.java.task1;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        // cats.sort(?);
        // Printer.print(cats);
        cats.sort(Comparator.comparingInt(Cat::getAge));
        System.out.println("Sorted by Age:");
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getName));
        System.out.println("Sorted by Name:");
        Printer.print(cats);

        Printer.printAverageAge(cats);
    }

}
