package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.ViewInterface;
import org.junit.Test;
import org.mockito.Mockito;


public class LogoutTest {

    @Test
    public void canLogout() {
        Login login = Mockito.mock(Login.class);
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        Logout logout = new Logout(login);

        logout.execute(viewInterface);
        Mockito.verify(login).logOut();
    }

}