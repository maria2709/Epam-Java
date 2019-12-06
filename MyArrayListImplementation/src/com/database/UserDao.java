package com.database;


import java.util.Iterator;
import java.util.Map;

public class UserDao {
   // Iterator<Integer> it = Database.userMap.keySet().iterator();


    public void save(String name, String email) {
        User newUser = new User(name, email);
        int userId = ++User.numberOfUsers;
        Database.userMap.put(userId, newUser);
    }


    public boolean contains(int key) {
        boolean answer = false;
        for (Integer i : Database.userMap.keySet()) {
            if (i == key)
                answer = true;
        }
        return answer;
    }
 /*   public void remove(int key) {
        for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey().equals("test")) {
                it.remove();
            }
        }
    }*/

    public void remove(int key) {
        Database.userMap.remove(key);
    }

    public void clear() {
        Database.userMap.clear();
    }

    public void printMap(){
        for (Map.Entry<Integer, User> entry: Database.userMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getName() + " / " +
                    entry.getValue().getEmail());

        }
    }

}
