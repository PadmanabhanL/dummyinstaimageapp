package com.app.bo;

import java.io.File;
import java.util.UUID;

public class Attachment {

    private String attachmentId;

    private String fileUrl;

    private byte[] fileContent;

    public Attachment() {
        this.attachmentId = UUID.randomUUID().toString();
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
