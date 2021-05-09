package com.controller;

import com.view.MenuView;

public class AppController {
    private MenuView appFrame;
    public void start(){
        appFrame = new MenuView(this);
    }
    public void end(){
        System.exit(0);
    }
}
