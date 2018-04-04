package bugil.bada.bugilapp;


import java.util.Calendar;

import bugil.bada.bugilapp.bap.Bap;
import bugil.bada.bugilapp.intro.Intro;
import bugil.bada.bugilapp.noti.timenoti;
import bugil.bada.bugilapp.schedule.Schedule;
import bugil.bada.bugilapp.timetable.TimeTableGrade;
import bugil.bada.bugilapp.timetable.TimeTableScrollTab;
import bugil.bada.bugilapp.R;
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
		
		mAdapter.addItem(mRes.getDrawable(R.drawable.bugil), "�б��ȳ�", "���ϰ��� ������� ��������");
		mAdapter.addItem(mRes.getDrawable(R.drawable.notice), "��������", "���ϰ��� ���ο� �ҽ��� �����ݴϴ�.");
		mAdapter.addItem(mRes.getDrawable(R.drawable.meal), "�޽ľȳ�", "���� ������ �޽���?");
		mAdapter.addItem(mRes.getDrawable(R.drawable.time), "�ð�ǥ",
				"�б� �ð�ǥ�� Ȯ���մϴ�");
		mAdapter.addItem(mRes.getDrawable(R.drawable.club), "���Ƹ�", "���ϰ��� � ���Ƹ��� �������?");
		mAdapter.addItem(mRes.getDrawable(R.drawable.calendar), "�л�����",
				"�б��� ������ Ȯ�� �� �� �ֽ��ϴ�");
		mAdapter.addItem(mRes.getDrawable(R.drawable.intro), "���оȳ�", "���ϰ� ���������� �˷��帳�ϴ�.");
		mAdapter.addItem(mRes.getDrawable(R.drawable.cafe), "����ī��", "Ŭ���� ���ϰ� ����ī��� �̵��մϴ�.");
		mAdapter.addItem(mRes.getDrawable(R.drawable.road), "���ô� ��",
				"���ϰ��� ��ġ�� �˷��帳�ϴ�.");
		mAdapter.addItem(mRes.getDrawable(R.drawable.calling), "����ó", "�б��� ��ȭ�ϱ�");
		

		mListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// ListData mData = mAdapter.mListData.get(position);

				if (position == 0) {
					// �б� �ȳ�
					startActivity(new Intent(MainActivity.this, Intro.class));
				} else if (position == 1) {
				//��������
					startActivity(new Intent(MainActivity.this, Notice.class));
				} else if (position == 2) {
					// �޽�
					startActivity(new Intent(MainActivity.this, Bap.class));
				} else if (position == 3) {
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
					//toast();
				} else if (position == 4) {
					// ���Ƹ�
					startActivity(new Intent(MainActivity.this, Club.class));
				} else if (position == 5) {
				//�л�����
					startActivity(new Intent(MainActivity.this, Schedule.class));
				} else if (position == 6) {
				//���оȳ�
					startActivity(new Intent(MainActivity.this, Welcome.class));
				} else if (position == 7) {
				//����ī��
					startActivity(new Intent(MainActivity.this, Cafe.class));
				} else if (position == 8) {
				//���ô� ��
					startActivity(new Intent(MainActivity.this, Road.class));
				} else if (position == 9) {
				//����ó
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
		mHelper.setText("�߰� �����Դϴ�!");
		mHelper.setStyle(Style.INFO);
		mHelper.show();
	}
	 
}
