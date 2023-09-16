package comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Words> wordList = new ArrayList<>();
        wordList.add(new Words("template"));
        wordList.add(new Words("hi"));
        wordList.add(new Words("liquid"));
        wordList.add(new Words("tax"));
        wordList.add(new Words("transaction"));

        Collections.sort(wordList);
        System.out.println(wordList);
        Collections.sort(wordList, new WordsLengthComparator());
        System.out.println(wordList);

    }
}
