package hwajunghighschool.deb.kim;

import hwajunghighschool.deb.kim.R;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.tistory.whdghks913.croutonhelper.CroutonHelper;

import de.keyboardsurfer.android.widget.crouton.Style;

public class Call extends Activity {

	private ListView mListView;
	private ListViewAdapter mAdapter;
	private String fax = "031-968-0184";

	private CroutonHelper mHelper;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
			ActionBar actionBar = getActionBar();
			actionBar.setHomeButtonEnabled(true);
			actionBar.setDisplayHomeAsUpEnabled(true);
		}

		mListView = (ListView) findViewById(R.id.mListView);

		mAdapter = new ListViewAdapter(this);
		mListView.setAdapter(mAdapter);

		mListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				String call = mAdapter.mListData.get(position).mText;
				if(call.equals(fax)){
					
					mHelper.setText("팩스 번호로는 전화 할 수 없습니다!");
					mHelper.setStyle(Style.INFO);
					mHelper.show();
				}else{
				try {
					
					startActivity(new Intent(Intent.ACTION_VIEW, Uri
							.parse("tel:" + call)));
				} catch (Exception e) {

				}
			}}
		});

		mAdapter.addItem(null, "교무실 (대표전화)", "031-930-0195");
		mAdapter.addItem(null, "팩스", fax);
		mAdapter.addItem(null, "행정실", "031-930-0607");

		mHelper = new CroutonHelper(this);
		mHelper.setText(R.string.call_info);
		mHelper.setStyle(Style.INFO);
		mHelper.setAutoTouchCencle(true);
		mHelper.show();
	}

	@Override
	protected void onPause() {
		super.onPause();

		mHelper.cencle(true);
	}
}
