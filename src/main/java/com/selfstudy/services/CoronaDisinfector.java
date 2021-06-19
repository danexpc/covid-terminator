package com.selfstudy.services;

public class CoronaDisinfector {

    public void start(Room room) {
        // todo: Notify that all have to leave the room
        // todo: Disperse anyone who hasn't come out
        disinfect(room);
        // todo: Notify that can return
    }

    private void disinfect(Room room) {
        System.out.println("Prayer is said: 'Crown seized!' Prayer read, virus descended to hell");
    }

}
