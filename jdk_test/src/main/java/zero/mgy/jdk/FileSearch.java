package zero.mgy.jdk;

public class FileSearch implements Search {
    @Override
    public String getByKeyWords(String keywords) {
        return "the result " + keywords + " is from file search";
    }
}
