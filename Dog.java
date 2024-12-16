public class Dog
{
    private String breed;
    private double size;
    private String color;
    private double weight;

    public void setBreed(String iBreed)
    {
        breed = iBreed;
    }
    public void setSize(double iSize)
    {
        size = iSize
    }
    public void setColor(String iColor)
    {
        color = iColor;
    }
    public void setWeight(double iWeight)
    {
        if(Weight < 0)
        {
            weight = 0;
        }
        else 
        {
            weight = iWeight;
        }
    }
}
