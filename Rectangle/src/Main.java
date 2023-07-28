public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(13.2, 7.0);
        rectangle1.setWidth(3.0);
        rectangle1.setHeight(5.0);
        System.out.println("Прямоугольник 1:");
        System.out.println("Ширина = " + rectangle1.getWidth() + ", Высота = " + rectangle1.getHeight());
        System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle1.calculatePerimeter());
        System.out.println();


        System.out.println("Прямоугольник 2:");
        System.out.println("Ширина = " + rectangle2.getWidth() + ", Высота = " + rectangle2.getHeight());
        System.out.println("Площадь прямоугольника: " + rectangle2.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle2.calculatePerimeter());
    }
}