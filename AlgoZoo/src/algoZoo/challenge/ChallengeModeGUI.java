/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import algoZoo.game.*;
import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * This class is for basic GUI design of Challenge Mode
 *
 * @author Doğa, Esra, Alp
 * @version 1.0
 */
public class ChallengeModeGUI extends javax.swing.JPanel {

   // properties
   MapView mapView;
   CodeView codeView;
   TimerController timer;
   ChallengeLevels currentLevel;
   ChallengeModeModel cmm;
   SelectionController selectionController;
   ChallengeLevelsContainer challengeLevelsContainer;

   /**
    * Creates new form ChallengeModeGUI
    */
   public ChallengeModeGUI() {
      //Initialize all components
      initMyComponents();
      initComponents();
      addScroll();
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

        playButton = new javax.swing.JButton();
        retryButton = new javax.swing.JButton();
        scrollUp = new javax.swing.JButton();
        scrollDown = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setLayout(null);

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Game_Button.png"))); // NOI18N
        playButton.setBorder(null);
        playButton.setContentAreaFilled(false);
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Game_Button.png"))); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        add(playButton);
        playButton.setBounds(1005, 335, 80, 70);

        retryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Retry_Button.png"))); // NOI18N
        retryButton.setBorder(null);
        retryButton.setContentAreaFilled(false);
        retryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });
        add(retryButton);
        retryButton.setBounds(0, 0, 40, 40);

        scrollUp.setText("scroll up");
        scrollUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollUpActionPerformed(evt);
            }
        });
        add(scrollUp);
        scrollUp.setBounds(1070, 30, 71, 21);

        scrollDown.setText("scroll down");
        scrollDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollDownActionPerformed(evt);
            }
        });
        add(scrollDown);
        scrollDown.setBounds(1050, 760, 100, 21);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/In_Game_Background.png"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1400, 800);
    }// </editor-fold>//GEN-END:initComponents

   private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
      if(cmm.getMovementPattern().isEmpty() || cmm.isGameOver() || !timer.isRunning()) { } 
      else {
        getModel().play(); //sends a message to model to move the animal according to the movement algorithm
        for (JButton b : selectionController.getButtons()) {
           b.setEnabled(false);
        }
        selectionController.getForButton().setEnabled(false);
        if (cmm.getMovementPattern().isEmpty()) {
           mapView.endMessage();
        }
      }

      playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
   }//GEN-LAST:event_playButtonActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
       if (isBeeMoving()) {
       } else {
          cmm.resetMovementPattern();
          if (cmm.getAnimal().getName().equals("Bee")) {
             cmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));
          } else if (cmm.getAnimal().getName().equals("Bee2")) {
             cmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Right.png")));
          } else if (cmm.getAnimal().getName().equals("Bee3")) {
             cmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Right.png")));
          } else if (cmm.getAnimal().getName().equals("Bee4")) {
             cmm.getAnimal().setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Right.png")));
          }
          cmm.setCurrentX(cmm.getStartX());
          cmm.setCurrentY(cmm.getStartY());
          cmm.setGameOver(false);
          cmm.update();
          mapView.resetMap();
          timer.stopTimer();
          timer.resetTimer();
          selectionController.resetSelectionController();
          playButton.setEnabled(true);
          initNewLevel();
          timer.startTimer();
          codeView.setLocation(845, 0);
       }

       playSound( "src/algoZoo/Sounds/Click_Sound_Soft.wav" );
    }//GEN-LAST:event_retryButtonActionPerformed

    private void scrollUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollUpActionPerformed
        int x = codeView.getX();
        int y = codeView.getY();
        int h = codeView.getHeight();
        
        if(y == 0) { }
        else {
            codeView.setLocation(x, y + 50);
        }
    }//GEN-LAST:event_scrollUpActionPerformed

    private void scrollDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollDownActionPerformed
        int x = codeView.getX();
        int y = codeView.getY();
        int h = codeView.getHeight();
                
        if(y == 800 - h || codeView.getLength() < 800 || (codeView.getLength() - 800 + 10) < -y) { }
        else {
            codeView.setLocation(x, y - 50);
        }
    }//GEN-LAST:event_scrollDownActionPerformed

   /**
    * Method for initializing custom made components
    */
   private void initMyComponents() {
      // initialize components  
      initLevels();
      currentLevel = challengeLevelsContainer.get(0);
      cmm = new ChallengeModeModel(currentLevel.getStartX(), currentLevel.getStartY(), currentLevel.getFinishX(), currentLevel.getFinishY(), currentLevel.getMinRequiredMovements(), currentLevel.getMinRequiredTime(), currentLevel.getFlowers());

      mapView = new MapView(cmm);
      codeView = new CodeView();
      selectionController = new SelectionController(cmm);
      timer = new TimerController(cmm);

      initNewLevel(); //initialize a new level
      mapView.getMapBackground().setIcon(currentLevel.getMapBackground()); //set the map

      // place components to panel and setVisible
      add(mapView);
      mapView.setBounds(50, 50, 640, 640);
      add(codeView);
      codeView.setBounds(845, 0, 200, 2000);
      add(selectionController);
      selectionController.setBounds(1200, 0, 200, 800);
      add(timer);
      timer.setBounds(306, 720, 128, 50);

      // add required views 
      cmm.addView(mapView);
      cmm.addView(codeView);
      cmm.addView(selectionController);
      cmm.addView(selectionController.getForView());
   }

   /**
    * Initialize all the levels for Challenge Mode with setting required
    * properties
    */
   public void initLevels() {
      ChallengeLevels level1 = new ChallengeLevels(6, 8, 3, 5, 8, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level1.png")), 1, true);
      ChallengeLevels level2 = new ChallengeLevels(6, 9, 5, 6, 11, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level2.png")), 2, false);
      ChallengeLevels level3 = new ChallengeLevels(4, 7, 6, 6, 11, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level3.png")), 3, false);
      ChallengeLevels level4 = new ChallengeLevels(6, 6, 8, 5, 9, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level4.png")), 4, false);
      ChallengeLevels level5 = new ChallengeLevels(2, 9, 8, 9, 14, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level5.png")), 5, false);
      ChallengeLevels level6 = new ChallengeLevels(4, 7, 8, 7, 9, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level6.png")), 6, false);
      ChallengeLevels level7 = new ChallengeLevels(8, 7, 2, 4, 13, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level7.png")), 7, false);
      ChallengeLevels level8 = new ChallengeLevels(4, 7, 4, 3, 8, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level8.png")), 8, false);
      ChallengeLevels level9 = new ChallengeLevels(5, 9, 7, 5, 14, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level9.png")), 9, false);
      ChallengeLevels level10 = new ChallengeLevels(8, 1, 3, 7, 21, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/ChallengeMode/Level10.png")), 10, false);

      // Set flowers
      ArrayList<Flower> flowerContainer = new ArrayList<>();

      //Level1
      flowerContainer.add(new Flower(5, 7));
      flowerContainer.add(new Flower(4, 6));
      level1.setFlowers(flowerContainer);

      //Level2
      flowerContainer.add(new Flower(6, 7));
      flowerContainer.add(new Flower(7, 8));
      flowerContainer.add(new Flower(7, 6));
      level2.setFlowers(flowerContainer);

      //Level3
      flowerContainer.add(new Flower(6, 8));
      flowerContainer.add(new Flower(8, 7));
      level3.setFlowers(flowerContainer);

      //Level4
      flowerContainer.add(new Flower(6, 5));
      flowerContainer.add(new Flower(8, 7));
      level4.setFlowers(flowerContainer);

      //Level5
      flowerContainer.add(new Flower(3, 8));
      flowerContainer.add(new Flower(4, 7));
      flowerContainer.add(new Flower(6, 8));
      flowerContainer.add(new Flower(7, 9));
      level5.setFlowers(flowerContainer);

      //Level6
      flowerContainer.add(new Flower(5, 8));
      flowerContainer.add(new Flower(6, 8));
      flowerContainer.add(new Flower(7, 8));
      level6.setFlowers(flowerContainer);

      //Level7
      flowerContainer.add(new Flower(2, 6));
      flowerContainer.add(new Flower(4, 6));
      flowerContainer.add(new Flower(6, 6));
      flowerContainer.add(new Flower(7, 7));
      level7.setFlowers(flowerContainer);

      //Level8
      flowerContainer.add(new Flower(4, 4));
      flowerContainer.add(new Flower(4, 5));
      flowerContainer.add(new Flower(4, 6));
      flowerContainer.add(new Flower(4, 7));
      level8.setFlowers(flowerContainer);

      //Level9
      flowerContainer.add(new Flower(3, 7));
      flowerContainer.add(new Flower(4, 8));
      flowerContainer.add(new Flower(4, 6));
      flowerContainer.add(new Flower(5, 5));
      level9.setFlowers(flowerContainer);

      //Level10      
      flowerContainer.add(new Flower(8, 3));
      flowerContainer.add(new Flower(7, 4));
      flowerContainer.add(new Flower(8, 5));
      flowerContainer.add(new Flower(7, 6));
      flowerContainer.add(new Flower(6, 7));
      flowerContainer.add(new Flower(5, 8));
      level10.setFlowers(flowerContainer);

      //add all the levels to an ArrayList
      challengeLevelsContainer = new ChallengeLevelsContainer();
      challengeLevelsContainer.add(level1);
      challengeLevelsContainer.add(level2);
      challengeLevelsContainer.add(level3);
      challengeLevelsContainer.add(level4);
      challengeLevelsContainer.add(level5);
      challengeLevelsContainer.add(level6);
      challengeLevelsContainer.add(level7);
      challengeLevelsContainer.add(level8);
      challengeLevelsContainer.add(level9);
      challengeLevelsContainer.add(level10);
      ChallengeLevelsSave.save(challengeLevelsContainer);
   }
   
   public void addScroll() {
       codeView.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                int a = evt.getWheelRotation();
                
                int x = codeView.getX();
                int y = codeView.getY();
                int h = codeView.getHeight();
                int b = 0;
                
                if(a > 0) {
                    if(y == 800 - h || codeView.getLength() < 800 || (codeView.getLength() - 800 + 10) < -y) {
                        a = 0;
                    }
                    else {
                        b -= 50;
                        codeView.setLocation(x, y + b);
                    }
                }
                if(a < 0) {
                    if(y == 0) {
                        a = 0;
                    }
                    else {
                        b += 50;
                        codeView.setLocation(x, y + b);
                    }
                }
            }
        });
   }

   /**
    * Method for starting the timer
    */
   public void startTimer() {
      timer.startTimer();
   }

   /**
    * Initializes new level by getting information from the currentLevel
    * property
    */
   public void initNewLevel() {
      cmm.setStartX(currentLevel.getStartX());
      cmm.setStartY(currentLevel.getStartY());
      cmm.setFinishX(currentLevel.getFinishX());
      cmm.setFinishY(currentLevel.getFinishY());
      cmm.setMinRequiredMovements(currentLevel.getMinRequiredMovements());
      cmm.setMinRequiredTime(currentLevel.getMinRequiredTime());
      cmm.setFlowers(currentLevel.getFlowers());
      mapView.getMapBackground().setIcon(currentLevel.getMapBackground());
   }

   /**
    * Determines which level will start.
    *
    * @param level level number.
    */
   public void setCurrentLevel(int level) {
      currentLevel = challengeLevelsContainer.get(level - 1);
      initNewLevel();
   }

   /**
    * Initializes new game
    */
   public void initNewGame() {
      cmm.initNewGame();
      mapView.resetMap();
      timer.resetTimer();
      selectionController.resetSelectionController();
      playButton.setEnabled(true);
      codeView.setLocation(845, 0);
   }

   /**
    * Returns the model class
    *
    * @return cmm
    */
   public ChallengeModeModel getModel() {
      return cmm;
   }

   /**
    * Sets the animal according to the parametre
    *
    * @param animal
    */
   public void setAnimal(Animal animal) {
      cmm.setAnimal(animal);
   }

   /**
    * Returns the efficiency of the current level
    *
    * @return cmm.getEfficiency()
    */
   public int getEfficiency() {
      return cmm.getEfficiency();
   }

   public int getLevel() {
      return currentLevel.getLevel();
   }

   /**
    * Method for stopping the timer
    */
   public void stopTimer() {
      timer.stopTimer();
   }

   public boolean isBeeMoving() {
      return mapView.isBeeMoving();
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton playButton;
    private javax.swing.JButton retryButton;
    private javax.swing.JButton scrollDown;
    private javax.swing.JButton scrollUp;
    // End of variables declaration//GEN-END:variables
}
