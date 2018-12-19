package practice8;

public class Address //immutable class
{
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;
    public final Address EMPTY_ADDRESS = null;

    public Address()
    {
        this.cityName = null;
        this.zipCode = 0;
        this.streetName = null;
        this.buildingNumber = 0;
        this.buildingLetter = 0;
        this.apartmentNumber = 0;
    }

    public Address(String cityName, int zipCode, String streetName, int buildingNumber, char buildingLetter, int apartmentNumber)
    {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName()
    {
        return cityName;
    }

    public int getZipCode()
    {
        return zipCode;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public int getBuildingNumber()
    {
        return buildingNumber;
    }

    public char getBuildingLetter()
    {
        return buildingLetter;
    }

    public int getApartmentNumber()
    {
        return apartmentNumber;
    }

    @Override
    public String toString()
    {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", zipCode=" + zipCode +
                ", streetName='" + streetName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", buildingLetter=" + buildingLetter +
                ", apartmentNumber=" + apartmentNumber +
                ", EMPTY_ADDRESS=" + EMPTY_ADDRESS +
                '}';
    }
}