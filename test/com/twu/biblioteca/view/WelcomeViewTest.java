package com.twu.biblioteca.view;

import org.junit.Test;
import org.mockito.Mockito;


public class WelcomeViewTest {

    @Test
    public void canShowWelcomeMessage() {
        LoginView loginView = Mockito.mock(LoginView.class);
        View view = Mockito.mock(View.class);
        WelcomeView welcomeView = new WelcomeView(loginView, view);
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);

        welcomeView.render(viewInterface);
        Mockito.verify(view, Mockito.atLeast(1)).displayOutput("===================================");
        Mockito.verify(view).displayOutput("****** Welcome to Biblioteca ******");
    }
}