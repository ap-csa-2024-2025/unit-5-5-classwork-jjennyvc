public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public Oven(int maxTemp, int currentTemp)
    {
        if (maxTemp > 500 || maxTemp < 0)
        {
            this.maxTemp = 500;
        }
        else
        {
            this.maxTemp = maxTemp;
        }
    }
    if (currentTemp > this.maxTemp)
    {
        this.currentTemp = this.maxTemp;
    }
    else if (currentTemp < 0)
    {
        this.currentTemp = 0;
    }
    else
    {
        this.currentTemp = currentTemp;
    }
    public int getMaxTemp()
    {
        return maxTemp;
    }
    public int getCurrentTemp()
    {
        return currentTemp;
    }
    public void turnOff()
    {
        if (currentTemp > 0)
        {
            currentTemp = 0;
        }
    }
    public boolean isOn()
    {
        return currentTemp > 0;
    }
    public void preheat(int temp)
    {
        if(temp > maxTemp)
        {
            currentTemp = maxTemp;
        }
        else if (temp > 0)
        {
            currentTemp = temp;
        }
    }
    public String toString()
    {
        return "New oven with a maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp;
    }
}
