public class Main {
    public static void main(String[] args) {
    Cat cat = new Cat("Барсик", 4);
    cat.greet();
    Rectangle rectangle = new Rectangle(5, 10);
    System.out.println("Площадь прямоугольника со сторонами: " + rectangle.getWidth() + " и " + rectangle.getHeight() + " равна " + rectangle.calculateArea() + ".");
    System.out.println("Периметр прямоугольника со сторонами: " + rectangle.getWidth() + " и " + rectangle.getHeight() + " равен " + rectangle.calculatePerimeter() + ".");
    }
}
