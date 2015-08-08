package com.twu.biblioteca.menu;

import com.twu.biblioteca.test.User;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.ViewInterface;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ListUserDetailsTest {

    @Test
    public void canReturnUSerDetails() {
        User user = Mockito.mock(User.class);
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        SuccessfulView successfulView = Mockito.mock(SuccessfulView.class);

        ListUserDetails userDetails = new ListUserDetails(user,viewInterface,successfulView);
        userDetails.execute();
        Mockito.verify(successfulView).printUserDetails(user);
    }

}