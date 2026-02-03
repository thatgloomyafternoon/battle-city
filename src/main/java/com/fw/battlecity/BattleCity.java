package com.fw.battlecity;

import javax.swing.SwingUtilities;

public class BattleCity {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(Gui::new);
  }
}
