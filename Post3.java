import static java.lang.System.out;
import java.util.*;

public class Post3
{
    private static int nextPostNumber =0; 
    private String author;
    private int postNumber;
    private String content; 

    public Post3()
    {
        this.postNumber=nextPostNumber; 
        nextPostNumber++; 
        this.author= author; 
        this.content=content; 
    }

    //public Post3(String author, String content)
    //{
      //  this.postNumber=nextPostNumber; 
      //  nextPostNumber++; 
      //  this.author= author; 
      //  this.content=content; 
    //}

    public String toString()
    {
        return this.postNumber + " " + this.author+ "/n" + this.content; 
    }

    public void input()
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Enter current author's username");
        this.author= keyboard.nextLine();
        out.println("Enter the content"); 
        this.content=keyboard.nextLine(); 
    }

    public void print()
    {
        out.println(this.postNumber+" " + this.author); 
        out.println(this.content);
    }

}
