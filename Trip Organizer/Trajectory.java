public class Trajectory
{
    private String type;
    private String startPoint;
    private String endPoint;
    private float price;
    private boolean discount;
    
    public Trajectory(String motType, String from, String to, float cost)
    {
        type = motType;
        startPoint = from;
        endPoint = to;
        price = cost;
    }
    
    public float use()
    {
        return price;
    }
    
    public void setDiscount (boolean newDiscount)
    {
        if (newDiscount == true)
        {
            price /= 2;
        }
    }
    
    public String getType()
    {
        return type;
    }
}

