import asg.cliche.Command;
import asg.cliche.Param;

public class main {

    //Commands
    @Command(description="Searches a city name to find all books and their authors mesntioning that city")
    public void citySearch (@Param(name="City Name") String city)
    {
        //TODO:
    }

    //Commands
    @Command(description="Searches a book title, plots all cities mentioned in this book onto a map.")
    public void titleSearch (@Param(name="Book Title") String title)
    {
        //TODO:
    }

    //Commands
    @Command(description="Searches an author name, lists all books written by that author and plots all cities mentioned in any of the books onto a map.")
    public void authorSearch (@Param(name="Author Name") String author)
    {
        //TODO:
    }

    //Commands
    @Command(description="Searches a geolocation, your application lists all books mentioning a city in vicinity of the given geolocation.")
    public void geoSearch (@Param(name="City Name") String city)
    {
        //TODO:
    }
}