package Factory;

public abstract class Figure {
    public abstract String getName();
    @Override
    public String toString()
    {
        return "Figure: " + this.getName();
    }
}
