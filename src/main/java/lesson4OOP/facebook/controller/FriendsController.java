package lesson4OOP.facebook.controller;

import lesson4OOP.facebook.model.Friends;
import lesson4OOP.facebook.services.FriendsService;
import lesson4OOP.facebook.services.factory.ServiceFactory;

import java.util.List;

public class FriendsController {

    public static void main(String[] args) {

        FriendsService allFriends = ServiceFactory.getAllFriendsMethods();
        for (Friends elem : allFriends.getAllFriends()) {
            System.out.println(elem);
        }
        String name = "Valera";
        List<Friends> byName = allFriends.getByName(name);
        for (Friends elem : byName) {
            System.out.println(elem);
        }
    }
}
