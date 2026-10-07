import java.util.Arrays;

public class Ejercicio_10 {
    public static void main (String[] args){
        final char[] LETTERS = {'S','B','N','G','A','B','F','J','A','B','B','B', 'R','H','W','H','M','F','B','Q'};
        int count;
        int moda = 0;
        int freq = 0;
        for (int i = 0; i < LETTERS.length; i++) {
            count = 0;
            char candidata = LETTERS[i];
            for (int j = 0; j < LETTERS.length; j++) {
                if (LETTERS[j] == candidata) {
                    count++;
                }

            }
            if (count > moda) {
                moda = i;
                freq = count;
            }
        }
        System.out.println(LETTERS[moda]+ " aparece "+freq+" veces ");

    }
}
