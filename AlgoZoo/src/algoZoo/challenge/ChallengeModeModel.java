/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.challenge;

import algoZoo.game.*;

/**
 *
 * @author dogaersoy, esragenç
 */
public class ChallengeModeModel extends AlgoZooModel {
   // properties

   int noOfMovements;
   int minRequiredMovements;
   int efficiency;
   int minRequiredTime;
   int usedTime;

   // constructors
   public ChallengeModeModel(int startX, int startY, int finishX, int finishY, int minRequiredMovements, int minRequiredTime) {
      super(startX, startY, finishX, finishY);
      this.minRequiredMovements = minRequiredMovements;
      this.minRequiredTime = minRequiredTime;
      noOfMovements = 0;
      efficiency = 0;
      usedTime = 0;
   }
   // methods

   public int getNoOfMovements() {
      return noOfMovements;
   }

   public void setNoOfMovements(int noOfMovements) {
      this.noOfMovements = noOfMovements;
   }

   public void increaseNoOfMovements() {
      noOfMovements++;
   }

   public int getMinRequiredMovements() {
      return minRequiredMovements;
   }

   public void setMinRequiredMovements(int minRequiredMovements) {
      this.minRequiredMovements = minRequiredMovements;
   }

   public int getMinRequiredTime() {
      return minRequiredTime;
   }

   public void setMinRequiredTime(int minRequiredTime) {
      this.minRequiredTime = minRequiredTime;
   }

   public int getEfficiency() {
      return efficiency;
   }

   public void setUsedTime(int usedTime) {
      this.usedTime = usedTime;
   }

   public void increaseUsedTime() {
      usedTime++;
   }

   public void computeEfficiency() {
      if (!hasWon()) {
         efficiency = 0;
      } 
      else {
         efficiency = 1;
         if (usedTime < minRequiredTime / 2) {
            efficiency++;
         }
         if (getMovementPattern().size() == minRequiredMovements) {
            efficiency++;
         }
      }
   }

   @Override
   public void initNewGame() {
      super.initNewGame();
      noOfMovements = 0;
      usedTime = 0;
      efficiency = 0;
   }

   @Override
   public void play() {
      super.play();
      if(hasWon())
          computeEfficiency();
   }
}
