import com.twu.biblioteca.User;
import com.twu.biblioteca.libraryitem.LibraryItem;
import com.twu.biblioteca.model.Library;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canReturnItsInformation() {
        ArrayList<LibraryItem> books = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> movies = new ArrayList<LibraryItem>();
        User user = new User("arun", "arun@xyz.com", "123456789", books, movies);

        assertEquals("arun                      arun@xyz.com              123456789                ", user.toString());
    }

    @Test
    public void canReturnIssuedBooks() {
        ArrayList<LibraryItem> books = new ArrayList<LibraryItem>();
        ArrayList<LibraryItem> movies = new ArrayList<LibraryItem>();

        User user = new User("arun", "arun@xyz.com", "123456789", books, movies);

        assertEquals(new ArrayList<LibraryItem>(), user.getIssuedBooks());
    }
}
