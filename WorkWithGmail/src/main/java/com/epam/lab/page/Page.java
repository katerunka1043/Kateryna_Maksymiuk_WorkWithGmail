package com.epam.lab.page;

public abstract class Page {
    protected Page() {
        init();
        parsePage();
    }
    protected abstract void init();
    protected abstract void parsePage();

}