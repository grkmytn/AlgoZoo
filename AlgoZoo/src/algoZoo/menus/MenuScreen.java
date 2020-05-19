/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.menus;

import algoZoo.game.Animal;
import algoZoo.game.LevelButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

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
   
   //methods
   /**
    * Method to play sound when buttons clicked.
    * @param soundName 
    */
   public void playSound(String filePath) 
   {     
        try 
        {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath) );
            Clip clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );
        }
        catch(Exception ex)
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace( );
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

      returnButton = new javax.swing.JButton();
      quickExitButton = new javax.swing.JButton();
      welcomeScreen = new javax.swing.JPanel();
      playButton = new javax.swing.JButton();
      exitButton = new javax.swing.JButton();
      background = new javax.swing.JLabel();
      modeScreen = new javax.swing.JPanel();
      learnButton = new javax.swing.JButton();
      challengeButton = new javax.swing.JButton();
      testButton = new javax.swing.JButton();
      infoButton = new javax.swing.JButton();
      bee = new javax.swing.JLabel();
      bee2 = new javax.swing.JLabel();
      bee3 = new javax.swing.JLabel();
      bee4 = new javax.swing.JLabel();
      previous = new javax.swing.JButton();
      next = new javax.swing.JButton();
      background2 = new javax.swing.JLabel();
      infoScreen1 = new algoZoo.game.InfoScreen();
      learnModeLevelScreen = new algoZoo.learn.LearnModeLevelsGUI();
      testModeLevelScreen = new algoZoo.test.TestModeLevelsGUI();
      challengeModeLevelScreen = new algoZoo.challenge.ChallengeModeLevelsGUI();
      learnModeGUI = new algoZoo.learn.LearnModeGUI();
      challengeModeGUI = new algoZoo.challenge.ChallengeModeGUI();
      testModeGUI = new algoZoo.test.TestModeGUI();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setMaximumSize(new java.awt.Dimension(1400, 800));
      setMinimumSize(new java.awt.Dimension(1400, 800));
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

      quickExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Quick_Exit_Button.png"))); // NOI18N
      quickExitButton.setBorder(null);
      quickExitButton.setContentAreaFilled(false);
      quickExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      quickExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            quickExitButtonMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            quickExitButtonMouseExited(evt);
         }
      });
      quickExitButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            quickExitButtonActionPerformed(evt);
         }
      });
      getContentPane().add(quickExitButton);
      quickExitButton.setBounds(1340, 10, 50, 50);

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
      infoButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            infoButtonActionPerformed(evt);
         }
      });
      modeScreen.add(infoButton);
      infoButton.setBounds(1340, 752, 50, 42);

      bee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Exhibition.png"))); // NOI18N
      bee.setPreferredSize(new java.awt.Dimension(48, 40));
      modeScreen.add(bee);
      bee.setBounds(1163, 451, 100, 100);

      bee2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Exhibition.png"))); // NOI18N
      bee2.setMaximumSize(new java.awt.Dimension(95, 95));
      bee2.setMinimumSize(new java.awt.Dimension(95, 95));
      bee2.setPreferredSize(new java.awt.Dimension(95, 95));
      modeScreen.add(bee2);
      bee2.setBounds(1163, 451, 100, 100);

      bee3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Exhibition.png"))); // NOI18N
      bee3.setMaximumSize(new java.awt.Dimension(95, 95));
      bee3.setMinimumSize(new java.awt.Dimension(95, 95));
      bee3.setPreferredSize(new java.awt.Dimension(95, 95));
      modeScreen.add(bee3);
      bee3.setBounds(1163, 451, 100, 100);

      bee4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Exhibition.png"))); // NOI18N
      bee4.setMaximumSize(new java.awt.Dimension(95, 95));
      bee4.setMinimumSize(new java.awt.Dimension(95, 95));
      bee4.setPreferredSize(new java.awt.Dimension(95, 95));
      modeScreen.add(bee4);
      bee4.setBounds(1163, 451, 100, 100);

      previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Previous_Change_Button.png"))); // NOI18N
      previous.setBorder(null);
      previous.setContentAreaFilled(false);
      previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      previous.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            previousMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            previousMouseExited(evt);
         }
      });
      previous.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            previousActionPerformed(evt);
         }
      });
      modeScreen.add(previous);
      previous.setBounds(1090, 472, 36, 60);

      next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Next_Change_Button.png"))); // NOI18N
      next.setBorder(null);
      next.setContentAreaFilled(false);
      next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      next.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            nextMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            nextMouseExited(evt);
         }
      });
      next.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            nextActionPerformed(evt);
         }
      });
      modeScreen.add(next);
      next.setBounds(1300, 472, 36, 60);

      background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Mode_Screen_Background.png"))); // NOI18N
      modeScreen.add(background2);
      background2.setBounds(0, 0, 1400, 800);

      getContentPane().add(modeScreen);
      modeScreen.setBounds(0, 0, 1400, 800);

      infoScreen1.setOpaque(false);
      getContentPane().add(infoScreen1);
      infoScreen1.setBounds(0, 0, 1400, 800);
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
      infoScreen1.setVisible(false);
      quickExitButton.setVisible(false);

   }

   private void updateReturnButton() {
      if (welcomeScreen.isVisible()) {
         returnButton.setVisible(false);
      } else {
         returnButton.setVisible(true);
      }
   }

   private void addActionListeners() {
      for (int i = 1; i <= 10; i++) {
         learnModeLevelScreen.getJButton(i).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               learnModeLevelScreen.setVisible(false);
               learnModeGUI.setCurrentLevel(((LevelButton) e.getSource()).getLevelNo());
               learnModeGUI.setVisible(true);
               learnModeGUI.initNewGame();
               quickExitButton.setVisible(false);
               playSound( "src/algoZoo/Sounds/Start_Level.wav" );
            }
         });

      }

      for (int i = 1; i <= 10; i++) {
         challengeModeLevelScreen.getJButton(i).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               challengeModeLevelScreen.setVisible(false);
               challengeModeGUI.setCurrentLevel(((LevelButton) e.getSource()).getLevelNo());
               challengeModeGUI.setVisible(true);
               challengeModeGUI.initNewGame();
               challengeModeGUI.startTimer();
               quickExitButton.setVisible(false);
               playSound( "src/algoZoo/Sounds/Start_Level.wav" );
            }
         });
      }

      for (int i = 1; i <= 10; i++) {
         testModeLevelScreen.getJButton(i).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               testModeLevelScreen.setVisible(false);
               testModeGUI.setCurrentLevel(((LevelButton) e.getSource()).getLevelNo());
               testModeGUI.setVisible(true);
               testModeGUI.initNewGame();
               quickExitButton.setVisible(false);
               playSound( "src/algoZoo/Sounds/Start_Level.wav" );
            }
         });
      }
   }
   
   

   private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
      welcomeScreen.setVisible(false);
      modeScreen.setVisible(true);
      bee2.setVisible(false);
      bee3.setVisible(false);
      bee4.setVisible(false);
      quickExitButton.setVisible(true);
      updateReturnButton();
      playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
   }//GEN-LAST:event_playButtonActionPerformed

   private void playButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseEntered
      playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Button_Clicked.png")));
   }//GEN-LAST:event_playButtonMouseEntered

   private void playButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseExited
      playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Button.png")));
   }//GEN-LAST:event_playButtonMouseExited

   private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
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
      playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
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
      playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
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
      playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
   }//GEN-LAST:event_testButtonActionPerformed

   private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
    if(challengeModeGUI.isBeeMoving() || learnModeGUI.isBeeMoving() || testModeGUI.isBeeMoving()) {}
      else {
       if (modeScreen.isVisible()) {
         modeScreen.setVisible(false);
         welcomeScreen.setVisible(true);
         quickExitButton.setVisible(false);
      } else if (infoScreen1.isVisible()) {
         infoScreen1.setVisible(false);
         modeScreen.setVisible(true);
      } else if (learnModeLevelScreen.isVisible() || testModeLevelScreen.isVisible() || challengeModeLevelScreen.isVisible()) {
         learnModeLevelScreen.setVisible(false);
         testModeLevelScreen.setVisible(false);
         challengeModeLevelScreen.setVisible(false);
         modeScreen.setVisible(true);
      } else if (learnModeGUI.isVisible()) {
         learnModeGUI.setVisible(false);
         learnModeLevelScreen.setVisible(true);
         quickExitButton.setVisible(true);
         if (learnModeGUI.getModel().hasWon()) {
            if (learnModeGUI.getLevel() != 10) {
               learnModeLevelScreen.setJButtonIcon(learnModeLevelScreen.getJButton(learnModeGUI.getLevel() + 1), new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Learn Mode/" + (learnModeGUI.getLevel() + 1) + ".png")));
               learnModeLevelScreen.getJButton(learnModeGUI.getLevel() + 1).setEnabled(true);
            }
         }
      } else if (challengeModeGUI.isVisible()) {
         challengeModeGUI.setVisible(false);
         challengeModeLevelScreen.setVisible(true);
         quickExitButton.setVisible(true);
         if (challengeModeGUI.getModel().hasWon()) {
            if (challengeModeGUI.getLevel() != 10) {
               challengeModeLevelScreen.setJButtonIcon(challengeModeLevelScreen.getJButton(challengeModeGUI.getLevel() + 1), new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Challenge Mode/" + (challengeModeGUI.getLevel() + 1) + ".png")));
               challengeModeLevelScreen.getJButton(challengeModeGUI.getLevel() + 1).setEnabled(true);
            }
            challengeModeLevelScreen.setEfficiencyStars(challengeModeLevelScreen.getJLabel(challengeModeGUI.getLevel()), challengeModeGUI.getEfficiency());
         }
         challengeModeGUI.stopTimer();
      } else if (testModeGUI.isVisible()) {
         testModeGUI.setVisible(false);
         testModeLevelScreen.setVisible(true);
         quickExitButton.setVisible(true);
         if (testModeGUI.getModel().hasWon()) {
            if (testModeGUI.getLevel() != 10) {
               testModeLevelScreen.setJButtonIcon(testModeLevelScreen.getJButton(testModeGUI.getLevel() + 1), new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Levels/Test Mode/" + (testModeGUI.getLevel() + 1) + ".png")));
               testModeLevelScreen.getJButton(testModeGUI.getLevel() + 1).setEnabled(true);
            }
         }
      }
      updateReturnButton();
      }
    
    playSound( "src/algoZoo/Sounds/Return_Button.wav" );
   }//GEN-LAST:event_returnButtonActionPerformed

   private void returnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseEntered
      returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Return_Button_Clicked.png")));
   }//GEN-LAST:event_returnButtonMouseEntered

   private void returnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseExited
      returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Return_Button.png")));
   }//GEN-LAST:event_returnButtonMouseExited

   private void quickExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickExitButtonActionPerformed
       playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
       System.exit(0);     
   }//GEN-LAST:event_quickExitButtonActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
       if (bee.isVisible()) {
          bee.setVisible(false);
          bee4.setVisible(true);
          Animal animal;
          animal = new Animal("Bee4", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Right.png")));
          challengeModeGUI.setAnimal(animal);
          learnModeGUI.setAnimal(animal);
          testModeGUI.setAnimal(animal);
       } 
       else if (bee2.isVisible()) {
          bee2.setVisible(false);
          bee.setVisible(true);
          Animal animal;
          animal = new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));
          challengeModeGUI.setAnimal(animal);
          learnModeGUI.setAnimal(animal);
          testModeGUI.setAnimal(animal);
       }
       else if (bee3.isVisible()) {
          bee3.setVisible(false);
          bee2.setVisible(true);
          Animal animal;
          animal = new Animal("Bee2", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Right.png")));
          challengeModeGUI.setAnimal(animal);
          learnModeGUI.setAnimal(animal);
          testModeGUI.setAnimal(animal);
       }
       else if (bee4.isVisible()) {
          bee4.setVisible(false);
          bee3.setVisible(true);
          Animal animal;
          animal = new Animal("Bee3", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Right.png")));
          challengeModeGUI.setAnimal(animal);
          learnModeGUI.setAnimal(animal);
          testModeGUI.setAnimal(animal);
       }
       
       playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
    }//GEN-LAST:event_previousActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
       if (bee.isVisible()) {
          bee.setVisible(false);
          bee2.setVisible(true);
          Animal animal;
          animal = new Animal("Bee2", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Right.png")));
          challengeModeGUI.setAnimal(animal);
          learnModeGUI.setAnimal(animal);
          testModeGUI.setAnimal(animal);
       }
       else if (bee2.isVisible()) {
          bee2.setVisible(false);
          bee3.setVisible(true);
          Animal animal;
          animal = new Animal("Bee3", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Right.png")));
          challengeModeGUI.setAnimal(animal);
          learnModeGUI.setAnimal(animal);
          testModeGUI.setAnimal(animal);
       }
       else if (bee3.isVisible()) {
          bee3.setVisible(false);
          bee4.setVisible(true);
          Animal animal;
          animal = new Animal("Bee4", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Right.png")));
          challengeModeGUI.setAnimal(animal);
          learnModeGUI.setAnimal(animal);
          testModeGUI.setAnimal(animal);
       }
       else if (bee4.isVisible()) {
          bee4.setVisible(false);
          bee.setVisible(true);
          Animal animal;
          animal = new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));
          challengeModeGUI.setAnimal(animal);
          learnModeGUI.setAnimal(animal);
          testModeGUI.setAnimal(animal);
       }
       
       playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
    }//GEN-LAST:event_nextActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
       modeScreen.setVisible(false);
       infoScreen1.setVisible(true);
       updateReturnButton();
       playSound( "src/algoZoo/Sounds/Info_Button.wav" );
    }//GEN-LAST:event_infoButtonActionPerformed

   private void nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseEntered
      next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Next_Change_Button_Clicked.png")));
   }//GEN-LAST:event_nextMouseEntered

   private void nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseExited
      next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Next_Change_Button.png")));
   }//GEN-LAST:event_nextMouseExited

   private void previousMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseEntered
      previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Previous_Change_Button_Clicked.png")));
   }//GEN-LAST:event_previousMouseEntered

   private void previousMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseExited
      previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Previous_Change_Button.png")));
   }//GEN-LAST:event_previousMouseExited

   private void quickExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quickExitButtonMouseEntered
      quickExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Quick_Exit_Button_Clicked.png")));
   }//GEN-LAST:event_quickExitButtonMouseEntered

   private void quickExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quickExitButtonMouseExited
      quickExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Quick_Exit_Button.png")));
   }//GEN-LAST:event_quickExitButtonMouseExited

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
   private javax.swing.JLabel bee;
   private javax.swing.JLabel bee2;
   private javax.swing.JLabel bee3;
   private javax.swing.JLabel bee4;
   private javax.swing.JButton challengeButton;
   private algoZoo.challenge.ChallengeModeGUI challengeModeGUI;
   private algoZoo.challenge.ChallengeModeLevelsGUI challengeModeLevelScreen;
   private javax.swing.JButton exitButton;
   private javax.swing.JButton infoButton;
   private algoZoo.game.InfoScreen infoScreen1;
   private javax.swing.JButton learnButton;
   private algoZoo.learn.LearnModeGUI learnModeGUI;
   private algoZoo.learn.LearnModeLevelsGUI learnModeLevelScreen;
   private javax.swing.JPanel modeScreen;
   private javax.swing.JButton next;
   private javax.swing.JButton playButton;
   private javax.swing.JButton previous;
   private javax.swing.JButton quickExitButton;
   private javax.swing.JButton returnButton;
   private javax.swing.JButton testButton;
   private algoZoo.test.TestModeGUI testModeGUI;
   private algoZoo.test.TestModeLevelsGUI testModeLevelScreen;
   private javax.swing.JPanel welcomeScreen;
   // End of variables declaration//GEN-END:variables
}
