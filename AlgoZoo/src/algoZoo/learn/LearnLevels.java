/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.learn;

import algoZoo.game.Animal;
import javax.swing.ImageIcon;

/**
 * It was created to create level objects in learn mode.
 * @author Görkem, Ayberk
 */
public class LearnLevels {

   // properties
   Animal animal;
   int startX;
   int startY;
   int finishX;
   int finishY;
   ImageIcon mapBackground;

   // constructor    
   public LearnLevels(Animal animal, int startX, int startY, int finishX, int finishY, ImageIcon mapBackground) {
      this.animal = animal;
      this.startX = startX;
      this.startY = startY;
      this.finishX = finishX;
      this.finishY = finishY;
      this.mapBackground = mapBackground;
   }

   // methods
   public ImageIcon getMapBackground() {
      return mapBackground;
   }

   public Animal getAnimal() {
      return animal;
   }

   public int getStartX() {
      return startX;
   }

   public int getStartY() {
      return startY;
   }

   public int getFinishX() {
      return finishX;
   }

   public int getFinishY() {
      return finishY;
   }
}
