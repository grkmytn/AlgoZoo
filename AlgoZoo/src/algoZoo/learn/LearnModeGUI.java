/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.learn;

import algoZoo.game.Animal;
import algoZoo.game.CodeView;
import algoZoo.game.MapView;
import algoZoo.game.SelectionController;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Ayberk, Görkem
 * @version 1.0
 */
public class LearnModeGUI extends javax.swing.JPanel {

   // properties
   MapView mapView;
   CodeView codeView;
   LearnModeModel lmm;
   SelectionController selectionController;
   LearnLevels currentLevel;
   ArrayList<LearnLevels> levelContainer;

   // constructor
   /**
    * Creates new form LearnModeGUI
    */
   public LearnModeGUI() {
      initMyComponents();
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      background = new javax.swing.JLabel();

      setLayout(null);

      background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/In_Game_Background.png"))); // NOI18N
      add(background);
      background.setBounds(0, 0, 1400, 800);
   }// </editor-fold>//GEN-END:initComponents

   // methods
   /**
    *
    */
   private void initMyComponents() {
      // initialize components  

      initLevels();
      currentLevel = levelContainer.get(0);
      lmm = new LearnModeModel(currentLevel.getAnimal(), currentLevel.getStartX(), currentLevel.getStartY(), currentLevel.getFinishX(), currentLevel.getFinishY());

      mapView = new MapView(lmm);
      codeView = new CodeView();
      selectionController = new SelectionController(lmm);
      initNewLevel();
      mapView.getMapBackground().setIcon(currentLevel.getMapBackground());

      // place components to panel and setVisible
      add(mapView);
      mapView.setBounds(50, 50, 640, 640);
      add(codeView);
      codeView.setBounds(845, 50, 200, 640);
      add(selectionController);
      selectionController.setBounds(1200, 0, 200, 800);

      // initialize game
      lmm.addView(mapView);
      lmm.addView(codeView);

      if (lmm.hasWon()) {
         System.out.println("won");
      }
   }

   /**
    * Initialize each level of the Learn Mode.
    */
   public void initLevels() {
      LearnLevels level1 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),1);
      LearnLevels level2 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 328, 524, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),2);
      LearnLevels level3 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 200, 588, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),3);
      LearnLevels level4 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 264, 460, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),4);
      LearnLevels level5 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),5);
      LearnLevels level6 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),6);
      LearnLevels level7 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),7);
      LearnLevels level8 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),8);
      LearnLevels level9 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),9);
      LearnLevels level10 = new LearnLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")),10);

      levelContainer = new ArrayList<>();
      levelContainer.add(level1);
      levelContainer.add(level2);
      levelContainer.add(level3);
      levelContainer.add(level4);
      levelContainer.add(level5);
      levelContainer.add(level6);
      levelContainer.add(level7);
      levelContainer.add(level8);
      levelContainer.add(level9);
      levelContainer.add(level10);

   }

   /**
    * Getter method
    *
    * @return LearnModeModel
    */
   public LearnModeModel getLearnModeModel() {
      return lmm;
   }

   /**
    * Initialize new Learn Mode level.
    */
   public void initNewLevel() {
      lmm.setAnimal(currentLevel.getAnimal());
      lmm.setStartX(currentLevel.getStartX());
      lmm.setStartY(currentLevel.getStartY());
      lmm.setFinishX(currentLevel.getFinishX());
      lmm.setFinishY(currentLevel.getFinishY());
      lmm.setNoOfMovements(0);
      mapView.getMapBackground().setIcon(currentLevel.getMapBackground());
   }

   /**
    * Determines which level will start.
    *
    * @param level level number.
    */
   public void setCurrentLevel(int level) {
      currentLevel = levelContainer.get(level - 1);
      initNewLevel();
   }

   /**
    * Initializes the new game.
    */
   public void initNewGame() {
      lmm.initNewGame();
      selectionController.resetSelectionController();
   }

   /**
    *
    * @return
    */
   public LearnModeModel getModel() {
      return lmm;
   }

   /**
    *
    * @return
    */
   public int getLevel() {
      return currentLevel.getLevel();
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel background;
   // End of variables declaration//GEN-END:variables
}
