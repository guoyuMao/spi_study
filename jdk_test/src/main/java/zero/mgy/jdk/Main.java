package zero.mgy.jdk;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Search> searchServiceLoader = ServiceLoader.load(Search.class);
        Iterator<Search> iterable = searchServiceLoader.iterator();
        while (iterable.hasNext()) {
            Search tSearch = iterable.next();
            System.out.println("use implement is "+tSearch.getClass()+"; and the return is ["+tSearch.getByKeyWords("AAA")+"]");
        }
    }
}
