/**
 * The Deer class represent a cow and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 * 
 * Deer is by https://www.asciiart.eu/animals/deer
 */
class Deer implements Animal {

    @Override
    public String getAnimalArt() {
       return 
       "     \\   (             )\n" +
       "      \\    `--(_   _)--\'\n" +
       "       \\       Y-Y\n" +
       "        \\     /@@ \\\n" +
       "         \\   /     \\\n" +
       "             `--\'.  \\             ,\n" +
       "                 |   `.__________/)";
    }
    @Override
    public String toString() {
        return "deer";
    }
    
}
