import java.io.File;
import java.util.Scanner;
import java.sql.*;
import java.util.ArrayList;

public class Club 
{
    private String clubName;
    private double yearlyPay;
    private ArrayList<Member> memberList;
    private String dbName;

    public Club(String name, double baseAmount)
    {
        clubName = name;
        yearlyPay = baseAmount;
        memberList = new ArrayList<Member>();
    }

    public int getNrOfMembers()
    {
        return memberList.size();
    }

    public void addMember(Member m)
    {
        boolean found = false;
        for (Member member: memberList)
        {
            if (m.getFirstName().equals(member.getFirstName()) && m.getLastName().equals(member.getLastName()))
            {
                found = true;
            }
        }
        if (!found)
        {
            memberList.add(m);
        }
    }

    public void populateFromDB(String dbName)
    {
        Connection c = null;
        try 
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:"+dbName);
            System.out.println("Opened database successfully");
            String q = "SELECT * FROM Member WHERE clubName = '" + clubName + "'";
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(q);
            while ( rs.next() ) 
            {
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String eMail = rs.getString("emailAddress");
                int month = rs.getInt("startMonth");
                int year = rs.getInt("startYear");
                
                Member m = new Member(firstName, lastName, eMail, month, year);
                addMember(m);
            }
            rs.close();
            stmt.close();
            c.close();
        } 
        catch ( Exception e ) 
        {
            System.err.println( "ERROR : "+ e.getMessage() );    
        }
    }
}    
        /*      try
        {
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNext())
        {
        }
        sc.close();
        }
        catch(Exception e){};
         */

        /*
         * Connection c = null;
        try 
        {
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:"+dbName);
        System.out.println("Opened database successfully");

        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery( ... );
        while ( rs.next() ) 
        {
        }
        rs.close();
        stmt.close();
        c.close();
        } 
        catch ( Exception e ) 
        {
        System.err.println( "ERROR : "+ e.getMessage() );
        }
         */

