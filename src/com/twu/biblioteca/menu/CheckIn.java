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

    public CheckIn(Library library, Login login, ChoiceView choiceView, SuccessfulView successfulView, UnSuccessfulView unSuccessfulView, String item) {
        this.library = library;
        this.login = login;
        this.choiceView = choiceView;
        this.successfulView = successfulView;
        this.unSuccessfulView = unSuccessfulView;
        this.item = item;
    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        String input = choiceView.execute(item);
        if (library.returnLibraryItem(input, login)) {
            successfulView.showCheckInMessage(item);
        } else {
            unSuccessfulView.showCheckInMessage(item);
        }
        return viewInterface;
    }
}
