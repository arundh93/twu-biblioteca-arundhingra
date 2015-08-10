package com.twu.biblioteca.view;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;


public class ListItemViewTest {

    @Test
    public void canDisplayListOfItems() {
        View view = Mockito.mock(View.class);
        ListItemView listItemView = new ListItemView(view);
        ArrayList libraryItems = Mockito.mock(ArrayList.class);
        ArrayList ownership = Mockito.mock(ArrayList.class);

        Mockito.when(libraryItems.size()).thenReturn(3);
        listItemView.render(libraryItems, ownership);
        Mockito.verify(view,Mockito.atLeast(1)).displayOutput(Mockito.anyString());
    }
}