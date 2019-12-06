package com.database;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        UserDao userData = new UserDao();
        userData.save("Anna", "her_email");
        userData.save("Anna2", "her_email2");
        userData.save("Herman", "his_mail@gmail.com");
        userData.save("J.J.", "jj@email2.com");
        userData.save("Will", "Willsakes@yahoo.com");

        //returns references
       for (Integer i : Database.userMap.keySet()) {
           System.out.print(i + " - ");
           System.out.println(Database.userMap.get(i));
       }

        userData.printMap();

       /* for (User i : Database.userMap.values()) {
            System.out.println(i.getName() + " / " + i.getEmail());
            
        }*/

        System.out.println(userData.contains(2));
        System.out.println(Database.userMap.size());

        userData.remove(2);
        System.out.println("After removing key: ");
        userData.printMap();

        userData.clear();
        System.out.println("After clearing: ");
        for (Integer i : Database.userMap.keySet()) {
            System.out.println(i);
        }
    }
}
