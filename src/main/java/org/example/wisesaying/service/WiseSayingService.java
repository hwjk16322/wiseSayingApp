package org.example.wisesaying.service;

import org.example.wisesaying.entity.WiseSaying;

import java.util.ArrayList;

public class WiseSayingService {

    int lastWiseSayingId = 0;
    ArrayList<WiseSaying> wiseSayinglist = new ArrayList<>();

    public int write(String content, String author) {
        lastWiseSayingId++;

        WiseSaying wiseSaying = new WiseSaying(lastWiseSayingId, content, author);
        wiseSayinglist.add(wiseSaying);

        return lastWiseSayingId;
    }
}
