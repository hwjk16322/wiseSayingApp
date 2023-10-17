package org.example.wisesaying.controller;

import org.example.App;
import org.example.Container;
import org.example.wisesaying.service.WiseSayingService;

public class WiseSayingController {

    WiseSayingService wiseSayingService = new WiseSayingService();

    public void write(){
        System.out.print("명언 : ");
        String content = Container.getSc().nextLine().trim();
        System.out.print("작가 : ");
        String author = Container.getSc().nextLine().trim();
        int id = wiseSayingService.write(content,author);
        System.out.println(id + "번 명언이 등록되었습니다.");


    }
}
