package com.database.test;

import com.database.Database;
import com.database.User;
import com.database.UserDao;
import org.junit.Test;


import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userData = new UserDao();

    @Test
    public void save() {
        String testName = "Anna";
        String testEmail = "annaemail@ggg.com";
        userData.save(testName, testEmail);
        for (User i: Database.userMap.values()){
            assertEquals(testName, i.getName());
            assertEquals(testEmail, i.getEmail());
        }
        assertEquals(1, Database.userMap.size());

    }


    @Test
    public void contains() {
        // steps before test
        userData.save("Herman", "his_mail@gmail.com");
        userData.save("J.J.", "jj@email2.com");
        //test
        assertEquals(true, userData.contains(2));
        assertEquals(false, userData.contains(15));
    }



    @Test
    public void remove() {
        // steps before test
        userData.save("Herman", "his_mail@gmail.com");
        userData.save("J.J.", "jj@email2.com");
        userData.save("Will", "Willsakes@yahoo.com");
        //test
        int sizeOld = Database.userMap.size();
        Integer removedKey = 1;
        userData.remove(removedKey);
        assertEquals(sizeOld - 1, Database.userMap.size());
        for (Integer i: Database.userMap.keySet()) {
            assertNotEquals(removedKey, i);
        }
    }

    @Test
    public void clear() {
        // steps before test
        userData.save("Herman", "his_mail@gmail.com");
        userData.save("J.J.", "jj@email2.com");
        userData.save("Will", "Willsakes@yahoo.com");
        //test
        userData.clear();
        assertEquals(0, Database.userMap.size());
    }
}