package com.fininfra.youtube;

public class Video {
    private String userId;
    private String id;
    private String name;
    private String content;

    public Video(String id, String name, String content, String userId) {
        this.userId = userId;
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getUserId() {
        return userId;
    }
}
