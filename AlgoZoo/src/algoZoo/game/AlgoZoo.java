/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import java.util.ArrayList;

/**
 *
 * @author Esra, Doğa
 */
public class AlgoZoo {
   //properties
   Animal animal;
   ArrayList<Character> movementPattern;
   int startX;
   int startY;
   int currentX;
   int currentY;
   int finishX;
   int finishY;

   //constructors
   public AlgoZoo(Animal animal, int startX, int startY, int finishX, int finishY) {
      movementPattern = new ArrayList<Character>();
      animal = null;
      this.startX = startX;
      this.startY = startY;
      currentX = this.startX;
      currentY = this.startY;
      this.finishX = finishX;
      this.finishY = finishY;
   }
   
   //methods
   public int getFinishX() {
      return finishX;
   }

   public void setFinishX(int finishX) {
      this.finishX = finishX;
   }

   public int getFinishY() {
      return finishY;
   }

   public void setFinishY(int finishY) {
      this.finishY = finishY;
   }

   public boolean goUp() {
      currentY -= 64;
      return true;
   }

   public boolean goDown() {
      currentY += 64;
      return true;
   }

   public boolean goRight() {
      currentX += 64;
      return true;
   }

   public boolean goLeft() {
      currentX -= 64;
      return true;
   }

   public Animal getAnimal() {
      return animal;
   }

   public void setAnimal(Animal animal) {
      this.animal = animal;
   }

   public ArrayList<Character> getMovementPattern() {
      return movementPattern;
   }

   public void addMovementPattern(char c) {
      movementPattern.add(c);
   }

   public void resetMovementPattern() {
      movementPattern = new ArrayList<Character>();
   }

   public int getStartX() {
      return startX;
   }

   public void setStartX(int startX) {
      this.startX = startX;
   }

   public int getStartY() {
      return startY;
   }

   public void setStartY(int startY) {
      this.startY = startY;
   }

   public int getCurrentX() {
      return currentX;
   }

   public void setCurrentX(int currentX) {
      this.currentX = currentX;
   }

   public int getCurrentY() {
      return currentY;
   }

   public void setCurrentY(int currentY) {
      this.currentY = currentY;
   }

}
