package Factory;

public class PresentFactory {
    public static void main(String[] args) {
        Figure figure = FigureFactory.getInstance("Circle");
        System.out.println(figure);
        Figure figureSecond = FigureFactory.getInstance("Triangle");
        System.out.println(figureSecond);
    }
}
