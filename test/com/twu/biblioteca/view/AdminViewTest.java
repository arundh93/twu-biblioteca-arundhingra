package com.twu.biblioteca.view;

import com.twu.biblioteca.parser.Parser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class AdminViewTest {

    @Test
    public void canRenderAdminMenu() {
/*        View view = Mockito.mock(View.class);
        Parser parser = Mockito.mock(Parser.class);
        AdminView adminView = new AdminView(parser, view);
        Mockito.when(view.takeInput()).thenReturn("1");
        adminView.render(adminView);
        Mockito.verify(view).displayOutput("\n***** Main Menu *****\n" +
                "1. List Books\n" +
                "2. List Movies\n" +
                "3. Checkout Book\n" +
                "4. Return  book\n" +
                "5. Checkout Movie\n" +
                "6. Return Movie\n" +
                "7. Quit\n" +
                "8. List checked out book\n" +
                "9. List Checked out movie\n" +
                "10. Logout\n\n" +
                "Enter an option (1/2/3/4/5/6/7)");
*/
    }

}