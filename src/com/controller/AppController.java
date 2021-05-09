package com.controller;

import com.view.GameFrame;

public class AppController {
    private GameFrame appFrame;
    public void start(){
        appFrame = new GameFrame(this);
    }
    public void end(){
        System.exit(0);
    }
}
