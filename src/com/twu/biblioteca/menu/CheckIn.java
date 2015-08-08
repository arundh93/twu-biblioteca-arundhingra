package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.ChoiceView;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.ViewInterface;


public class CheckIn implements MenuOperation {

    private Library library;
    private Login login;
    private ChoiceView choiceView;
    private SuccessfulView successfulView;
    private UnSuccessfulView unSuccessfulView;
    private String item;
    private ViewInterface viewInterface;

    public CheckIn(Library library, Login login, ChoiceView choiceView, SuccessfulView successfulView, UnSuccessfulView unSuccessfulView, String item, ViewInterface viewInterface) {
        this.library = library;
        this.login = login;
        this.choiceView = choiceView;
        this.successfulView = successfulView;
        this.unSuccessfulView = unSuccessfulView;
        this.item = item;
        this.viewInterface = viewInterface;
    }

    @Override
    public ViewInterface execute() {
        String input = choiceView.execute(item);
        if (library.returnLibraryItem(input, login)) {
            successfulView.showCheckInMessage(item);
        } else {
            unSuccessfulView.showCheckInMessage(item);
        }
        return viewInterface;
    }
}
