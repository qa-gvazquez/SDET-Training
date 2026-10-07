package sdet.craking.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>CountWords</h1>
 * The 'CountWords' program implements a method that
 * deliver the times a word appears on a given string.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user-friendly, and it is assumed as a high quality code.
 * <p>
 * <b>PseudoCode</b>
 * <ol>
 *   <li>Chop the String in pieces, separated by SPACE</li>
 *   <li>Create a HasMap with a Key-Value pair as Word-Number</li>
 *   <li>Print result</li>
 * </ol>
 *
 * @param str The text we want to word count
 * @author German Vazquez
 * @version 1.0
 * @return The times any word appears on a given String.
 * @since 2026-10-07
 */
public class CountWords {
    public static void main(String[] args) {

        String str = "I am learning learning java java java programming programming";

        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer count = 1;
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], count);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (String x : map.keySet()) {
            System.out.println("The count of word :" + x + " = " + map.get(x));
        }

    }
}
