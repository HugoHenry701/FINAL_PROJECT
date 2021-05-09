package com.view;

import com.controller.AppController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class MenuPanel extends JPanel {
    private JPanel MenuPanel;
    private JButton startGameButton;
    private JButton exitGameButton;
    private JTextField welcomeToTheLastTextField;

    public MenuPanel(AppController appController){

        MenuPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        exitGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        welcomeToTheLastTextField.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }

            @Override
            public void componentShown(ComponentEvent e) {
                super.componentShown(e);
            }
        });
    }
}
