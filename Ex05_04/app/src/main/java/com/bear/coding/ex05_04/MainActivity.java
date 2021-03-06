package com.bear.coding.ex05_04;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void normal(View v) {

        NotificationManager manager = (NotificationManager)getSystemService
                (Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(getApplicationContext());
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(),
                android.R.drawable.ic_input_add));
        builder.setSmallIcon(android.R.drawable.ic_input_delete);
        builder.setContentTitle("내용타이틀");
        builder.setContentText("내용입니다");

        //새로운 화면 설정 코드
        Intent intent = new Intent( getApplicationContext(), getClass() );
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack( getClass());
        stackBuilder.addNextIntent( intent );
        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(0 , PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent( resultPendingIntent);
        builder.setAutoCancel( true );

        manager.notify(1, builder.build());

    }

}
