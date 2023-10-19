package org.example.wisesaying.service;

import org.example.wisesaying.entity.WiseSaying;

import java.util.ArrayList;

public class WiseSayingService {

    int lastWiseSayingId = 0;
    ArrayList<WiseSaying> wiseSayingList = new ArrayList<>();


    public int write(String content, String author) {
        lastWiseSayingId++;

        WiseSaying wiseSaying = new WiseSaying(lastWiseSayingId, content, author);
        wiseSayingList.add(wiseSaying);

        return lastWiseSayingId;
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언");
        for (int i = wiseSayingList.size() - 1; i >= 0; i--){
           WiseSaying wiseSaying = wiseSayingList.get(i);
            System.out.println(wiseSaying.getId() + " / "+wiseSaying.getAuthor() + " / " +wiseSaying.getContent() );
//dd
        }
    }
}
