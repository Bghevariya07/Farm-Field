package Foods;

public class Vegetable extends Food{

    public Vegetable(String name, double sellPrice, int daysToMature, int requiredArea)
    {
        super(name, sellPrice, daysToMature, requiredArea);
    }

    public double grow(Soil soil) {
        if (preferredSoil != soil)
        {
            daysToMature += 2;
        }
    }

}