package com.twu.biblioteca;

public class BibliotecaController {

    private  View view;

    public BibliotecaController(View view) {
        this.view = view;
    }

    public void start() {
        view.displayWelcomeMessage();
    }
}
