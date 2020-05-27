package algoZoo.test;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * The class holding the save files of test mode levels
 *
 * @author Görkem
 * @version 1.0
 */
public class TestLevelsSaveContainer implements Serializable {

   // properties
   ArrayList<Boolean> levelAccomplished;

   // constructor
   /**
    * Creates the ArrayList containing the boolean values of the TestModeLevels
    */
   public TestLevelsSaveContainer() {
      levelAccomplished = new ArrayList<>();
      levelAccomplished.add(Boolean.TRUE);
      for (int i = 0; i < 9; i++) {
         levelAccomplished.add(Boolean.FALSE);
      }
   }

   /**
    * Sets true the specific level's boolean value based on the level number.
    * @param levelNumber
    */
   public void setTrue(int levelNumber) {
      levelAccomplished.set(levelNumber, Boolean.TRUE);
   }

   /**
    * Sets false the specific level's boolean value based on the level number.
    * @param levelNumber
    */
   public void setFalse(int levelNumber) {
      levelAccomplished.set(levelNumber, Boolean.FALSE);
   }

   /**
    * Returns the size of the ArrayList
    * @return Size of the ArrayList
    */
   public int size() {
      return levelAccomplished.size();
   }

   /**
    * Returns the determined elements of the ArrayList based on index number.
    * @param i Index number
    * @return boolean. The elements of the ArrayList.
    */
   public boolean get(int i) {
      return levelAccomplished.get(i);
   }
}
