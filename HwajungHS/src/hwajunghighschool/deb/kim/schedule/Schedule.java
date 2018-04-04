package hwajunghighschool.deb.kim.schedule;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import hwajunghighschool.deb.kim.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.tistory.whdghks913.croutonhelper.CroutonHelper;

import de.keyboardsurfer.android.widget.crouton.Style;

public class Schedule extends Activity {

	private ArrayList<Item> mItem = new ArrayList<Item>();
	private ListView mListview;
	private CroutonHelper mHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.schedule_listview);

		mListview = (ListView) findViewById(R.id.mListView);
		mListview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> av, View view, int position,
					long ld) {
				EntryItem mEntryItem = (EntryItem) mItem.get(position);
				SimpleDateFormat sdFormat = new SimpleDateFormat(
						"yyyy.MM.dd (E)", Locale.KOREA);
				Calendar mCalendar = Calendar.getInstance();

				try {
					mCalendar.setTime(sdFormat.parse(mEntryItem.mSummary));
				} catch (ParseException e) {
					e.printStackTrace();
				}

				getTime(mCalendar.get(Calendar.YEAR),
						mCalendar.get(Calendar.MONTH),
						mCalendar.get(Calendar.DAY_OF_MONTH));
			}
		});

		
		mItem.add(new SectionItem("2014년 11월 일정"));
		mItem.add(new EntryItem("화정과학자대회, 모의UN대회 결선(5~6교시)", "2014.11.05 (수)"));
		mItem.add(new EntryItem("과학논문인증대회", "2014.11.07 (금)"));
		mItem.add(new EntryItem("대학 수학 능력 시험 (수능)", "2014.11.13 (목)"));
		mItem.add(new EntryItem("Book Concert 오리엔테이션", "2014.11.14 (금)"));
		mItem.add(new EntryItem("제2학기 지필평가(3학년)", "2014.11.17 (월)"));
		mItem.add(new EntryItem("제2학기 지필평가(3학년) / 전국 연합 학력 평가 (1, 2학년)",
				"2014.11.18 (화)"));
		mItem.add(new EntryItem("제2학기 지필평가(3학년)", "2014.11.19 (수)"));
		mItem.add(new EntryItem("제2학기 지필평가(3학년)", "2014.11.20 (목)"));
		mItem.add(new EntryItem("제2학기 지필평가(3학년) / 과학포트폴리오경진대회", "2014.11.21 (금)"));
		mItem.add(new EntryItem("화정 한마당 / 동아리활동(8시간)", "2014.11.21 (금)"));

		mItem.add(new SectionItem("2014년 12월 일정"));
		mItem.add(new EntryItem("문항 교차점검", "2014.12.05 (금)"));
		mItem.add(new EntryItem("제2학기 지필평가(1,2학년)", "2014.12.15 (월)"));
		mItem.add(new EntryItem("제2학기 지필평가(1,2학년)", "2014.12.16 (화)"));
		mItem.add(new EntryItem("제2학기 지필평가(1,2학년)", "2014.12.17 (수)"));
		mItem.add(new EntryItem("제2학기 지필평가(1,2학년)", "2014.12.18 (목)"));
		mItem.add(new EntryItem("영어토론대회 예선 / 진로포트폴리오 경진대회", "2014.12.19 (금)"));
		mItem.add(new EntryItem("영어토론대회 결선", "2014.12.22 (월)"));
		mItem.add(new EntryItem("성탄절", "2014.12.25 (목)"));
		mItem.add(new EntryItem("발명아이디어경진대회 마감", "2014.12.26 (금)"));
		mItem.add(new EntryItem("화정고 소식지 '꽃우물' 발간 및 배부", "2014.12.29 (월)"));
		mItem.add(new EntryItem("동계 방학식", "2014.12.31 (수)", true));

		mItem.add(new SectionItem("2015년 1월 일정"));
		mItem.add(new EntryItem("신정", "2015.01.01 (목)", true));
		mItem.add(new EntryItem("겨울방학 영어회화캠프 시작일", "2015.01.12 (월)"));
		mItem.add(new EntryItem("겨울방학 영어회화캠프 끝일", "2015.01.23 (금)"));

		mItem.add(new SectionItem("2015년 2월 일정"));
		mItem.add(new EntryItem("개학식", "2015.02.02 (월)"));
		mItem.add(new EntryItem("졸업식", "2015.02.10 (화)", true));
		mItem.add(new EntryItem("종업식", "2015.02.11 (수)", true));
		mItem.add(new EntryItem("설날 연휴", "2015.02.18 (수)", true));
		mItem.add(new EntryItem("설날", "2015.02.19 (목)", true));
		mItem.add(new EntryItem("설날 연휴", "2015.02.20 (금)", true));

		EntryAdapter adapter = new EntryAdapter(this, mItem);
		mListview.setAdapter(adapter);

		mHelper = new CroutonHelper(this);
	}

	private void getTime(int year, int month, int day) {
		Calendar myTime = Calendar.getInstance();

		long nowTime = myTime.getTimeInMillis();
		myTime.set(year, month, day);
		long touchTime = myTime.getTimeInMillis();

		long diff = (touchTime - nowTime);

		boolean isPast = false;
		if (diff < 0) {
			diff = -diff;
			isPast = true;
		}

		int diffInt = (int) (diff /= 24 * 60 * 60 * 1000);

		String Text;
		if (isPast)
			Text = "선택하신 날짜는 " + diffInt + "일전 날짜입니다";
		else
			Text = "선택하신 날짜까지 " + diffInt + "일 남았습니다";

		mHelper.clearCroutonsForActivity();
		mHelper.setText(Text);
		mHelper.setStyle(Style.INFO);
		mHelper.show();
	}

	public interface Item {
		public boolean isSection();
	}
}