class Cat implements Animal {
    
  /**
   * Returns the ASCII art representation of the cow.
   *
   * @return A string containing the ASCII art of the cow.
   * art from https://www.animalden.com/asciianimalart.html
   */
  @Override
  public String getAnimalArt() {
    return   "   ,_     _\n" +
             "   |\\\\_,-~/\n" +
             "   / _  _ |    ,--.\n" +
             "  (  @  @ )   / ,-'\n" +
             "   \\  _T_/-._( (\n" +
             "   /         `. \\\n" +
             "  |         _  \\ |\n" +
             "   \\ \\ ,  /      |\n" +
             "   || |-_\\__   /\n" +
             "   ((_/`(____,-'\n"; 
  }
  public String toString() {
    return "cat";
  }


}
