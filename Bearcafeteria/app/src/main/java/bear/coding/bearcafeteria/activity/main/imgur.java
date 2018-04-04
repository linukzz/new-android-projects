package bear.coding.bearcafeteria.activity.main;

/**
 * Created by ho on 2016-11-18.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bear.coding.bearcafeteria.R;


public class imgur
        extends AppCompatActivity
{
    public void archivea(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.imgur.com/account/archivea/albums")));
    }

    public void archiveb(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.imgur.com/account/archiveb/albums")));
    }

    public void archivec(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.imgur.com/account/archivec/albums")));
    }

    public void fufufu(View paramView)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.imgur.com/account/fufufuu01/albums")));
    }

    protected void onCreate(Bundle paramBundle)
    {
        super.onCreate(paramBundle);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.imgur);
    }
}