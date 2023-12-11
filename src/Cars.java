//Start of Cars.java

public class Cars
{
    //----------------------------------------------------------------------------------------------------------
    //                                            Variables & Constructors

    private String name;
    private String brand;
    private String color;
    private String engine;
    private int year;
    private double maxSpeed;
    private boolean custom;
    private boolean canRace;

    public Cars()
    {
        name = "";
        brand = "";
        engine = "";
        color = "";
        year = 0;
        maxSpeed = 0;
        custom = true;
        canRace = true;
    }
    public Cars(String myName, String myBrand, String myEngine, String myColor, int myYear, double myMaxSpeed, boolean myCustom, boolean myCanRace)
    {
        this.name = myName;
        this.brand = myBrand;
        this.engine = myEngine;
        this.color = myColor;
        this.year = myYear;
        this.maxSpeed = myMaxSpeed;
        this.custom = myCustom;
        this.canRace = myCanRace;
    }

    //                                                  End of Constructors
    //------------------------------------------------------------------------------------------------------------



    //----------------------------------------------------------------------------------------------------------
    //                                               Getters

    public double isCustom() {
        if(custom) //if the car is custom, it can't race, but is 30% faster
        {
            maxSpeed = maxSpeed + (maxSpeed * 0.30);
            canRace = false;
            return maxSpeed;
        }
        else
        {
            return maxSpeed;
        }

    }
    public String getName()
    {
        return name;
    }
    public String getEngine()
    {
        return engine;
    }
    public String getColor()
    {
        return color;
    }
    public String getBrand()
    {
        return brand;
    }
    public Integer getYear()
    {
        return year;
    }
    public double getMaxSpeed()
    {
        return maxSpeed;
    }
    public boolean getCustom()
    {
        return custom;
    }
    public boolean getCanRace()
    {
        return canRace;
    }

    public double createPrice()
    {
        double price;
        for(price = 10000; price < year * 40; price++)
        {
            return price;
        }

        if(custom)
        {
            double nPrice = price - year;
            return nPrice;
        }
        else {
            return price;
        }
    }

    //                                                End of Getters
    //-----------------------------------------------------------------------------------------------


    //-----------------------------------------------------------------------------------------------
    //                                                   Setters
    public void setName(String cName)// "c" standing for car
    {
        name = cName;
    }
    public void setBrand(String cBrand) {
        brand = cBrand;
    }
    public void setEngine(String cEngine)
    {
        engine = cEngine;
    }
    public void setColor(String cColor)
    {
        color = cColor;
    }
    public void setYear(int cYear)
    {
        year = cYear;
    }
    public void setMaxSpeed(double cSpeed)
    {
        maxSpeed = cSpeed;
    }
    public void setCustom(boolean cCustom)
    {
        custom = cCustom;
    }
    public void setCanRace(boolean canCarRace)
    {
        canRace = canCarRace;
    }

    //                                                End of Setters
    //-------------------------------------------------------------------------------------------------


    //-------------------------------------------------------------------------------------------------
    //                                                    toString
    public String toString()
    {
        String result = "Car Name: " + name;
        result += "\nCar Brand: " + brand +
                "\nEngine: " + engine +
                "\nColor: " + color +
                "\nYear: " + year +
                "\nSpeed(mph): " + isCustom() +
                "\nIs Custom: " + custom +
                "\nCan Race: " + canRace +
                "\nPrice: " + createPrice() + "\n";

        return result;
    }

    //                                                   End of toString
    //---------------------------------------------------------------------------------------------------
}
