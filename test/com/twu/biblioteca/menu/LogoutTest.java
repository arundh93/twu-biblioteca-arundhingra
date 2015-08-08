package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Login;
import org.junit.Test;
import org.mockito.Mockito;


public class LogoutTest {

    @Test
    public void canLogout() {
        Login login = Mockito.mock(Login.class);

        Logout logout = new Logout(login);

        logout.execute();
        Mockito.verify(login).logOut();
    }

}