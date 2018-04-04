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

		
		mItem.add(new SectionItem("2014�� 11�� ����"));
		mItem.add(new EntryItem("ȭ�������ڴ�ȸ, ����UN��ȸ �ἱ(5~6����)", "2014.11.05 (��)"));
		mItem.add(new EntryItem("���г�������ȸ", "2014.11.07 (��)"));
		mItem.add(new EntryItem("���� ���� �ɷ� ���� (����)", "2014.11.13 (��)"));
		mItem.add(new EntryItem("Book Concert ���������̼�", "2014.11.14 (��)"));
		mItem.add(new EntryItem("��2�б� ������(3�г�)", "2014.11.17 (��)"));
		mItem.add(new EntryItem("��2�б� ������(3�г�) / ���� ���� �з� �� (1, 2�г�)",
				"2014.11.18 (ȭ)"));
		mItem.add(new EntryItem("��2�б� ������(3�г�)", "2014.11.19 (��)"));
		mItem.add(new EntryItem("��2�б� ������(3�г�)", "2014.11.20 (��)"));
		mItem.add(new EntryItem("��2�б� ������(3�г�) / ������Ʈ������������ȸ", "2014.11.21 (��)"));
		mItem.add(new EntryItem("ȭ�� �Ѹ��� / ���Ƹ�Ȱ��(8�ð�)", "2014.11.21 (��)"));

		mItem.add(new SectionItem("2014�� 12�� ����"));
		mItem.add(new EntryItem("���� ��������", "2014.12.05 (��)"));
		mItem.add(new EntryItem("��2�б� ������(1,2�г�)", "2014.12.15 (��)"));
		mItem.add(new EntryItem("��2�б� ������(1,2�г�)", "2014.12.16 (ȭ)"));
		mItem.add(new EntryItem("��2�б� ������(1,2�г�)", "2014.12.17 (��)"));
		mItem.add(new EntryItem("��2�б� ������(1,2�г�)", "2014.12.18 (��)"));
		mItem.add(new EntryItem("������д�ȸ ���� / ������Ʈ������ ������ȸ", "2014.12.19 (��)"));
		mItem.add(new EntryItem("������д�ȸ �ἱ", "2014.12.22 (��)"));
		mItem.add(new EntryItem("��ź��", "2014.12.25 (��)"));
		mItem.add(new EntryItem("�߸���̵�������ȸ ����", "2014.12.26 (��)"));
		mItem.add(new EntryItem("ȭ���� �ҽ��� '�ɿ칰' �߰� �� ���", "2014.12.29 (��)"));
		mItem.add(new EntryItem("���� ���н�", "2014.12.31 (��)", true));

		mItem.add(new SectionItem("2015�� 1�� ����"));
		mItem.add(new EntryItem("����", "2015.01.01 (��)", true));
		mItem.add(new EntryItem("�ܿ���� ����ȸȭķ�� ������", "2015.01.12 (��)"));
		mItem.add(new EntryItem("�ܿ���� ����ȸȭķ�� ����", "2015.01.23 (��)"));

		mItem.add(new SectionItem("2015�� 2�� ����"));
		mItem.add(new EntryItem("���н�", "2015.02.02 (��)"));
		mItem.add(new EntryItem("������", "2015.02.10 (ȭ)", true));
		mItem.add(new EntryItem("������", "2015.02.11 (��)", true));
		mItem.add(new EntryItem("���� ����", "2015.02.18 (��)", true));
		mItem.add(new EntryItem("����", "2015.02.19 (��)", true));
		mItem.add(new EntryItem("���� ����", "2015.02.20 (��)", true));

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
			Text = "�����Ͻ� ��¥�� " + diffInt + "���� ��¥�Դϴ�";
		else
			Text = "�����Ͻ� ��¥���� " + diffInt + "�� ���ҽ��ϴ�";

		mHelper.clearCroutonsForActivity();
		mHelper.setText(Text);
		mHelper.setStyle(Style.INFO);
		mHelper.show();
	}

	public interface Item {
		public boolean isSection();
	}
}