package com.fw.battlecity;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {

  public Gui() {
    JPanel panel = new JPanel();
    panel.setPreferredSize(new Dimension(640, 480));
    JFrame frame = new JFrame(Constants.APP_NAME);
    frame.add(panel);
    frame.pack();
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
