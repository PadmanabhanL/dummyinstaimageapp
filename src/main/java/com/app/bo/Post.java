package com.app.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Post {

    private String postId;

    private int userId;

    private List<String> captions;

    List<Attachment> attachments = new ArrayList<>();

    public Post() {
        this.postId = UUID.randomUUID().toString();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String> getCaptions() {
        return captions;
    }

    public void setCaptions(List<String> captions) {
        this.captions = captions;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }
}
