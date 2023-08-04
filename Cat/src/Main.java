import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Барсик", 3));
        cats.add(new Cat("Мурка", 5));
        cats.add(new Cat("Дуська", 1));
        cats.add(new Cat("Шарик", 15));
        cats.add(new Cat("Вилли", 4));

        // Сортировка котов по возрасту с использованием CatComparator
        Collections.sort(cats, new CatComparator());

        // Вывод котов в отсортированном порядке
        for (Cat cat : cats) {
            System.out.println(cat.getName() + ": " + cat.getAge() + " года(лет)");
        }
    }
}