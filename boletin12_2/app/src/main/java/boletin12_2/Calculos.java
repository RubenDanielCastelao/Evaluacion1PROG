package boletin12_2;

import javax.swing.JOptionPane;

public class Calculos {

      int intentos = 0;
      int numAdivinar = 0;
      int i = 0;
      int h = 0;
      int p = 0;
      int players;

      public void jugar() {
            do {
                  if (p == 0) {
                        players = JOptionPane.showConfirmDialog(null, "La partida será para 2 jugadores?");
                  }
                  if (players == 0) {
                        intentos = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos para adivinar: "));
                        do {
                              numAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Número que se debe adivinar: (Debe ser inferior a 50 y superior a 1)"));
                        } while (numAdivinar > 50 || numAdivinar < 1);
                  } else {
                        intentos = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos para adivinar: "));
                        numAdivinar = (int) (Math.random() * 50 + 1);
                  }
                  do {
                        int tryAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar, te quedan " + intentos + " intentos."));
                        intentos = intentos - 1;
                        if (Math.abs(numAdivinar - tryAdivinar) > 20) {
                              JOptionPane.showMessageDialog(null, "Muy lejos.");
                        } else if (Math.abs(numAdivinar - tryAdivinar) > 10) {
                              JOptionPane.showMessageDialog(null, "Lejos.");
                        } else if (Math.abs(numAdivinar - tryAdivinar) > 5) {
                              JOptionPane.showMessageDialog(null, "Cerca.");
                        } else if (Math.abs(numAdivinar - tryAdivinar) >= 1) {
                              JOptionPane.showMessageDialog(null, "Muy cerca.");
                        } else if (tryAdivinar == numAdivinar) {
                              JOptionPane.showMessageDialog(null, "Bien hecho, acertaste");
                              i = 10;
                        }
                        if (intentos <= 0) {
                              JOptionPane.showMessageDialog(null, "Perdiste");
                              break;
                        }
                  } while (i != 10);
                  int again = JOptionPane.showConfirmDialog(null, "Jugar otra vez?");
                  if (again == 0) {
                        h = 0;
                        p = 1;
                  } else {
                        h = 10;
                  }
            } while (h != 10);
      }
}
