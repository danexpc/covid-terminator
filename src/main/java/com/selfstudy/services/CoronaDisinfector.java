package com.selfstudy.services;

public class CoronaDisinfector {

    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public void start(Room room) {
        announcer.announce("Disinfection is starting! Everybody out!");
        policeman.makePeopleLeave();
        disinfect(room);
        announcer.announce("Take the risk of entering the room!");
    }

    private void disinfect(Room room) {
        System.out.println("Prayer is said: 'Crown seized!' Prayer read, virus descended to hell");
    }

}
