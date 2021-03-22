package zero.mgy.jdk;

public class DBSearch implements Search {
    @Override
    public String getByKeyWords(String keywords) {
        return "the result " + keywords + " is from DBSearch search";
    }
}
