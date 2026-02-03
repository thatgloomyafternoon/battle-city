package com.fw.battlecity;

import static com.fw.battlecity.Constants.APP_NAME;
import static com.fw.battlecity.Constants.GUI_HEIGHT;
import static com.fw.battlecity.Constants.GUI_WIDTH;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {

  public Gui() {
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(GUI_WIDTH, GUI_HEIGHT));
    JFrame frame = new JFrame(APP_NAME);
    frame.add(panel);
    frame.pack();
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
