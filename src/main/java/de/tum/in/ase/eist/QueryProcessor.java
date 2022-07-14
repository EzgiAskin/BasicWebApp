package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Ezgi";
        } else if (query.contains("plus")) {
            String[] array = query.split(" ");
            return String.valueOf(Integer.parseInt(array[3]) + Integer.parseInt(array[5]));
        } else if (query.contains("which of the following numbers is the largest:")) {
            String[] array = query.split(": ");
            return String.valueOf(Arrays.stream(array[2].split(", ")).mapToInt(Integer::valueOf).max().getAsInt());
        } else { // TODO extend the programm here
            return "";

        }
    }
}
