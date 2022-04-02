
/**
 * class WeatherStation - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class WeatherStation
{
    // instance variables - vervang deze door jouw variabelen
    private MeasuringDevice thermometer;
    private MeasuringDevice barometer;

    /**
     * Constructor voor objects van class WeatherStation
     */
    public WeatherStation(double measurementTemp, String unitTemp, double measurementPress, String unitPress)
    {
        thermometer = new MeasuringDevice(measurementTemp, unitTemp);
        barometer = new MeasuringDevice(measurementPress, unitPress);
    }

    /**
     * Voorbeeld van een method - schrijf hier jouw comment
     *
     * @param  y    deze method krijgt deze parameter mee in de aanroep
     * @return    deze method geeft de som van x en y terug
     */
    public void insertMeasurement(double measurementTemp, double measurementPress)
    {
        thermometer.insertMeasurement(measurementTemp);
        barometer.insertMeasurement(measurementPress);
    }
    
    public void resetMeasuringDevice()
    {
        thermometer.resetMeasuringDevice();
        barometer.resetMeasuringDevice();
    } 
}
