package algoZoo.challenge;

import algoZoo.game.LevelButton;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * This class is for organizing the LevelButtons for Challenge Mode
 * @author Ayberk, Doğa, Esra, Alp
 * @version 1.0
 */
public class ChallengeModeLevelsGUI extends javax.swing.JPanel {

   // properties
   private ArrayList<JLabel>      stars;
   private ArrayList<LevelButton> buttons;

   // constructor
   /**
    * Creates new form ChallengeModeLevelsGUI
    */
   public ChallengeModeLevelsGUI() {
       //initialize all components
      initComponents();
      buttons = new ArrayList<LevelButton>();
      stars = new ArrayList<>();
      
      //add necessary components to ArrayLists
      addButtons();    
      addStars();
      try {         
         for (int i = 0; i < ChallengeLevelsSave.load().levelAccomplishedSize(); i++) {
            if (ChallengeLevelsSave.load().getLevelAccomplished(i)) {
               buttons.get(i).setEnabled(true);
               buttons.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/" + (i + 1) + ".png")));
               
            }
            else {
               buttons.get(i).setEnabled(false);
            }
         }
         
         for(int i = 0; i < ChallengeLevelsSave.load().levelStarsSize(); i++) {
            if (ChallengeLevelsSave.load().getLevelStars(i) == 3) {
               stars.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Stars/Three_Stars.png")));
            }
            else if (ChallengeLevelsSave.load().getLevelStars(i) == 2) {
               stars.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Stars/Two_Stars.png")));
            }
            else if (ChallengeLevelsSave.load().getLevelStars(i) == 1) {
               stars.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Stars/One_Star.png")));
            }
         }
      } catch (NullPointerException e) {
         for (int j = 1; j < buttons.size(); j++) {
            buttons.get(j).setEnabled(false);
         }
      }
   }
   
   //methods
   /**
    * adds all the efficiency jLabels to ArrayList
    */
   private void addStars() {
      stars.add(stars1);
      stars.add(stars2);
      stars.add(stars3);
      stars.add(stars4);
      stars.add(stars5);
      stars.add(stars6);
      stars.add(stars7);
      stars.add(stars8);
      stars.add(stars9);
      stars.add(stars10);     
   }
   
   /**
    * adds all the LevelButtons to ArrayList
    */
   private void addButtons() {
      buttons.add(jButton1);
      buttons.add(jButton2);
      buttons.add(jButton3);
      buttons.add(jButton4);
      buttons.add(jButton5);
      buttons.add(jButton6);
      buttons.add(jButton7);
      buttons.add(jButton8);
      buttons.add(jButton9);
      buttons.add(jButton10);
      
      for ( int i = 1; i < buttons.size(); i++) {
         buttons.get(i).setEnabled(false);
      }
   }

   /**
    * returns the efficiency label of the given levelNo
    * @param levelNo
    * @return stars.get(levelNo - 1)
    */
   public JLabel getJLabel(int levelNo)  {
      return stars.get(levelNo - 1);
   }
   
   /**
    * returns the LevelButton of the given levelNo
    * @param levelNo
    * @return buttons.get(levelNo - 1)
    */
   public LevelButton getJButton(int levelNo) {
      return buttons.get(levelNo - 1);
   }

   /**
    * sets the icon of the LevelButton with given ImageIcon
    * @param levelButton
    * @param icon 
    */
   public void setJButtonIcon(LevelButton levelButton, ImageIcon icon) {
      levelButton.setIcon(icon);
   }
   
   /**
    * sets the icon of efficiency labels according to the efficiency of played level
    * @param stars
    * @param efficiency 
    */
   public void setEfficiencyStars(JLabel stars, int efficiency) {
       if(efficiency == 3)
           stars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Stars/Three_Stars.png")));
       else if(efficiency == 2) 
           stars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Stars/Two_Stars.png")));
       else if(efficiency == 1)
           stars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Stars/One_Star.png")));
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jButton1 = new algoZoo.game.LevelButton(1);
      jButton2 = new algoZoo.game.LevelButton(2);
      jButton3 = new algoZoo.game.LevelButton(3);
      jButton4 = new algoZoo.game.LevelButton(4);
      jButton5 = new algoZoo.game.LevelButton(5);
      jButton6 = new algoZoo.game.LevelButton(6);
      jButton7 = new algoZoo.game.LevelButton(7);
      jButton8 = new algoZoo.game.LevelButton(8);
      jButton9 = new algoZoo.game.LevelButton(9);
      jButton10 = new algoZoo.game.LevelButton(10);
      stars1 = new javax.swing.JLabel();
      stars2 = new javax.swing.JLabel();
      stars3 = new javax.swing.JLabel();
      stars4 = new javax.swing.JLabel();
      stars5 = new javax.swing.JLabel();
      stars6 = new javax.swing.JLabel();
      stars7 = new javax.swing.JLabel();
      stars8 = new javax.swing.JLabel();
      stars9 = new javax.swing.JLabel();
      stars10 = new javax.swing.JLabel();
      background = new javax.swing.JLabel();

      setLayout(null);

      jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/1.png"))); // NOI18N
      jButton1.setBorder(null);
      jButton1.setContentAreaFilled(false);
      jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      add(jButton1);
      jButton1.setBounds(255, 350, 95, 95);

      jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      jButton2.setBorder(null);
      jButton2.setContentAreaFilled(false);
      jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      add(jButton2);
      jButton2.setBounds(455, 350, 95, 95);

      jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      jButton3.setBorder(null);
      jButton3.setContentAreaFilled(false);
      jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      add(jButton3);
      jButton3.setBounds(655, 350, 95, 95);

      jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      jButton4.setBorder(null);
      jButton4.setContentAreaFilled(false);
      jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      add(jButton4);
      jButton4.setBounds(855, 350, 95, 95);

      jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      jButton5.setBorder(null);
      jButton5.setContentAreaFilled(false);
      jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      add(jButton5);
      jButton5.setBounds(1055, 350, 95, 95);

      jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      jButton6.setBorder(null);
      jButton6.setContentAreaFilled(false);
      jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      add(jButton6);
      jButton6.setBounds(255, 550, 95, 95);

      jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      jButton7.setBorder(null);
      jButton7.setContentAreaFilled(false);
      jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      add(jButton7);
      jButton7.setBounds(455, 550, 95, 95);

      jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      jButton8.setBorder(null);
      jButton8.setContentAreaFilled(false);
      jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      add(jButton8);
      jButton8.setBounds(655, 550, 95, 95);

      jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      jButton9.setBorder(null);
      jButton9.setContentAreaFilled(false);
      jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton9.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      add(jButton9);
      jButton9.setBounds(855, 550, 95, 95);

      jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      jButton10.setBorder(null);
      jButton10.setContentAreaFilled(false);
      jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      jButton10.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/Lock.png"))); // NOI18N
      add(jButton10);
      jButton10.setBounds(1055, 550, 95, 95);

      stars1.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars1);
      stars1.setBounds(228, 300, 150, 40);

      stars2.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars2);
      stars2.setBounds(428, 300, 150, 40);

      stars3.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars3);
      stars3.setBounds(628, 300, 150, 40);

      stars4.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars4);
      stars4.setBounds(828, 300, 150, 40);

      stars5.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars5);
      stars5.setBounds(1028, 300, 150, 40);

      stars6.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars6);
      stars6.setBounds(228, 500, 150, 40);

      stars7.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars7);
      stars7.setBounds(428, 500, 150, 40);

      stars8.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars8);
      stars8.setBounds(628, 500, 150, 40);

      stars9.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars9);
      stars9.setBounds(828, 500, 150, 40);

      stars10.setPreferredSize(new java.awt.Dimension(48, 40));
      add(stars10);
      stars10.setBounds(1028, 500, 150, 40);

      background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Challenge_Mode_Levels_Background.png"))); // NOI18N
      add(background);
      background.setBounds(0, 0, 1400, 800);
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel background;
   private algoZoo.game.LevelButton jButton1;
   private algoZoo.game.LevelButton jButton10;
   private algoZoo.game.LevelButton jButton2;
   private algoZoo.game.LevelButton jButton3;
   private algoZoo.game.LevelButton jButton4;
   private algoZoo.game.LevelButton jButton5;
   private algoZoo.game.LevelButton jButton6;
   private algoZoo.game.LevelButton jButton7;
   private algoZoo.game.LevelButton jButton8;
   private algoZoo.game.LevelButton jButton9;
   private javax.swing.JLabel stars1;
   private javax.swing.JLabel stars10;
   private javax.swing.JLabel stars2;
   private javax.swing.JLabel stars3;
   private javax.swing.JLabel stars4;
   private javax.swing.JLabel stars5;
   private javax.swing.JLabel stars6;
   private javax.swing.JLabel stars7;
   private javax.swing.JLabel stars8;
   private javax.swing.JLabel stars9;
   // End of variables declaration//GEN-END:variables
}
