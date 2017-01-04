import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> subArraies = new ArrayList<ArrayList<Integer>>();
        for(int c = 0; c < a.size(); c++) {
            subArraies.add(new ArrayList<>());
        }

        int arrayCount = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 0) {
                subArraies.get(arrayCount).add(a.get(i));
            } else {
                arrayCount++;
            }
        }
        if(arrayCount == a.size()) {
            return new ArrayList<Integer>();
        }

        int maxSetIndex = 0;
        Long currentSum = 0L;
        for (int j = 0; j < a.size(); j++) {
            Long newSum = 0L;
            for (Integer n : subArraies.get(j)) {
                newSum += (long)n;
            }
            if (newSum > currentSum) {
                currentSum = newSum;
                maxSetIndex = j;
            } else if (newSum == currentSum) {
                if(j == 0) {
                    continue;
                }
                else if(subArraies.get(j).size() > subArraies.get(j-1).size()) {
                    maxSetIndex = j;
                }
            }
        }
        return subArraies.get(maxSetIndex);
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(756898537, -1973594324, -2038664370, -184803526, 1424268980));
        ArrayList<Integer> output = maxset(input);
        if(336465782 > 1101513929 + 1315634022) {
            Long x = (long)1101513929 + (long)1315634022;
            Boolean longWorks = x > 3 + 5L;
            System.out.print("x = "+x+"Long works? "+longWorks);

        }
        System.out.print("a");
    }
    //A : [ 336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421 ]


}
