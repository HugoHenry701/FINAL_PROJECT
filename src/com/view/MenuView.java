package com.view;

import com.controller.AppController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class MenuView extends JFrame {


    private JPanel MenuPanel;
    private JButton startGameButton;
    private JButton exitGameButton;
    private JTextField welcomeToTheLastTextField;

    public MenuView(AppController appController) {
        setupFrame();
        setupPanel();
        setStartGameButton();
        setExitGameButton(appController);
    }

    private void setupFrame() {
        this.setContentPane(MenuPanel);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    private void setupPanel() {
        MenuPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                super.componentMoved(e);
            }

            @Override
            public void componentShown(ComponentEvent e) {
                super.componentShown(e);
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                super.componentHidden(e);
            }
        });
    }
    public void setStartGameButton(){
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
    public void setExitGameButton(AppController appController) {
        exitGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appController.end();
            }
        });
    }

}
