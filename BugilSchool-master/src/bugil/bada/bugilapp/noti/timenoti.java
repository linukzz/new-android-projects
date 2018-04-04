package bugil.bada.bugilapp.noti;


import java.util.Calendar;

import bugil.bada.bugilapp.bap.Bap;
import bugil.bada.bugilapp.timetable.TimeTableGrade;
import bugil.bada.bugilapp.timetable.TimeTableScrollTab;

import bugil.bada.bugilapp.R;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;

import android.app.Service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.preference.PreferenceManager;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
public class timenoti extends Service {

	private SharedPreferences pref;

	private Calendar calendar;
	private NotificationManager manager;
	private Notification notification = null;
	private PendingIntent intent2, intent3;
	public String dbName = "HwaJungHS.db", tableName = "hwajunghs";
	private int Grade;
	private int WClass;
	private String str;

	public static SQLiteDatabase mSQDB;
	public final String mFilePath = Environment.getExternalStorageDirectory()
			.getAbsolutePath() + "/HwaJungHS/";

	int cal;
	int time;

	@Override
	public void onCreate() {

		super.onCreate();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		calendar = Calendar.getInstance();
		String[] subject = new String[8];

		cal = calendar.get(Calendar.DAY_OF_WEEK);
		time = calendar.get(Calendar.HOUR_OF_DAY);
		// intent = new Intent(this, Bap.class);
		mSQDB = SQLiteDatabase.openDatabase(mFilePath + dbName, null,
				SQLiteDatabase.OPEN_READWRITE);
		String SQL = "select * from " + tableName;
		Cursor mCursor = mSQDB.rawQuery(SQL, null);

		manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		intent2 = PendingIntent.getActivity(getApplicationContext(), 0,
				new Intent(timenoti.this, TimeTableGrade.class), 0);
		intent3 = PendingIntent.getService(getApplicationContext(), 0,
				new Intent(timenoti.this, timenoti.class), 0);

		pref = PreferenceManager.getDefaultSharedPreferences(this);
		WClass = pref.getInt("YourClass", 0);
		Grade = pref.getInt("YourGrade", 0);

		for (int i = 1; i <= 7; i++) {
			if (cal == 1 || cal == 2 || cal ==7) {
				mCursor.moveToPosition((0 * 7) + i);
			} else {
				mCursor.moveToPosition(((cal - 2) * 7) + i);
			}
			if (Grade == 1) {
				subject[i] = mCursor.getString((WClass * 2) - 2);
				if(subject[i].equals("")){
					subject[1] = "�ð�ǥ�ǿ���";
					subject[2] = "�б��� ����";
					subject[3] = "�������ּ���!";
				}

			} else if (Grade == 2) {
				subject[i] = mCursor.getString(22 + (WClass * 2));
				if(subject[i].equals("")){
					subject[1] = "�ð�ǥ�ǿ���";
					subject[2] = "�б��� ����";
					subject[3] = "�������ּ���!";
				}

			} else {
				subject[i] = mCursor.getString(47 + WClass);
				if(subject[i].equals("")){
					subject[1] = "�ð�ǥ�ǿ���";
					subject[2] = "�б��� ����";
					subject[3] = "�������ּ���!";
				}

			}

			if (cal == 2 ||cal ==7||cal==1 || cal==0) {
				str = "������";
			} else if (cal == 3) {
				str = "ȭ����";
			} else if (cal == 4) {
				str = "������";
			} else if (cal == 5) {
				str = "�����";
			} else if (cal == 6) {
				str = "�ݿ���";
			}

		}

		notification = new Notification.InboxStyle(new Notification.Builder(
				getApplicationContext())
				.setContentTitle(str + " �ð�ǥ �Դϴ�!").setContentIntent(intent2)
				.setContentText("��� Ȯ���ϼ���!")
				.setSmallIcon(R.drawable.timetable).addAction(R.drawable.timetable, "���ΰ�ħ", intent3)
				.setLargeIcon(
						BitmapFactory.decodeResource(getResources(),
								R.drawable.timetable))
								.setOngoing(true)
				.setTicker(str + "�ð�ǥ �Դϴ�!"))
		
		.addLine("1���� " + subject[1]).addLine("2���� " + subject[2])
				.addLine("3���� " + subject[3]).addLine("4���� " + subject[4])
				.addLine("5���� " + subject[5]).addLine("6���� " + subject[6])
				.addLine("7���� " + subject[7])
				.build();
		manager.notify(3249, notification);
		return startId;

	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	@Override
	public IBinder onBind(Intent arg0) {

		return null;

	}

}