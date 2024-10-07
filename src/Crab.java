/**
 * CREATED BY: Augy Markham
 * The Crab class represents a crab and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 */
class Crab implements Animal {

    /**
     * Returns the ASCII art representation of the crab.
     *
     * @return A string containing the ASCII art of the crab.
     */
    @Override
    public String getAnimalArt() {
        return "    \\ \n" +
               "\\ )  \\     ( /\n" +
               " \\\\__^__^__//\n" +
               " _\\________/_\n" +
               " \\ / /  \\ \\ /\n" +
               "   \\ \\  / /";

    }
  
    /**
     * Returns the name of the animal ("crab").
     * This method overrides the toString method to return the name of the crab.
     *
     * @return The string "crab" representing the name of the animal.
     */
    @Override
    public String toString() {
      return "crab";
    }
  }
