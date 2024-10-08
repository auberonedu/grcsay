/**
 * The Elephant class represents an elephant and provides its ASCII art representation.
 * This class implements the Animal interface and overrides the getAnimalArt 
 * and toString methods.
 */
class Elephant implements Animal {

    /**
     * Returns the ASCII art representation of the elephant.
     *
     * @return A string containing the ASCII art of the elephant.
     */
    @Override
    public String getAnimalArt() {
        return "                            _\n" +
               "                          .' `'.__\n" +
               "                         /      \\ `\"-,\n" +
               "        .-''''--...__..-/ .     |      \\\n" +
               "      .'               ; :'     '.  a   |\n" +
               "     /                 | :.       \\     =\\\n" +
               "    ;                   \\':.      /  ,-.__;.-;`\n" +
               "   /|     .              '--._   /-.7`._..-;`\n" +
               "  ; |       '                |`-'      \\  =|\n" +
               "  |/\\        .   -' /     /  ;         |  =/\n" +
               "  (( ;.       ,_  .:|     | /     /\\   | =|\n" +
               "   ) / `\\     | `\"\"`;     / |    | /   / =/\n" +
               "     | ::|    |      \\    \\ \\    \\ `--' =/\n" +
               "    /  '/\\    /       )    |/     `-...-`\n" +
               "   /    | |  `\\    /-'    /;\n" +
               "   \\  ,,/ |    \\   D    .'  \\\n" +
               "jgs `\"\"`   \\  nnh  D_.-'L__nnh\n" +
               "            `\"\"\"`\n";
    }

    /**
     * Returns the name of the animal ("elephant").
     * This method overrides the toString method to return the name of the elephant.
     *
     * @return The string "elephant" representing the name of the animal.
     */
    @Override
    public String toString() {
        return "elephant";
    }
}
