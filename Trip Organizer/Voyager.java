public class Voyager
{
    private String name;
    private float budget;
    private Trajectory trajectory;

    public Voyager(String voyagerName, float voyagerBudget)
    {
        name = voyagerName;
        budget = voyagerBudget;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getBudget()
    {
        return budget;
    }
    
    public Trajectory getTrajectory()
    {
        return trajectory;
    }
    
    public void setTrajectory(Trajectory newTrajectory)
    {
        trajectory = newTrajectory;
    }
    
    public void bookRide()
    {
        if (budget < trajectory.use())
        {
            System.out.println("Your budget is too low to book this trip.");
        }
        else
        {
            budget -= trajectory.use();
        }
    }
    
    public boolean tripPossible()
    {
        if (budget < trajectory.use())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
    
    
