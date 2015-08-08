package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.ChoiceView;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.ViewInterface;


public class CheckOut implements MenuOperation {

    private Library library;
    private Login login;
    private final ChoiceView choiceView;
    private final SuccessfulView successfulView;
    private final UnSuccessfulView unSuccessfulView;
    private final String item;
    private ViewInterface viewInterface;

    public CheckOut(Library library, Login login, ChoiceView choiceView, SuccessfulView successfulView, UnSuccessfulView unSuccessfulView, String item, ViewInterface viewInterface) {
        this.library = library;
        this.login = login;
        this.choiceView = choiceView;
        this.successfulView = successfulView;
        this.unSuccessfulView = unSuccessfulView;
        this.item = item;
        this.viewInterface = viewInterface;
    }

    public ViewInterface execute() {
        String input = choiceView.execute(item);
        if (library.checkOutLibraryItem(input, login)) {
            successfulView.showCheckOutMessage(item);
        } else {
            unSuccessfulView.showCheckOutMessage(item);
        }
        return viewInterface;
    }
}
