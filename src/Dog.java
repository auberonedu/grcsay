class Dog implements Animal {

    @Override
    public String getAnimalArt() {
        // By Maija Haavisto https://www.asciiart.eu/animals/dogs
        return "        \\   .\n" +
"         \\  ..^____/\n" +
"            `-. ___ )\n" +
"              ||   ||\n";
    }

    @Override 
    public String toString() {
        return "dog";
    }
    
}
