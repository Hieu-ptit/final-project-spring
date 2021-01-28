package com.example.demo.models.in;

import java.time.LocalDateTime;

public class DiaryRequest {

    private String title;

    private String content;

    private LocalDateTime createAt;

    private boolean statusFavorite;

    private boolean status;

    private String modifiedAt;

    private int idUser;

    public boolean isStatusFavorite() {
        return statusFavorite;
    }

    public void setStatusFavorite(boolean statusFavorite) {
        this.statusFavorite = statusFavorite;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
