package hwajunghighschool.deb.kim;

import hwajunghighschool.deb.kim.bap.Bap;
import hwajunghighschool.deb.kim.noti.timenoti;
import hwajunghighschool.deb.kim.rss.InfoRSSActivity;
import hwajunghighschool.deb.kim.schedule.Schedule;
import hwajunghighschool.deb.kim.song.Song;
import hwajunghighschool.deb.kim.timetable.TimeTableGrade;
import hwajunghighschool.deb.kim.timetable.TimeTableScrollTab;

import java.util.Calendar;

import hwajunghighschool.deb.kim.R;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.tistory.whdghks913.croutonhelper.CroutonHelper;

import de.keyboardsurfer.android.widget.crouton.Style;

public class MainActivity extends SherlockActivity {

	private ListView mListView;
	private ListViewAdapter mAdapter;

	private CroutonHelper mHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mListView = (ListView) findViewById(R.id.mList);

		mAdapter = new ListViewAdapter(this);
		mListView.setAdapter(mAdapter);

		Resources mRes = getResources();
		
		mAdapter.addItem(mRes.getDrawable(R.drawable.bap), "�޽�", "���� ������ �޽���?");
		mAdapter.addItem(mRes.getDrawable(R.drawable.timetable), "�ð�ǥ",
				"�б� �ð�ǥ�� Ȯ���մϴ�");
		mAdapter.addItem(mRes.getDrawable(R.drawable.calender), "����",
				"�б��� ������ Ȯ�� �� �� �ֽ��ϴ�");
		mAdapter.addItem(mRes.getDrawable(R.drawable.song), "����",
				"�츮 �б� ���� Ȯ���ϱ�");
		mAdapter.addItem(mRes.getDrawable(R.drawable.call), "����ó", "�б��� ��ȭ�ϱ�");
		

		mListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// ListData mData = mAdapter.mListData.get(position);

				if (position == 0) {
					// �޽�
					startActivity(new Intent(MainActivity.this, Bap.class));
				} else if (position == 1) {
					// �ð�ǥ
					SharedPreferences mPref = PreferenceManager
							.getDefaultSharedPreferences(MainActivity.this);

					if (mPref.getBoolean("YourGradeClass", false)) {
						Intent mIntent = new Intent(MainActivity.this,
								TimeTableScrollTab.class);
						mIntent.putExtra("Grade", mPref.getInt("YourGrade", 1));
						mIntent.putExtra("WClass", mPref.getInt("YourClass", 2));
						startActivity(mIntent);

					} else {
						startActivity(new Intent(MainActivity.this,
								TimeTableGrade.class));
					}
				} else if (position == 2) {
					// ����
					toast();
			

				} else if (position == 3) {
					// ����
					startActivity(new Intent(MainActivity.this, Song.class));
				} else if (position == 4) {
					// ����ó
					startActivity(new Intent(MainActivity.this, Call.class));
				}
			}
		});

		String userName = PreferenceManager.getDefaultSharedPreferences(this)
				.getString("userName", null);

		mHelper = new CroutonHelper(this);

		if (userName == null || "".equals(userName))
			mHelper.setText("ȯ���մϴ�~!");
		else
			mHelper.setText(userName + "�� ȯ���մϴ�~!");

		mHelper.setStyle(Style.INFO);
		mHelper.show();

		try {
			final SharedPreferences mPref = PreferenceManager
					.getDefaultSharedPreferences(this);

			PackageManager packageManager = this.getPackageManager();
			PackageInfo infor = packageManager.getPackageInfo(getPackageName(),
					PackageManager.GET_META_DATA);
			final int code = infor.versionCode;

			if (mPref.getInt("versionCode", 0) != code) {
				AlertDialog.Builder alert = new AlertDialog.Builder(this);
				alert.setTitle(R.string.update_app);
				alert.setPositiveButton(R.string.OK,
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								mPref.edit().putInt("versionCode", code)
										.commit();
								dialog.dismiss();
							}
						});
				alert.setMessage(R.string.changeLog);
				alert.show();
				
			}
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		MenuInflater inflater = getSupportMenuInflater();
		inflater.inflate(R.menu.main, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int ItemId = item.getItemId();

		// if (ItemId == R.id.info) {
		// startActivity(new Intent(this, MadeBy.class));
		// } else
		if (ItemId == R.id.setting) {
			startActivity(new Intent(this, SettingsActivity.class));
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onPause() {
		super.onPause();

		mHelper.cencle(true);
	}
	public void toast(){
		mHelper.setText("�߰��� �����Դϴ�!");
		mHelper.setStyle(Style.INFO);
		mHelper.show();
	}
	 
}