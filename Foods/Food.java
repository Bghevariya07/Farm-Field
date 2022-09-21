package Foods;

public abstract class Food {

    private String name;
    private double sellPrice;
    private int daysToMature;
    private int daysSincePotted;
    private int requiredArea;
    protected Soil preferredSoil;

    public Food(String name, double sellPrice, int daysToMature, int requiredArea) {
        this.name = name;
        this.sellPrice = sellPrice;
        this.daysToMature = daysToMature;
        this.requiredArea = requiredArea;
    }

    public String getName()
    {
        return this.name;
    }

    public double getSellPrice()
    {
        return this.sellPrice;
    }

    public Soil getPreferredSoil()
    {
        return this.preferredSoil;
    }

    public int getDaysToMature()
    {
        return this.daysToMature;
    }

    public int getDaysSincePotted()
    {
        return this.daysSincePotted;
    }

    public int getRequiredArea()
    {
        return this.requiredArea;
    }

    public abstract double grow(Soil);

    protected double grow()
    {
        this.daysToMature--;
        if (this.daysSincePotted > this.daysToMature)
        {
            return 1.00;
        }
        else
        {
            String per = (String.format("%.2f", daysSincePotted/daysToMature));
            return Double.parseDouble(per);
        }
    }

    public String toString()
    {
        return name + " (" + preferredSoil + ") - " + daysSincePotted + "/" + daysToMature + " days"
    }

}