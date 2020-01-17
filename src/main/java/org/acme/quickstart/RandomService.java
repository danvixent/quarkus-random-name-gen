package org.acme.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RandomService {

    public String greeting(String name) {
        String[] names = 
        {
            "Stacey",
            "Daniel",
            "Jennifer",
            "Queen",
            "Richard",
            "Louis",
            "Fiona",
            "Diana",
            "Veronica",
            "Gabby",
            "Lea",
            "Andrey",
            "Rose"
        };

        int rand = rand(names.length);
        return "hello " + names[rand];
    }

    int rand(int len){
        int rand = (int) (Math.random() * len);
        return rand;
    }

}
