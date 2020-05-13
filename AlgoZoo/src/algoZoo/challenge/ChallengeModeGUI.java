/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;
import algoZoo.game.*;
import algoZoo.learn.LearnLevels;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author dogaersoy
 */
public class ChallengeModeGUI extends javax.swing.JPanel {
    
    // properties
    ChallengeModeModel cmm;
    MapView mapView;
    SelectionController selectionController;
    TimerController timer;
    CodeView codeView;
    ChallengeLevels currentLevel;
    ArrayList<ChallengeLevels> levelContainer;

    /**
     * Creates new form ChallengeModeGUI
     */
    public ChallengeModeGUI() {
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
        codeView1 = new algoZoo.game.CodeView();

        setLayout(null);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/In_Game_Background.png"))); // NOI18N
        add(background);
        background.setBounds(0, 0, 1400, 800);

        codeView1.setPreferredSize(new java.awt.Dimension(350, 630));
        add(codeView1);
        codeView1.setBounds(740, 60, 350, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void initMyComponents() {
      // initialize components  
      initLevels();
      currentLevel = levelContainer.get(0);
      cmm = new ChallengeModeModel(currentLevel.getAnimal(), currentLevel.getStartX(), currentLevel.getStartY(), currentLevel.getFinishX(), currentLevel.getFinishY(), currentLevel.getMinRequiredMovements(), currentLevel.getMinRequiredTime());
      
      mapView = new MapView(cmm);
      codeView = new CodeView();
      selectionController = new SelectionController(cmm);
      timer = new TimerController( cmm);
      initNewLevel();
      mapView.getMapBackground().setIcon(currentLevel.getMapBackground());

      // place components to panel and setVisible
      add(mapView);
      mapView.setBounds(50, 50, 640, 640);
      add(codeView);
      codeView.setBounds(845, 50, 200, 640);
      add(selectionController);
      selectionController.setBounds(1200, 0, 200, 800);
      add(timer);
      timer.setBounds(290, 710, 150, 70);

      // initialize game
      cmm.addView(mapView);
      cmm.addView(codeView);

      if (cmm.hasWon()) {
         System.out.println("won");
      }
   }
    
    public void initLevels() {
      ChallengeLevels level1 = new ChallengeLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 1);
      ChallengeLevels level2 = new ChallengeLevels(new Animal("Bee", new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 136, 76, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 2);
      ChallengeLevels level3 = new ChallengeLevels(new Animal("Bee",new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 3);
      ChallengeLevels level4 = new ChallengeLevels(new Animal("Bee",new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 4);
      ChallengeLevels level5 = new ChallengeLevels(new Animal("Bee",new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 5);
      ChallengeLevels level6 = new ChallengeLevels(new Animal("Bee",new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 6);
      ChallengeLevels level7 = new ChallengeLevels(new Animal("Bee",new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 7);
      ChallengeLevels level8 = new ChallengeLevels(new Animal("Bee",new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 8);
      ChallengeLevels level9 = new ChallengeLevels(new Animal("Bee",new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 9);
      ChallengeLevels level10 = new ChallengeLevels(new Animal("Bee",new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76, 10, 120, new ImageIcon(getClass().getResource("/algoZoo/Maps/Level1.png")), 10);
       
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
    
    public void startTimer() {
        timer.startTimer();
    }
    
    public void initNewLevel() {
      cmm.setAnimal(currentLevel.getAnimal());
      cmm.setStartX(currentLevel.getStartX());
      cmm.setStartY(currentLevel.getStartY());
      cmm.setFinishX(currentLevel.getFinishX());
      cmm.setFinishY(currentLevel.getFinishY());
      cmm.setMinRequiredMovements(currentLevel.getMinRequiredMovements());
      cmm.setMinRequiredTime(currentLevel.getMinRequiredTime());
      mapView.getMapBackground().setIcon(currentLevel.getMapBackground());
   }

   /**
    * Determines which level will start.
    * @param level level number.
    */
   public void setCurrentLevel(int level) {
      currentLevel = levelContainer.get(level - 1);
      initNewLevel();
   }
    
    public void initNewGame() {
        cmm.initNewGame();
        timer.resetTimer();
        selectionController.resetSelectionController();
    }
    
    public ChallengeModeModel getModel() {
        return cmm;
    }
    
    public int getLevel() {
        return currentLevel.getLevel();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private algoZoo.game.CodeView codeView1;
    // End of variables declaration//GEN-END:variables
}
