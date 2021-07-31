import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("src/sampletext.txt");
        Scanner input = new Scanner(file);
        String word = "";
        BinarySearchTree<String, Integer> dict = new BinarySearchTree<>("", 0);
        while (input.hasNext()){
            word = input.next();
            word = word.replaceAll("[^a-zA-Z]","");
            word = word.toLowerCase();
            Integer val = dict.lookup(word);
            if (val == null){
                dict.add(word, 1);
            } else {
                dict.add(word, val+1);
            }
        }
        dict.inOrderTraverse();
    }
}
