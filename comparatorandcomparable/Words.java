package comparatorandcomparable;

public class Words implements Comparable <Words> {
    private String value;

    public Words(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return "Words{" + "value='" + value + '\'' + '}';
    }


    @Override
    public int compareTo(Words o) {
        return this.getValue().length() - o.getValue().length();
    }
}
