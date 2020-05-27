package algoZoo.game;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 * This class is for creating the movement options the user can choose from
 * @author Doğa, Ayberk, Esra
 * @version 1.0
 */
public class SelectionController extends javax.swing.JPanel implements IAlgoZooView {

   // properties
   private ForView              forView;
   private AlgoZooModel         azm;
   private ArrayList<JButton>   buttons;
   private ArrayList<Character> forPattern;

   // constructors
   public SelectionController(AlgoZooModel azm) {
      //initialize all the components and properties
      this.azm = azm;
      buttons = new ArrayList<>();
      forPattern = new ArrayList<Character>();
      initComponents();
      addForView();
      addAllButtons();
      clrComboBox();
   }

   //methods
   /**
    * method to play sound when buttons clicked
    * @param soundName 
    */
   private void playSound(String filePath) {
      try {
         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));
         Clip clip = AudioSystem.getClip();
         clip.open(audioInputStream);
         clip.start();
      } catch (Exception ex) {
         System.out.println("Error with playing sound.");
         ex.printStackTrace();
      }
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      upButton = new javax.swing.JButton();
      downButton = new javax.swing.JButton();
      rightButton = new javax.swing.JButton();
      leftButton = new javax.swing.JButton();
      resetButton = new javax.swing.JButton();
      flowerButton = new javax.swing.JButton();
      forButton = new javax.swing.JToggleButton();
      repeat = new javax.swing.JComboBox<>();

      setOpaque(false);
      setPreferredSize(new java.awt.Dimension(200, 800));
      setLayout(null);

      upButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Up_Button.png"))); // NOI18N
      upButton.setBorder(null);
      upButton.setContentAreaFilled(false);
      upButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      upButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            upButtonActionPerformed(evt);
         }
      });
      add(upButton);
      upButton.setBounds(82, 20, 36, 50);

      downButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Down_Button.png"))); // NOI18N
      downButton.setBorder(null);
      downButton.setContentAreaFilled(false);
      downButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      downButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            downButtonActionPerformed(evt);
         }
      });
      add(downButton);
      downButton.setBounds(82, 146, 36, 50);

      rightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Right_Button.png"))); // NOI18N
      rightButton.setBorder(null);
      rightButton.setContentAreaFilled(false);
      rightButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      rightButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            rightButtonActionPerformed(evt);
         }
      });
      add(rightButton);
      rightButton.setBounds(75, 90, 50, 36);

      leftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Left_Button.png"))); // NOI18N
      leftButton.setBorder(null);
      leftButton.setContentAreaFilled(false);
      leftButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      leftButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            leftButtonActionPerformed(evt);
         }
      });
      add(leftButton);
      leftButton.setBounds(75, 216, 50, 36);

      resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Reset_Button.png"))); // NOI18N
      resetButton.setBorder(null);
      resetButton.setContentAreaFilled(false);
      resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      resetButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            resetButtonActionPerformed(evt);
         }
      });
      add(resetButton);
      resetButton.setBounds(63, 747, 75, 50);

      flowerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Flower.png"))); // NOI18N
      flowerButton.setBorder(null);
      flowerButton.setContentAreaFilled(false);
      flowerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      flowerButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            flowerButtonActionPerformed(evt);
         }
      });
      add(flowerButton);
      flowerButton.setBounds(76, 272, 48, 60);

      forButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/For_Button.png"))); // NOI18N
      forButton.setBorder(null);
      forButton.setContentAreaFilled(false);
      forButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      forButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            forButtonActionPerformed(evt);
         }
      });
      add(forButton);
      forButton.setBounds(25, 352, 70, 35);

      repeat.setBackground(new java.awt.Color(0, 0, 0));
      repeat.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
      repeat.setForeground(new java.awt.Color(255, 255, 255));
      repeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5" }));
      repeat.setBorder(null);
      repeat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      repeat.setOpaque(false);
      add(repeat);
      repeat.setBounds(105, 352, 70, 35);
   }// </editor-fold>//GEN-END:initComponents

   /**
    * adds the movement buttons to the selection panel
    */
   private void addAllButtons() {
      buttons.add(downButton);
      buttons.add(leftButton);
      buttons.add(rightButton);
      buttons.add(upButton);
      buttons.add(resetButton);
      buttons.add(flowerButton);
   }

   /**
    * This method is used to show for algorithm where the controllers are located.
    */
   private void addForView() {
      forView = new ForView();
      add(forView);
      forView.setBounds(60, 400, 120, 310);
   }

   /**
    * Adds the necessary movement to the model's movementPattern ArrayList
    * @param evt
    */
    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
       if (forButton.isSelected()) {
          forPattern.add('w');
          forView.updateView(azm);
       } 
       else {
          azm.addMovementPattern('w');
       }

       playSound("src/algoZoo/Sounds/Click_Sound_Soft.wav");
    }//GEN-LAST:event_upButtonActionPerformed

   /**
    * Adds the necessary movement to the model's movementPattern ArrayList
    * @param evt
    */
    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
       if (forButton.isSelected()) {
          forPattern.add('s');
          forView.updateView(azm);
       } 
       else {
          azm.addMovementPattern('s');
       }

       playSound("src/algoZoo/Sounds/Click_Sound_Soft.wav");
    }//GEN-LAST:event_downButtonActionPerformed

   /**
    * Adds the necessary movement to the model's movementPattern ArrayList
    * @param evt
    */
    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
       if (forButton.isSelected()) {
          forPattern.add('d');
          forView.updateView(azm);
       } 
       else {
          azm.addMovementPattern('d');
       }
       playSound("src/algoZoo/Sounds/Click_Sound_Soft.wav");
    }//GEN-LAST:event_rightButtonActionPerformed

   /**
    * Adds the necessary movement to the model's movementPattern ArrayList
    * @param evt
    */
    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
       if (forButton.isSelected()) {
          forPattern.add('a');
          forView.updateView(azm);
       } 
       else {
          azm.addMovementPattern('a');          
       }
       playSound("src/algoZoo/Sounds/Click_Sound_Soft.wav");
    }//GEN-LAST:event_leftButtonActionPerformed

   /**
    * Resets the model's movementPattern ArrayList
    * @param evt
    */
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
       if (forButton.isSelected()) {
          forPattern.clear();
          forView.updateView(azm);
          repeat.setSelectedIndex(0);
       } 
       else {
          azm.initNewGame();
          forPattern.clear();
          forView.updateView(azm);
          repeat.setSelectedIndex(0);
          for (JButton b : buttons) {
             b.setEnabled(true);
          }         
       }
       playSound("src/algoZoo/Sounds/Click_Sound_Soft.wav");
    }//GEN-LAST:event_resetButtonActionPerformed

   /**
    * ActionPerformed method for flowers.
    *
    * @param evt
    */
   private void flowerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flowerButtonActionPerformed
      if (forButton.isSelected()) {
         forPattern.add('f');
         forView.updateView(azm);
      } 
      else {
         azm.addMovementPattern('f');         
      }
      playSound("src/algoZoo/Sounds/Click_Sound_Soft.wav");
   }//GEN-LAST:event_flowerButtonActionPerformed

   /**
    * ActionPerformed method for for algorithm.
    * @param evt
    */
    private void forButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forButtonActionPerformed
       if (!forButton.isSelected()) {
          forButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/For_Button.png")));
          for (int i = 0; i < Integer.parseInt((String) repeat.getSelectedItem()); i++) {
             for (int j = 0; j < forPattern.size(); j++) {
                azm.addMovementPattern(forPattern.get(j));
             }
          }
          forPattern.clear();
          forView.updateView(azm);
       } 
       else {
          forButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/For_Button_Clicked.png")));
       }
       playSound("src/algoZoo/Sounds/Click_Sound_Soft.wav");
    }//GEN-LAST:event_forButtonActionPerformed

   /**
    * resets the panel for a new game
    */
   public void resetSelectionController() {
      for (JButton b : buttons) {
         b.setEnabled(true);
      }
      forButton.setEnabled(true);
      forButton.setSelected(false);
      forPattern.clear();
      forView.updateView(azm);
      repeat.setSelectedIndex(0);
   }

   /**
    * Overrides the updateView method to disable all the buttons when the game
    * is over.
    *
    * @param azm
    */
   @Override
   public void updateView(AlgoZooModel azm) {
      if (azm.isGameOver()) {
         for (JButton b : buttons) {
            b.setEnabled(false);
         }
         forButton.setEnabled(false);
      }
   }

   /**
    * Returns the ArrayList of all the buttons on the selection panel.
    *
    * @return buttons
    */
   public ArrayList<JButton> getButtons() {
      return buttons;
   }

   /**
    * Returns forButton
    *
    * @return forButton
    */
   public javax.swing.JToggleButton getForButton() {
      return forButton;
   }

   /**
    * Returns forView class
    *
    * @return forView
    */
   public IAlgoZooView getForView() {
      return forView;
   }

   /**
    * This method is for setting the colours in JComboBox.
    */
   private void clrComboBox() {
      try {
         repeat.setRenderer(new ComboBoxColor<String>());
         repeat.setBackground(Color.BLACK);
      } catch (Exception e) {
      }
   }

   //inner class
   /**
    * This is an inner class for demonstrating the for pattern
    */
   public class ForView extends javax.swing.JPanel implements IAlgoZooView {
      ArrayList<JLabel> jlabels;
      int updated;

      public ForView() {
         setOpaque(false);
         setLayout(null);
         jlabels = new ArrayList<>();
         updated = 0;
      }

      /**
       * Method to update the view in the controllers.
       *
       * @param azm
       */
      @Override
      public void updateView(AlgoZooModel azm) {
         if (forPattern.isEmpty()) {
            jlabels.removeAll(jlabels);
            this.removeAll();
            this.repaint();
            updated = 0;
         } 
		 else {
            for (int i = updated; i < forPattern.size(); i++) {
               if (forPattern.get(i).equals('w')) {
                  jlabels.add(new JLabel());
                  add(jlabels.get(jlabels.size() - 1));
                  jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Up_Button.png")));
                  if (jlabels.size() >= 2) {
                     jlabels.get(jlabels.size() - 1).setBounds(22, jlabels.get(jlabels.size() - 2).getHeight() + jlabels.get(jlabels.size() - 2).getY() + 10, 36, 50);
                  } 	
                  else {
                     jlabels.get(jlabels.size() - 1).setBounds(22, 20, 36, 50);
                  }
                  updated++;
               }
               else if (forPattern.get(i).equals('a')) {
                  jlabels.add(new JLabel());
                  add(jlabels.get(jlabels.size() - 1));
                  jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Left_Button.png")));
                  if (jlabels.size() >= 2) {
                     jlabels.get(jlabels.size() - 1).setBounds(15, jlabels.get(jlabels.size() - 2).getHeight() + jlabels.get(jlabels.size() - 2).getY() + 10, 50, 36);
                  } 
                  else {
                     jlabels.get(jlabels.size() - 1).setBounds(15, 20, 50, 36);
                  }
                  updated++;
               } 
               else if (forPattern.get(i).equals('s')) {
                  jlabels.add(new JLabel());
                  add(jlabels.get(jlabels.size() - 1));
                  jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Down_Button.png")));
                  if (jlabels.size() >= 2) {
                     jlabels.get(jlabels.size() - 1).setBounds(22, jlabels.get(jlabels.size() - 2).getHeight() + jlabels.get(jlabels.size() - 2).getY() + 10, 36, 50);
                  } 
                  else {
                     jlabels.get(jlabels.size() - 1).setBounds(22, 20, 36, 50);
                  }
                  updated++;
               } 
               else if (forPattern.get(i).equals('d')) {
                  jlabels.add(new JLabel());
                  add(jlabels.get(jlabels.size() - 1));
                  jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Right_Button.png")));
                  if (jlabels.size() >= 2) {
                     jlabels.get(jlabels.size() - 1).setBounds(15, jlabels.get(jlabels.size() - 2).getHeight() + jlabels.get(jlabels.size() - 2).getY() + 10, 50, 36);
                  } 
                  else {
                     jlabels.get(jlabels.size() - 1).setBounds(15, 20, 50, 36);
                  }
                  updated++;
               }
               else if (forPattern.get(i).equals('f')) {
                  jlabels.add(new JLabel());
                  add(jlabels.get(jlabels.size() - 1));
                  jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Flower.png")));
                  if (jlabels.size() >= 2) {
                     jlabels.get(jlabels.size() - 1).setBounds(16, jlabels.get(jlabels.size() - 2).getHeight() + jlabels.get(jlabels.size() - 2).getY() + 10, 48, 60);
                  } 
                  else {
                     jlabels.get(jlabels.size() - 1).setBounds(16, 20, 48, 60);
                  }
                  updated++;
               }
            }
         }
      }
   }

   //inner class
   /**
    * This is an inner class for designing the JComboBox
    * @param <String>
    */
   public class ComboBoxColor<String> extends javax.swing.JLabel implements ListCellRenderer {
	  // properties
	  int count = 5;
	  
	  // constructor
      public ComboBoxColor() {
         setOpaque(true);
      }
	  
	  // methods
      @Override
      public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
         setText(value.toString());
         Object text = repeat.getModel().getElementAt(index);
         setBackground(new Color(55, 55, 55));
         setForeground(new Color(255, 255, 255));
         setFont(new java.awt.Font("Calibri", 1, 18));
         setHorizontalAlignment(CENTER);
         return this;
      }
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton downButton;
   private javax.swing.JButton flowerButton;
   private javax.swing.JToggleButton forButton;
   private javax.swing.JButton leftButton;
   private javax.swing.JComboBox<String> repeat;
   private javax.swing.JButton resetButton;
   private javax.swing.JButton rightButton;
   private javax.swing.JButton upButton;
   // End of variables declaration//GEN-END:variables

}
