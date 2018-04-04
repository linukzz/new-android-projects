package bear.coding.drinkcalorie;

/**
 * Created by 이민석 on 2018-03-04.
 */

public class listview {

       private int img;
       private String Content;

    public listview(int img, String Content) {
        this.img = img;
        this.Content = Content;
    }

    public int getimg() {
        return img;
    }

    public void setimg(int img) {
        this.img = img;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }
}
