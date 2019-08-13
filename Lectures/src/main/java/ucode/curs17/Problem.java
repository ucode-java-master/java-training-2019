package ucode.curs17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem {

    public static void main(String[] args) {
        Problem problem = new Problem();

        Map<String, Integer> aMap = new HashMap<>();

        aMap.put("Catalin", 189);
        aMap.put("Attila", 184);
        aMap.put("Radmila", 172);

//        aMap.putIfAbsent()

        if (!aMap.containsKey("Catalin")) {
            aMap.put("Catalin", 189);
        }

        aMap.remove("Catalin", 160);

        Integer height = aMap.get("Catalin");

        System.out.println("aMap.entrySet() = " + aMap.entrySet());

        Set<Map.Entry<String, Integer>> entries = aMap.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            entry.getKey();
            entry.getValue();
        }

    }

    public int getNumberOfPairs(List<Integer> theList) {

        ArrayList<String> a = new ArrayList<>();

        String s = a.get(0);

        int count = 0;

        for (int iteratorPrincipal = 0; iteratorPrincipal < theList.size(); iteratorPrincipal++) {
            for (int iteratorSecundar = iteratorPrincipal + 1; iteratorSecundar < theList.size(); iteratorSecundar++) {
                if (theList.get(iteratorPrincipal).equals(theList.get(iteratorSecundar))) {
                    count++;
                }
            }
        }

        return count;
    }

}
