import java.util.Arrays;

//class intialized
public class abbrevationChecker {

    //main function
    public static void main(String[] args) {
        //call of function example
        boolean x = abbrevationChecker.abrevChecker("kg", "kilograms");
        System.out.println(x);
    }

    //abbrevation checker function inputs needed (abbrevation to be checked, word to be checked against)
    public static boolean abrevChecker(String abrv, String word) {
        
        //our 3rd word make by decrypting the given word
        String newWord = "";

        //splitting our two inputs into arrayLists and redefining them
        char[] firstWord = abrv.toCharArray();
        char[] secondWord = word.toCharArray();

        /*a for loop to check if each letter in word is inside the abbrevbation
            and creating a new word made of the commmon letters*/
        for (char letter : secondWord) {
            if (abrv.indexOf(letter) != -1) {
                newWord += letter;
            }
        }
        
        //check if the abrevation contains any forgein letters that word doesnt have
        for (char letter : firstWord) {
            if (word.indexOf(letter) == -1) {
                return false;

            /*if the abbrevation contains only letters found in word checks if
                the abbrevation is inside the new word*/
            } else if (word.indexOf(letter) != -1) {
                if (newWord.contains(abrv)) {
                    return true;
                } else {
                    return false;
                }
            }

        }
		return false;
    }
}
