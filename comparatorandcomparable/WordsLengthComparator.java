package comparatorandcomparable;

import java.util.Comparator;

public class WordsLengthComparator implements Comparator<Words> {
    @Override
    public int compare(Words o1, Words o2) {
        return o1.getValue().length() - o2.getValue().length();
    }
}
