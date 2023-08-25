package org.example;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a quote: ");
        String quote;
        quote = input.nextLine().toLowerCase();
        // System.out.println(quote.length());
        HashMap<Character, Integer> letterMap = new HashMap<>();

        for (Character c : quote.toCharArray()) {
            if (!letterMap.containsKey(c)) {
                letterMap.put(c, 1);
            } else {
                int num = letterMap.get(c);
                num++;
                letterMap.put(c, num);
            }
        }
        System.out.println(letterMap.toString());
        input.close();
    }

//     public static void main(String[] args) {
//       // System.out.println("Hello world");
//         try {
//             File fileQuote = new File ("C:/Users/Von/Desktop/test.txt");
//             Scanner readFileQuote = new Scanner(fileQuote);
//             System.out.println("\nFile: " + fileQuote.getName() + " exists!");
////             List<String> list = new ArrayList<>();
//
//             if (readFileQuote.hasNextLine()){
//                 String test = readFileQuote.nextLine();
//                 System.out.println(test);
//             } else {
//                 System.out.println("\nNo line found!");
//             }
//
////             while (readFileQuote.hasNextLine()) {
////                list.add(readFileQuote.nextLine());
////             }
//             readFileQuote.close();
//         } catch (FileNotFoundException e) {
//             System.out.println("Something broke :( ");
//         }
//    }
}