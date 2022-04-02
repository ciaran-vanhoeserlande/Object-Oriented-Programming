
/**
 * class MeasuringDevice - geef hier een beschrijving van deze class
 *
 * @author (jouw naam)
 * @version (versie nummer of datum)
 */
public class MeasuringDevice
{
    private double maximum;
    private double value;
    private double minimum;
    private String unit;
    private boolean reset;
    /**
     * Constructor voor objects van class MeasuringDevice
     */
    public MeasuringDevice(double measurement, String unitofmeasurement)
    {
        maximum = measurement;
        value = measurement;
        minimum = measurement;
        unit = unitofmeasurement;
        reset = false;
    }

    /**
     * Voorbeeld van een method - schrijf hier jouw comment
     *
     * @param  y    deze method krijgt deze parameter mee in de aanroep
     * @return    deze method geeft de som van x en y terug
     */
    public void insertMeasurement(double measurement)
    {
        value = measurement;
        if (reset == true)
        {
            maximum = measurement;
            minimum = measurement;
            reset = false;
        }
        else
        {
            if (maximum < measurement)
            {
                maximum = measurement;
            }
            if (minimum > measurement)
            {
                minimum = measurement;
            }
        }
    }

    public void resetMeasuringDevice()
    {
        reset = true;
    }    
}
