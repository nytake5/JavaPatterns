package Factory;

public class FigureFactory {
    public static Figure getInstance(String type)
    {
        switch (type){
            case "Circle":
                return new Circle();
            case "Triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}
