package pl.radekcholuj.dictionary;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {
    private Map<String, String> words = new TreeMap<>();

    public void add(String pol, String ang){
        words.put(pol, ang);
    }

    public String polToAng(String pol){
        return words.get(pol);
    }

    public void displayAll(){
        var wordsIterator = words.entrySet().iterator();
        while(wordsIterator.hasNext()){
            var entry = wordsIterator.next();

            String pol = entry.getKey();
            String ang = entry.getValue();

            System.out.println(pol+" : "+ang);
        }
    }
}
