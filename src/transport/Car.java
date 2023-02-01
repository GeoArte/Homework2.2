package transport;

public class Car
{
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private boolean winterTires;

    private static String defaulta = "default";

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean winterTires)
    {
        if (brand == null || brand.equals(""))
        {
            this.brand = defaulta;
        }
        else
        {
            this.brand = brand;
        }
        if (model == null || model.equals(""))
        {
            this.model = defaulta;
        }
        else
        {
            this.model = model;
        }
        if (country == null || country.equals(""))
        {
            this.country = defaulta;
        }
        else
        {
            this.country = country;
        }
        if (engineVolume > 0)
        {
            this.engineVolume = engineVolume;
        }
        else
        {
            this.engineVolume = 1.5;
        }
        if (color == null || color.equals(""))
        {
            this.color = "белый";
        }
        else
        {
            this.color = color;
        }
        if (year > 0)
        {
            this.year = year;
        }
        else
        {
            this.year = 2000;
        }
        if (transmission == null || transmission.equals(""))
        {
            this.transmission = defaulta;
        }
        else
        {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.equals(""))
        {
            this.bodyType = defaulta;
        }
        else
        {
            this.bodyType = bodyType;
        }
        if (registrationNumber > 0)
        {
            this.registrationNumber = registrationNumber;
        }
        else
        {
            this.registrationNumber = 0;
        }
        if (numberOfSeats > 0)
        {
            this.numberOfSeats = numberOfSeats;
        }
        else
        {
            this.numberOfSeats = 5;
        }
        this.winterTires = winterTires;;
    }

    @Override
    public String toString()
    {
        String a = "Модель: " + this.brand + "\n" + "Модель: " + this.model + "\n" + "Объём двигателя в литрах: " + this.engineVolume + "\n" + "Цвет кузова: " + this.color + "\n" + "Год производства: " + this.year + "\n" + "Страна сборки: " + this.country;
        return a;
    }

    public String getBrand()
    {
        return this.brand;
    }
    public String getModel()
    {
        return this.model;
    }
    public double getEngineVolume()
    {
        return this.engineVolume;
    }
    public String getColor()
    {
        return this.color;
    }
    public int getYear()
    {
        return this.year;
    }
    public String getCountry()
    {
        return this.country;
    }

    public void setEngineVolume(double engineVolume)
    {
        this.engineVolume = engineVolume;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setTransmission(String transmission)
    {
        this.transmission = transmission;
    }
    public void setRegistrationNumber (int registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }
    public void setWinterTires (boolean winterTires)
    {
        this.winterTires = winterTires;
    }
    public void changeTiresToSeason(int month)
    {
        if (month > 2 && month < 12)
        {
            this.winterTires = false;
        }
        else
        {
            this.winterTires = true;
        }
    }

    public static class Key
    {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess)
        {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }
}
