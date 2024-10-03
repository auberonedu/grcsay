/**
 * The Sheep class represents a sheep and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 */
class Sheep implements Animal {

  /**
   * Returns the ASCII art representation of the sheep.
   * Art by Maija Haavisto
   * https://www.asciiart.eu/animals/dogs
   *
   * @return A string containing the ASCII art of the sheep.
   */
  public String getAnimalArt() {
      return "        \\   .\n" +
             "         \\  ..^____/\n" +
             "            `-. ___ )\n" +
             "              ||   ||\n";
  }

  /**
   * Returns the name of the animal ("sheep").
   * This method overrides the toString method to return the name of the sheep.
   *
   * @return The string "sheep" representing the name of the animal.
   */
  @Override
  public String toString() {
    return "sheep";
  }
}

