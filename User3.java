import static java.lang.System.out;
import java.util.*;

public class User3 {
    private String name;
    private String email;
    private String userName;
    private String url;

    public User3(String name, String email, String userName, String url)
    {
        this.name= name;
        this.email=email;
        this.userName=userName;
        this.url= url;
    }
    
    public User3()
    {
        this.name= name;
        this.email=email;
        this.userName=userName;
        this.url= url;
    }
    
    public void setUserName()
    {
        
      this.userName=userName;
        
    }
        
    public String getUserName()
    {
        return userName;
    }
    
    public void input()
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Type your first name and last name");
        this.name= keyboard.nextLine();
        out.println("Create a username");
        this.userName= keyboard.nextLine();
        out.println("Type your email.");
        this.email= keyboard.nextLine();
        out.println("Type the link to your avatar.");
        this.url= keyboard.nextLine();
    }

    public void print()
    {
        out.println(this.name+ this.userName+ " "+ this.email+ " "+ this.url+ " ");
    }

    public String toString()
    {
        return this.name + " " + this.userName+ " " + this.email + " " + this.url;
    }
}
