/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.learn;

import algoZoo.game.AlgoZooModel;
import algoZoo.game.Animal;
import algoZoo.game.CodeView;
import algoZoo.game.MapView;
import algoZoo.game.SelectionController;
import javax.swing.ImageIcon;

/**
 *
 * @author Ayberk
 */
public class LearnModeGUI extends javax.swing.JPanel {
   MapView mapView;
   CodeView codeView;
   LearnModeModel lmm;
   SelectionController selectionController;
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

   private void initMyComponents() {
      // initialize components
      lmm = new LearnModeModel(new Animal("Bee",new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/bee.png"))), 8, 12, 72, 76);
      mapView = new MapView(lmm);
      codeView = new CodeView();
      selectionController = new SelectionController(lmm);
      
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
      
      if ( lmm.HasWon()) {
         System.out.println("won");
      }
      
      
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel background;
   // End of variables declaration//GEN-END:variables
}
