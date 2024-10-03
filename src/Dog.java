public class Dog implements Animal {
    @Override
    public String getAnimalArt() {
        return "        \\   .\n" +
                "         \\  ..^____/\n" +
                "            `-. ___ )\n" +
                "              ||   ||\n";
    }

    /**
     * Returns the name of the animal ("dog").
     * This method overrides the toString method to return the name of the cow.
     *
     * @return The string "dog" representing the name of the animal.
     */
    @Override
    public String toString() {
        return "dog";
    }
}
