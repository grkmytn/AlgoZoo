package algoZoo.game;

import algoZoo.challenge.ChallengeModeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * This class represents the map which is being shown on the left in the screen.
 * @author Ayberk, Görkem, Kerem
 */
public class MapView extends javax.swing.JPanel implements IAlgoZooView {

   // properties
   final int            WIDTH = 640;
   final int            HEIGHT = 640;
   final int            ANIMAL_WIDTH = 48;
   final int            ANIMAL_HEIGHT = 40;
   final int            NUMBER_OF_SQUARE = 10;
   final int            SQUARE = WIDTH / NUMBER_OF_SQUARE;
   private Timer        timer;
   private AlgoZooModel azm;
   // constructors
   /**
    * Creates map view with regards to Algo Zoo Model
    * @param azm Algo Zoo Model.
    */
   public MapView(AlgoZooModel azm) {
      this.azm = azm;
      initComponents();
      animal.setBounds(azm.getStartX(), azm.getStartY(), ANIMAL_WIDTH, ANIMAL_HEIGHT);
      timer = new Timer(10, new TimerListener());

      animal.setIcon(azm.getAnimal().getIcon());
   }

   // methods
   /**
    * Method to play sound when buttons clicked.
    * @param soundName The path of the sound file.
    */
   private void playSound(String filePath) 
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

      endScreen = new javax.swing.JLabel();
      animal = new javax.swing.JLabel();
      mapBackground = new javax.swing.JLabel();

      setLayout(null);
      add(endScreen);
      endScreen.setBounds(71, 100, 498, 439);
      add(animal);
      animal.setBounds(0, 0, 48, 40);

      mapBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Maps/LearnMode/Level1.png"))); // NOI18N
      add(mapBackground);
      mapBackground.setBounds(0, 0, 640, 640);
   }// </editor-fold>//GEN-END:initComponents

   /**
    * This method reflects the movement of the animal to the map when going up.
    */
   private void goUpView() {
      animal.setBounds(animal.getX(), animal.getY() - 1, ANIMAL_WIDTH, ANIMAL_HEIGHT);
   }

   /**
    * This method reflects the movement of the animal to the map when going down.
    */
   private void goDownView() {
      animal.setBounds(animal.getX(), animal.getY() + 1, ANIMAL_WIDTH, ANIMAL_HEIGHT);
   }

   /**
    * This method reflects the movement of the animal to the map when going right.
    */
   private void goRightView() {
      if (azm.getAnimal().getName().equals("Bee")) {
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Right.png")));
      } else if (azm.getAnimal().getName().equals("Bee2")) {
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Right.png")));
      } else if (azm.getAnimal().getName().equals("Bee3")) {
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Right.png")));
      } else if (azm.getAnimal().getName().equals("Bee4")) {
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Right.png")));
      }

      animal.setBounds(animal.getX() + 1, animal.getY(), ANIMAL_WIDTH, ANIMAL_HEIGHT);
   }

   /**
    * This method reflects the movement of the animal to the map when going left.
    */
   private void goLeftView() {
      if (azm.getAnimal().getName().equals("Bee")) {
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee_Left.png")));
      } else if (azm.getAnimal().getName().equals("Bee2")) {
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee2_Left.png")));
      } else if (azm.getAnimal().getName().equals("Bee3")) {
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee3_Left.png")));
      } else if (azm.getAnimal().getName().equals("Bee4")) {
         animal.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Animals/Bee4_Left.png")));
      }

      animal.setBounds(animal.getX() - 1, animal.getY(), ANIMAL_WIDTH, ANIMAL_HEIGHT);
   }

   /**
    * This method updates the current view of the map to apply reflections to the screen.
    * @param azm
    */
   @Override
   public void updateView(AlgoZooModel azm) {
      animal.setIcon(azm.getAnimal().getIcon());
      if (azm instanceof ChallengeModeModel) {
         if (((ChallengeModeModel) azm).isTimeIsUp()) 
             endMessage();
         else if (!azm.getMovementPattern().isEmpty())
             timer.start();
      }
      else if (!azm.getMovementPattern().isEmpty()) {
         timer.start();
      } 
      else {
         animal.setBounds(azm.getStartX(), azm.getStartY(), ANIMAL_WIDTH, ANIMAL_HEIGHT);
      }
      
   }
   
   /**
    * This method returns the background image of the map.
    * @return mapBackground
    */
   public JLabel getMapBackground() {
      return mapBackground;
   }
   
   /**
    * This method shows a message and plays a sound when game is over.
    */
   public void endMessage() {
      if (azm.getCurrentX() == azm.getFinishX() && azm.getCurrentY() == azm.getFinishY() && azm.allPollensGathered()) {
         endScreen.setVisible(true);
         endScreen.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Won_Screen.png")));
         playSound( "src/algoZoo/Sounds/YouWon.wav" );
      } else {
         endScreen.setVisible(true);
         endScreen.setIcon(new ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Lost_Screen.png")));
         playSound( "src/algoZoo/Sounds/YouLost.wav" );
      }
   }
   
   /**
    * A method to reset the map (for replay button)
    */
   public void resetMap() {
      endScreen.setVisible(false);
      animal.setBounds(azm.getStartX(), azm.getStartY(), ANIMAL_WIDTH, ANIMAL_HEIGHT);
   }
   
   /**
    * A method to indicate if the bee is moving or not.
    * @return 
    */
   public boolean isBeeMoving() {
      return timer.isRunning();
   }


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel animal;
   private javax.swing.JLabel endScreen;
   private javax.swing.JLabel mapBackground;
   // End of variables declaration//GEN-END:variables

   // inner class
   public class TimerListener implements ActionListener {

      int counter = 0;
      int index = 0;

      @Override
      public void actionPerformed(ActionEvent e) {
         if (azm.getMovementPattern().isEmpty()) {
            endMessage();
            animal.setBounds(azm.getStartX(), azm.getStartY(), ANIMAL_WIDTH, ANIMAL_HEIGHT);
         } else {
            if (azm.getMovementPattern().size() > index) {
               if (azm.getMovementPattern().get(index).equals('w')) {
                  if (animal.getY() > (SQUARE - ANIMAL_HEIGHT) / 2) {
                     goUpView();
                  }
               } else if (azm.getMovementPattern().get(index).equals('a')) {
                  if (animal.getX() > (SQUARE - ANIMAL_WIDTH) / 2) {
                     goLeftView();
                  }
               } else if (azm.getMovementPattern().get(index).equals('s')) {
                  if (animal.getY() < (HEIGHT - SQUARE) + (SQUARE - ANIMAL_HEIGHT) / 2) {
                     goDownView();
                  }
               } else if (azm.getMovementPattern().get(index).equals('d')) {
                  if (animal.getX() < (WIDTH - SQUARE) + (SQUARE - ANIMAL_WIDTH) / 2) {
                     goRightView();
                  }
               }
            } else {
               index = 0;
               counter = 0;
               timer.stop();
               endMessage();
            }
         }

         counter++;

         if (counter % 64 == 0) {
            index++;
         }
      }
   }
}
