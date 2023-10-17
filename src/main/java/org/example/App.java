package org.example;

import org.example.systemcontroller.SystemController;
import org.example.wisesaying.controller.WiseSayingController;

public class App {

    public void run() {
        WiseSayingController wiseSayingController = new WiseSayingController();
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.printf("명령) ");
            String command = Container.getSc().nextLine().trim();

            if (command.equals("종료")) {
                new SystemController().exit();
                break;
            }

            if (command.equals("등록")) {
                wiseSayingController.write();
            }


        }
    }
}
