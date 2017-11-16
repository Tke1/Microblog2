import static java.lang.System.out;
import java.util.*;

public class Menu3 {
    //public static User3 retriveCurrentUser(ArrayList<User3>allUsers, String userName)
    //{
    //   int allUsersList=allUsers.size();
    //   for(int i=0; i<allUsersList; i++)
    //   {
    //       if(allUsers.get(i).equals(userName))
    //       {
    //           return allUsers.get(i);
    //       }
    //   }
    //   return null; 
    //}

    //public void input()
    //{
    // Scanner keyboard = new Scanner(System.in);
    //ArrayList<User3>allUsers= new ArrayList<User3>(); 

    // User3 a=new User3( "Jason Beton", "jeb@gmail.com", "eTop", "www.esgda.com"); 
    //User3 b=new User3( "Edward Crown", "playtimeEC@yahoo.com", "play2q", "www.ecown.com"); 
    //User3 c=new User3(  "Dexter Milton", "dexter.milton@msn.com", "tepdw", "www.mildex.com"); 

    //allUsers.add(a);
    //allUsers.add(b); 
    //allUsers.add(c);
    //out.println(allUsers); 
    //out.println("Choose an username from the following above");
    //String selection=keyboard.nextLine(); 
    //}

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); 
        boolean quit = false;

        ArrayList<User3>allUsers= new ArrayList<User3>(); 

        User3 a=new User3( "Jason Beton", "jeb@gmail.com", "eTop", "www.esgda.com"); 
        User3 b=new User3( "Edward Crown", "playtimeEC@yahoo.com", "play2q", "www.ecown.com"); 
        User3 c=new User3(  "Dexter Milton", "dexter.milton@msn.com", "tepdw", "www.mildex.com"); 

        allUsers.add(a);
        allUsers.add(b); 
        allUsers.add(c);

        ArrayList<Post3>allPosts= new ArrayList<Post3>();
        //Post3 d= new Post3("eTop", "What's up?"); 
        //Post3 f= new Post3("play2q", "wow!"); 
        //Post3 g= new Post3 ("tepdw", "awesome!"); 

        //out.println(allUsers); 
        //out.println("Choose an username from the following above");
        //String selection=keyboard.nextLine(); 

        out.println("Enter an username"); 
        String response= keyboard.nextLine(); 
        do
        {
            out.println("Main Menu"); 
            out.println("1) Create a new user"); 
            out.println("2) Become an existing user"); 
            out.println("3) Create a post as the current user"); 
            out.println("4) Print all posts"); 
            out.println("5) Print all users");
            out.println("6) Exit"); 
            out.println(); 

            out.println("Your are currently user" + " "+ response + "." + "What would you like to do? Enter choice [1-6].");  
            int choice= keyboard.nextInt(); 
            out.println(); 
            switch (choice)
            {
                case 1:
                out.println("Type your first name and last name");
                String name= keyboard.nextLine();
                out.println("Create a username");
                String userName= keyboard.nextLine();
                out.println("Type your email.");
                String email= keyboard.nextLine();
                out.println("Type the link to your avatar.");
                String url= keyboard.nextLine();

                User3 author = new User3(name, email,userName, url);
                
                allUsers.add(author); 
                break;
                case 2:
                for(int i=0; i<allUsers.size(); i++)
                {

                    {
                        out.println(allUsers.get(i).getUserName());
                    }
                }
                out.println("Choose an username from the following above");
                keyboard.nextLine(); 
                String selection=keyboard.nextLine(); 
                out.println(); 
                break;

                case 3: 

                Post3 myPost= new Post3(); 
                myPost.input();
                myPost.print(); 
                allPosts.add(myPost); 
                break; 
                case 4: 
                out.println(allPosts); 
                case 5:  
                out.println(allUsers); 
                break; 
                case 6:
                quit=true;
                break;
                default: 
                out.println("Invalid choice.");
            }
            out.println(); 
        } while (!quit); 
        out.println("Good Bye!"); 
    }
}