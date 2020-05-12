/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ayberk
 */
public class MenuScreen extends javax.swing.JFrame {
   
   
   /**
    * Creates new form WelcomeScreen
    */    
   public MenuScreen() {
      initComponents();
      setInvisible();
      updateReturnButton();
      addActionListeners();
      
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        welcomeScreen = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        modeScreen = new javax.swing.JPanel();
        learnButton = new javax.swing.JButton();
        challengeButton = new javax.swing.JButton();
        testButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        background2 = new javax.swing.JLabel();
        learnModeLevelScreen = new algoZoo.learn.LearnModeLevelsGUI();
        testModeLevelScreen = new algoZoo.test.TestModeLevelsGUI();
        challengeModeLevelScreen = new algoZoo.challenge.ChallengeModeLevelsGUI();
        learnModeGUI = new algoZoo.learn.LearnModeGUI();
        challengeModeGUI = new algoZoo.challenge.ChallengeModeGUI();
        testModeGUI = new algoZoo.test.TestModeGUI();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(null);

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Return_Button.png"))); // NOI18N
        returnButton.setBorder(null);
        returnButton.setContentAreaFilled(false);
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnButtonMouseExited(evt);
            }
        });
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton);
        returnButton.setBounds(10, 730, 90, 65);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1310, 10, 73, 23);

        welcomeScreen.setPreferredSize(new java.awt.Dimension(1400, 800));
        welcomeScreen.setLayout(null);

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Button.png"))); // NOI18N
        playButton.setBorder(null);
        playButton.setContentAreaFilled(false);
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playButtonMouseExited(evt);
            }
        });
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        welcomeScreen.add(playButton);
        playButton.setBounds(580, 420, 270, 80);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Exit_Button.png"))); // NOI18N
        exitButton.setBorder(null);
        exitButton.setContentAreaFilled(false);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        welcomeScreen.add(exitButton);
        exitButton.setBounds(580, 570, 270, 80);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Welcome_Screen_Background.png"))); // NOI18N
        welcomeScreen.add(background);
        background.setBounds(0, 0, 1400, 800);

        getContentPane().add(welcomeScreen);
        welcomeScreen.setBounds(0, 0, 1400, 800);

        modeScreen.setLayout(null);

        learnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Learn_Button.png"))); // NOI18N
        learnButton.setBorder(null);
        learnButton.setContentAreaFilled(false);
        learnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        learnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                learnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                learnButtonMouseExited(evt);
            }
        });
        learnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnButtonActionPerformed(evt);
            }
        });
        modeScreen.add(learnButton);
        learnButton.setBounds(580, 310, 270, 80);

        challengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Challenge_Button.png"))); // NOI18N
        challengeButton.setBorder(null);
        challengeButton.setContentAreaFilled(false);
        challengeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        challengeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                challengeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                challengeButtonMouseExited(evt);
            }
        });
        challengeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challengeButtonActionPerformed(evt);
            }
        });
        modeScreen.add(challengeButton);
        challengeButton.setBounds(580, 460, 270, 80);

        testButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Test_Button.png"))); // NOI18N
        testButton.setBorder(null);
        testButton.setContentAreaFilled(false);
        testButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                testButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                testButtonMouseExited(evt);
            }
        });
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });
        modeScreen.add(testButton);
        testButton.setBounds(580, 610, 270, 80);

        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Info_Button.png"))); // NOI18N
        infoButton.setBorder(null);
        infoButton.setContentAreaFilled(false);
        infoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modeScreen.add(infoButton);
        infoButton.setBounds(1340, 752, 50, 42);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Mode_Screen_Background.png"))); // NOI18N
        modeScreen.add(background2);
        background2.setBounds(0, 0, 1400, 800);

        getContentPane().add(modeScreen);
        modeScreen.setBounds(0, 0, 1400, 800);
        getContentPane().add(learnModeLevelScreen);
        learnModeLevelScreen.setBounds(0, 0, 1400, 800);
        getContentPane().add(testModeLevelScreen);
        testModeLevelScreen.setBounds(0, 0, 1400, 800);

        javax.swing.GroupLayout challengeModeLevelScreenLayout = new javax.swing.GroupLayout(challengeModeLevelScreen);
        challengeModeLevelScreen.setLayout(challengeModeLevelScreenLayout);
        challengeModeLevelScreenLayout.setHorizontalGroup(
            challengeModeLevelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        challengeModeLevelScreenLayout.setVerticalGroup(
            challengeModeLevelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        getContentPane().add(challengeModeLevelScreen);
        challengeModeLevelScreen.setBounds(0, 0, 1400, 800);
        getContentPane().add(learnModeGUI);
        learnModeGUI.setBounds(0, 0, 1400, 800);

        challengeModeGUI.setPreferredSize(new java.awt.Dimension(1400, 800));
        getContentPane().add(challengeModeGUI);
        challengeModeGUI.setBounds(0, 0, 1400, 800);
        getContentPane().add(testModeGUI);
        testModeGUI.setBounds(0, 0, 1400, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
   private void setInvisible() {
      // set invisible all panels except for welcomeScreen at first
      modeScreen.setVisible(false);
      learnModeLevelScreen.setVisible(false);
      testModeLevelScreen.setVisible(false);
      challengeModeLevelScreen.setVisible(false);
      learnModeGUI.setVisible(false); 
      challengeModeGUI.setVisible(false);      
      testModeGUI.setVisible(false);
   }
   
   private void updateReturnButton() {
      if (welcomeScreen.isVisible()) {
         returnButton.setVisible(false);
      }
      else {
         returnButton.setVisible(true);  
      } 
   }
   
   private void addActionListeners() {
      learnModeLevelScreen.getjButton1().addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            learnModeLevelScreen.setVisible(false);
            learnModeGUI.setVisible(true);
            learnModeGUI.initNewGame();
         }
      });
      
      challengeModeLevelScreen.getjButton1().addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            challengeModeLevelScreen.setVisible(false);
            challengeModeGUI.setVisible(true);
            challengeModeGUI.initNewGame();
            challengeModeGUI.startTimer();
         }
      });
      
      testModeLevelScreen.getjButton1().addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            testModeLevelScreen.setVisible(false);
            testModeGUI.setVisible(true);
            testModeGUI.initNewGame();
         }
      });
   }
   
   private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
      welcomeScreen.setVisible(false);
      modeScreen.setVisible(true);
      updateReturnButton();
   }//GEN-LAST:event_playButtonActionPerformed

   private void playButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseEntered
      playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Button_Clicked.png")));
   }//GEN-LAST:event_playButtonMouseEntered

   private void playButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseExited
      playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Button.png")));
   }//GEN-LAST:event_playButtonMouseExited

   private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
      System.exit(0);
   }//GEN-LAST:event_exitButtonActionPerformed

   private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
      exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Exit_Button_Clicked.png")));
   }//GEN-LAST:event_exitButtonMouseEntered

   private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
      exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Exit_Button.png")));
   }//GEN-LAST:event_exitButtonMouseExited

   private void learnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnButtonMouseEntered
      learnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Learn_Button_Clicked.png")));
   }//GEN-LAST:event_learnButtonMouseEntered

   private void learnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnButtonMouseExited
      learnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Learn_Button.png")));
   }//GEN-LAST:event_learnButtonMouseExited

   private void learnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnButtonActionPerformed
      modeScreen.setVisible(false);
      learnModeLevelScreen.setVisible(true);
      updateReturnButton();
   }//GEN-LAST:event_learnButtonActionPerformed

   private void challengeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_challengeButtonMouseEntered
      challengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Challenge_Button_Clicked.png")));
   }//GEN-LAST:event_challengeButtonMouseEntered

   private void challengeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_challengeButtonMouseExited
      challengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Challenge_Button.png")));
   }//GEN-LAST:event_challengeButtonMouseExited

   private void challengeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_challengeButtonActionPerformed
      modeScreen.setVisible(false);
      challengeModeLevelScreen.setVisible(true);
      updateReturnButton();
   }//GEN-LAST:event_challengeButtonActionPerformed

   private void testButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testButtonMouseEntered
      testButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Test_Button_Clicked.png")));
   }//GEN-LAST:event_testButtonMouseEntered

   private void testButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testButtonMouseExited
      testButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Test_Button.png")));
   }//GEN-LAST:event_testButtonMouseExited

   private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
      modeScreen.setVisible(false);
      testModeLevelScreen.setVisible(true);
      updateReturnButton();
   }//GEN-LAST:event_testButtonActionPerformed

   private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
      if (modeScreen.isVisible()) {
         modeScreen.setVisible(false);
         welcomeScreen.setVisible(true);
      }
      else if ( learnModeLevelScreen.isVisible() || testModeLevelScreen.isVisible() || challengeModeLevelScreen.isVisible()) {
         learnModeLevelScreen.setVisible(false);
         testModeLevelScreen.setVisible(false);
         challengeModeLevelScreen.setVisible(false);
         modeScreen.setVisible(true);
      }
      else if ( learnModeGUI.isVisible()) {
         learnModeGUI.setVisible(false);
         learnModeLevelScreen.setVisible(true);
      }
      else if ( challengeModeGUI.isVisible()) {
         challengeModeGUI.setVisible(false);
         challengeModeLevelScreen.setVisible(true);
      }
      else if ( testModeGUI.isVisible()) {
         testModeGUI.setVisible(false);
         testModeLevelScreen.setVisible(true);
      }
      updateReturnButton();
   }//GEN-LAST:event_returnButtonActionPerformed

   private void returnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseEntered
      returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Return_Button_Clicked.png")));
   }//GEN-LAST:event_returnButtonMouseEntered

   private void returnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseExited
      returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Return_Button.png")));
   }//GEN-LAST:event_returnButtonMouseExited

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      System.exit(0);
   }//GEN-LAST:event_jButton1ActionPerformed

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new MenuScreen().setVisible(true);
         }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel background2;
    private javax.swing.JButton challengeButton;
    private algoZoo.challenge.ChallengeModeGUI challengeModeGUI;
    private algoZoo.challenge.ChallengeModeLevelsGUI challengeModeLevelScreen;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton learnButton;
    private algoZoo.learn.LearnModeGUI learnModeGUI;
    private algoZoo.learn.LearnModeLevelsGUI learnModeLevelScreen;
    private javax.swing.JPanel modeScreen;
    private javax.swing.JButton playButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton testButton;
    private algoZoo.test.TestModeGUI testModeGUI;
    private algoZoo.test.TestModeLevelsGUI testModeLevelScreen;
    private javax.swing.JPanel welcomeScreen;
    // End of variables declaration//GEN-END:variables
}
