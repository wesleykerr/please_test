package com.riotgames.test;

import org.mapdb.*

public static void main(String[] args) {
    DB db = DBMaker.fileDB("file.db").make();
    ConcurrentMap map = db.hashMap("map").createOrOpen();
    map.put("something", "here");
    db.close();
}