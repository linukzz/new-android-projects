package bear.coding.storefoodcalories;

import android.widget.ImageView;

/**
 * Created by 이민석 on 2018-03-04.
 */

public class listView {

    int img;
    String txt;
    String txt2;

    public listView(int img, String txt, String txt2) {
        this.img = img;
        this.txt =  txt;
        this.txt2 = txt2;
    }

    public int getimg() {
       return img;
    }
    public void setimg(int img) {
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }
}
