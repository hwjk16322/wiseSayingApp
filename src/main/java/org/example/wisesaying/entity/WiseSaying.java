package org.example.wisesaying.entity;

public class WiseSaying {
    private int id;
    private String author;
    private String content;

    public WiseSaying(int id, String content, String author) {
        this.author = author;
        this.id = id;
        this.content = content;

    }

    public int getId() {
        return this.id;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getContent(){
        return this.content;
    }


}
