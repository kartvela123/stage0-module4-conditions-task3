package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (Character.isLetter(character)) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
