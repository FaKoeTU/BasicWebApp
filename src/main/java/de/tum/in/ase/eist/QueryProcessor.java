package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Fabian";
        } else if (query.contains("largest")){ // TODO extend the programm here
            String[] result = query.split("largest:");
            int biggest = 0;
            //%20which%20of%20the%20following%20numbers%20is%20the%20largest:%2021,%2097,%201,%20289"
            for(int i = 0; i < result[1].length(); i++){
                        int value = Integer.parseInt(result[1].split(",")[i]);
                        if(value>biggest) {
                            biggest = value;
                        }
            }
            return Integer.toString(biggest);
        }
        return "";
    }
}
