package com.view;

import com.controller.AppController;

import javax.swing.*;


public class GameFrame extends JFrame {
    private MenuPanel menuPanel;

    public GameFrame(AppController appController) {
        menuPanel = new MenuPanel(appController);
//        setupFrame();
        setupPanel();
    }

    private void setupFrame() {
        this.setContentPane(menuPanel);
        this.setSize(500, 500);
        this.setVisible(true);
    }
    private void setupPanel(){
        menuPanel.setVisible(true);
    }

}
