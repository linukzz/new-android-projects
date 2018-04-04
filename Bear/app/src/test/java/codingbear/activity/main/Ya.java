package codingbear.activity.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bear.coding.bear.R;


/**
 * Created by ho on 2016-11-25.
 */
public class Ya
        extends AppCompatActivity


{
    public void anih(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://ani24.net/")));
    }

    public void anitoday(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://ani.today/")));
    }


    public void cosplay(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.cosplayhentai.com/")));
    }

    public void fuq(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://fuq.com/")));
    }

    public void google(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://Google.co.jp/")));
    }

    public void helven(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://hellven.net/")));
    }

    public void hitomila(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://hitomi.la")));
    }

    public void img(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://waifu2x.udp.jp/")));
    }

    public void imgur(View paramView)
    {
        startActivity(new Intent(getApplicationContext(), imgur.class));
    }

    public void issuekor(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://issuekor.tistory.com/30")));
    }

    public void madpeople(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://madpeople.net/")));
    }

    public void midorisoo(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://blog.naver.com/midorisoo/220365552399")));
    }

    public void moeni(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://moeni.net/")));
    }

    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.ya);
    }


    public void pinaya(View paramView)
    {

        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://pinaya.center/")));

    }

    public void poopeegirls(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://poopeegirls.com")));
    }

    public void rainymood(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.rainymood.com/")));
    }

    public void rezero(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://naver.me/FbWdytOm")));
    }

    public void tonini(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.toonini.com/")));
    }
}
