/**
 * Made by Tia Marie Gordon
 * 
 * The Giraffe class represents a giraffe and provides its ASCII art
 * representation.
 * This class implements the Animal interface and overrides the getAnimalArt
 * and toString methods.
 */

class Giraffe implements Animal {

    /**
     * Returns the ASCII art representation of the giraffe.
     *
     * @return A string containing the ASCII art of the giraffe.
     */

    @Override
    public String getAnimalArt() {
        return  "        \\   /)ii/)\n" +
                "         \\ (o \" )\n" +
                "              | |\n" +
                "              |o|\n" +
                "              | |______||\n" +
                "              |    o    |\n" +
                "              |o__o_o__o|\n" +
                "              || || || ||\n" +
                "              || || || ||\n" +
                "              || || || ||";

    }

    /**
     * Returns the name of the animal ("giraffe").
     * This method overrides the toString method to return the name of the crab.
     *
     * @return The string "crab" representing the name of the animal.
     */

    @Override
    public String toString() {
        return "giraffe";
    }

}
