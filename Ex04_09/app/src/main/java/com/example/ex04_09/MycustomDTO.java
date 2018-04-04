package com.example.ex04_09;

/**
 * Created by 이민석 on 2018-01-11.
 */

public class MycustomDTO {

    String title;
    String content;
    int imgIcon;

    public MycustomDTO(String title, String content, int imgIcon) {
        this.title = title;
        this.content = content;
        this.imgIcon = imgIcon;
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

    public void setContent()
    {
        this.content = content;

    }

    public int getImgIcon() {
        return imgIcon;

    }

    public void setImgIcon(int imgIcon) {
        this.imgIcon = imgIcon;

    }


}
