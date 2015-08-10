package com.twu.biblioteca.menu;

import com.twu.biblioteca.test.User;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.ViewInterface;
import org.junit.Test;
import org.mockito.Mockito;


public class ListUserDetailsTest {

    @Test
    public void canReturnUSerDetails() {
        User user = Mockito.mock(User.class);
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        View view = Mockito.mock(View.class);
        ListUserDetails userDetails = new ListUserDetails(user,view);
        userDetails.execute(viewInterface);
        Mockito.verify(view).printUserDetails(user);
    }
}