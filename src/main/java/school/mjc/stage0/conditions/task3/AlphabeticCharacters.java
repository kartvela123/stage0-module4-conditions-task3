package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (!Character.isLetter(character)) {
            System.out.println("Non English");
        } if (character == 'a' || character == 'o' || character == 'e' || character == 'u') {
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}
