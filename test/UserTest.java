import com.twu.biblioteca.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canReturnItsInformation() {
        User user = new User("arun", "arun@xyz.com", "123456789");

        assertEquals("arun                      arun@xyz.com              123456789                ", user.toString());
    }
}
