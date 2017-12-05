import static java.lang.System.out;
import java.util.*;

public class Post3
{
    private static int nextPostNumber =0; 
    private String author;
    private int postNumber;
    private String content; 
    private String url; 

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
    
   
    public void setAuthor(String a)
    {
        this.author=a; 
    }

    public String author()
    {
        return this.author; 
    }

    public String content() 
    {
        return this.content; 
    }

    public void setContent(String c)
    {
        this.content=c; 
    }

    public String toString()
    {
        return this.postNumber + " " + this.author+ "/n" + this.content; 
    }

    public void setInput(String c)
    {
        Scanner keyboard = new Scanner (System.in); 
        //out.println("current author's username");
        // this.author= keyboard.nextLine();
        out.println("Enter the content"); 
        c= keyboard.nextLine(); 
        this.content = c; 
    }

    public String input()
    {
        return this.input(); 
    }

    //public void setAskUrl(String u)
    //{
      //  Scanner keyboard = new Scanner (System.in); 
         

      //  url = u; 
    //}

    //public String askUrl()
    //{
     //   return url; 
    //}

    public void print()
    {
        out.println(this.postNumber+" " + this.author); 
        out.println(this.content);
    }

    public void printUrl()
    {
        out.println(this.url); 
    }
}
